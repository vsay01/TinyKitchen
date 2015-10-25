// Generated code from Butter Knife. Do not modify!
package com.example.tinykitchen.ui;

import android.content.res.Resources;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ArticleDetailActivity$$ViewBinder<T extends com.example.tinykitchen.ui.ArticleDetailActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    Resources res = finder.getContext(source).getResources();
    target.primary_dark = res.getColor(2131165249);
    target.primary = res.getColor(2131165248);
  }

  @Override public void unbind(T target) {
  }
}
