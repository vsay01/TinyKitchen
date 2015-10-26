package com.example.tinykitchen.service;

import android.app.IntentService;
import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.RemoteException;
import android.text.format.Time;
import android.util.Log;

import com.example.tinykitchen.data.ItemsContract;
import com.example.tinykitchen.models.Article;
import com.example.tinykitchen.utils.Config;
import com.example.tinykitchen.api.RemoteEndpointUtil;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class UpdaterService extends IntentService {
    private static final String TAG = "UpdaterService";

    public static final String BROADCAST_ACTION_STATE_CHANGE
            = "com.example.tintykitchen.intent.action.STATE_CHANGE";
    public static final String EXTRA_REFRESHING
            = "com.example.tintykitchen.intent.extra.REFRESHING";

    public UpdaterService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Time time = new Time();

        ConnectivityManager cm = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo ni = cm.getActiveNetworkInfo();
        if (ni == null || !ni.isConnected()) {
            Log.w(TAG, "Not online, not refreshing.");
            return;
        }

        sendStickyBroadcast(
                new Intent(BROADCAST_ACTION_STATE_CHANGE).putExtra(EXTRA_REFRESHING, true));

        // Don't even inspect the intent, we only do one thing, and that's fetch content.
        ArrayList<ContentProviderOperation> cpo = new ArrayList<ContentProviderOperation>();

        Uri dirUri = ItemsContract.Items.buildDirUri();

        // Delete all items
        cpo.add(ContentProviderOperation.newDelete(dirUri).build());

        try {
            JSONArray array = RemoteEndpointUtil.fetchJsonArray();
            if (array == null) {
                throw new JSONException("Invalid parsed item array" );
            }

            for (int i = 0; i < array.length(); i++) {
                ContentValues values = new ContentValues();
                JSONObject object = array.getJSONObject(i);

                Article article = new Article(
                        object.getString("id" ),
                        object.getString("author" ),
                        object.getString("title" ),
                        object.getString("body" ),
                        object.getString("thumb" ),
                        object.getString("photo" ),
                        object.getString("published_date" ),
                        object.getString("article_references" )
                );

                values.put(ItemsContract.Items.SERVER_ID, article.getId());
                values.put(ItemsContract.Items.AUTHOR, article.getAuthor());
                values.put(ItemsContract.Items.TITLE, article.getTitle());
                values.put(ItemsContract.Items.BODY, article.getBody());
                values.put(ItemsContract.Items.THUMB_URL, Config.HOST_URL + article.getThumb());
                //Log.e(TAG, Config.HOST_URL+object.getString("thumb"));
                //Log.e(TAG, Config.HOST_URL+object.getString("photo" ));
                values.put(ItemsContract.Items.PHOTO_URL, Config.HOST_URL+article.getPhoto());
                time.parse3339(article.getPublished_date());
                values.put(ItemsContract.Items.PUBLISHED_DATE, time.toMillis(false));
                values.put(ItemsContract.Items.ARTICLE_REFERENCE, article.getArticle_references());
                cpo.add(ContentProviderOperation.newInsert(dirUri).withValues(values).build());
            }

            getContentResolver().applyBatch(ItemsContract.CONTENT_AUTHORITY, cpo);

        } catch (JSONException | RemoteException | OperationApplicationException e) {
            Log.e(TAG, "Error updating content.", e);
        }

        sendStickyBroadcast(
                new Intent(BROADCAST_ACTION_STATE_CHANGE).putExtra(EXTRA_REFRESHING, false));
    }
}
