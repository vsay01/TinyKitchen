// Generated code from Butter Knife. Do not modify!
package com.example.tinykitchen.ui;

import android.content.res.Resources;
import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ArticleListActivity$$ViewBinder<T extends com.example.tinykitchen.ui.ArticleListActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361899, "field 'mToolbar'");
    target.mToolbar = finder.castView(view, 2131361899, "field 'mToolbar'");
    view = finder.findRequiredView(source, 2131361900, "field 'mSwipeRefreshLayout'");
    target.mSwipeRefreshLayout = finder.castView(view, 2131361900, "field 'mSwipeRefreshLayout'");
    view = finder.findRequiredView(source, 2131361901, "field 'mRecyclerView'");
    target.mRecyclerView = finder.castView(view, 2131361901, "field 'mRecyclerView'");
    view = finder.findRequiredView(source, 2131361898, "field 'appBarLayout'");
    target.appBarLayout = finder.castView(view, 2131361898, "field 'appBarLayout'");
    view = finder.findRequiredView(source, 2131361896, "field 'mDrawerLayout'");
    target.mDrawerLayout = finder.castView(view, 2131361896, "field 'mDrawerLayout'");
    view = finder.findRequiredView(source, 2131361902, "field 'navigationView'");
    target.navigationView = finder.castView(view, 2131361902, "field 'navigationView'");
    Resources res = finder.getContext(source).getResources();
    target.column_count = res.getInteger(2131427333);
  }

  @Override public void unbind(T target) {
    target.mToolbar = null;
    target.mSwipeRefreshLayout = null;
    target.mRecyclerView = null;
    target.appBarLayout = null;
    target.mDrawerLayout = null;
    target.navigationView = null;
  }
}
