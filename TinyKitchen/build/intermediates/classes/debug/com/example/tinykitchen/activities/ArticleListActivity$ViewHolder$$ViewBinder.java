// Generated code from Butter Knife. Do not modify!
package com.example.tinykitchen.activities;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ArticleListActivity$ViewHolder$$ViewBinder<T extends com.example.tinykitchen.activities.ArticleListActivity.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131361916, "field 'thumbnailView'");
    target.thumbnailView = finder.castView(view, 2131361916, "field 'thumbnailView'");
    view = finder.findRequiredView(source, 2131361911, "field 'titleView'");
    target.titleView = finder.castView(view, 2131361911, "field 'titleView'");
    view = finder.findRequiredView(source, 2131361917, "field 'subtitleView'");
    target.subtitleView = finder.castView(view, 2131361917, "field 'subtitleView'");
  }

  @Override public void unbind(T target) {
    target.thumbnailView = null;
    target.titleView = null;
    target.subtitleView = null;
  }
}
