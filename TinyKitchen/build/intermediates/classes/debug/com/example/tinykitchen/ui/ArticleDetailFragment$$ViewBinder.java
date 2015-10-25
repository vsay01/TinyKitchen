// Generated code from Butter Knife. Do not modify!
package com.example.tinykitchen.ui;

import android.content.res.Resources;
import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ArticleDetailFragment$$ViewBinder<T extends com.example.tinykitchen.ui.ArticleDetailFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361907, "field 'mScrollView'");
    target.mScrollView = finder.castView(view, 2131361907, "field 'mScrollView'");
    view = finder.findRequiredView(source, 2131361906, "field 'mDrawInsetsFrameLayout'");
    target.mDrawInsetsFrameLayout = finder.castView(view, 2131361906, "field 'mDrawInsetsFrameLayout'");
    view = finder.findRequiredView(source, 2131361908, "field 'mPhotoContainerView'");
    target.mPhotoContainerView = view;
    view = finder.findRequiredView(source, 2131361909, "field 'mPhotoView'");
    target.mPhotoView = finder.castView(view, 2131361909, "field 'mPhotoView'");
    view = finder.findRequiredView(source, 2131361911, "field 'titleView'");
    target.titleView = finder.castView(view, 2131361911, "field 'titleView'");
    view = finder.findRequiredView(source, 2131361912, "field 'bylineView'");
    target.bylineView = finder.castView(view, 2131361912, "field 'bylineView'");
    view = finder.findRequiredView(source, 2131361913, "field 'bodyView'");
    target.bodyView = finder.castView(view, 2131361913, "field 'bodyView'");
    view = finder.findRequiredView(source, 2131361914, "field 'footerView'");
    target.footerView = finder.castView(view, 2131361914, "field 'footerView'");
    Resources res = finder.getContext(source).getResources();
    target.mIsCard = res.getBoolean(2131099655);
    target.mMutedColor = res.getColor(2131165234);
    target.mStatusBarFullOpacityBottom = res.getDimensionPixelSize(2131230818);
    target.app_name = res.getString(2131492886);
    target.action_share = res.getString(2131492885);
  }

  @Override public void unbind(T target) {
    target.mScrollView = null;
    target.mDrawInsetsFrameLayout = null;
    target.mPhotoContainerView = null;
    target.mPhotoView = null;
    target.titleView = null;
    target.bylineView = null;
    target.bodyView = null;
    target.footerView = null;
  }
}
