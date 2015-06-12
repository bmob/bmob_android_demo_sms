// Generated code from Butter Knife. Do not modify!
package com.bmob.demo.sms;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class MainActivity$$ViewInjector<T extends com.bmob.demo.sms.MainActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230734, "field 'btn_reset' and method 'resetPasswordByCode'");
    target.btn_reset = finder.castView(view, 2131230734, "field 'btn_reset'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.resetPasswordByCode(p0);
        }
      });
    view = finder.findRequiredView(source, 2131230732, "field 'tv_user'");
    target.tv_user = finder.castView(view, 2131230732, "field 'tv_user'");
    view = finder.findRequiredView(source, 2131230733, "field 'btn_bind' and method 'bind'");
    target.btn_bind = finder.castView(view, 2131230733, "field 'btn_bind'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.bind(p0);
        }
      });
    view = finder.findRequiredView(source, 2131230738, "field 'iv_left' and method 'back'");
    target.iv_left = finder.castView(view, 2131230738, "field 'iv_left'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.back(p0);
        }
      });
    view = finder.findRequiredView(source, 2131230740, "field 'tv_title'");
    target.tv_title = finder.castView(view, 2131230740, "field 'tv_title'");
  }

  @Override public void reset(T target) {
    target.btn_reset = null;
    target.tv_user = null;
    target.btn_bind = null;
    target.iv_left = null;
    target.tv_title = null;
  }
}
