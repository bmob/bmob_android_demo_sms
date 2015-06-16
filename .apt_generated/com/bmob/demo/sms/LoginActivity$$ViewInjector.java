// Generated code from Butter Knife. Do not modify!
package com.bmob.demo.sms;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class LoginActivity$$ViewInjector<T extends com.bmob.demo.sms.LoginActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230728, "field 'btn_register' and method 'register'");
    target.btn_register = finder.castView(view, 2131230728, "field 'btn_register'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.register();
        }
      });
    view = finder.findRequiredView(source, 2131230738, "field 'iv_left' and method 'back'");
    target.iv_left = finder.castView(view, 2131230738, "field 'iv_left'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.back();
        }
      });
    view = finder.findRequiredView(source, 2131230726, "field 'btn_login' and method 'login'");
    target.btn_login = finder.castView(view, 2131230726, "field 'btn_login'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.login(p0);
        }
      });
    view = finder.findRequiredView(source, 2131230725, "field 'et_password'");
    target.et_password = finder.castView(view, 2131230725, "field 'et_password'");
    view = finder.findRequiredView(source, 2131230727, "field 'btn_onekey' and method 'oneKey'");
    target.btn_onekey = finder.castView(view, 2131230727, "field 'btn_onekey'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.oneKey();
        }
      });
    view = finder.findRequiredView(source, 2131230724, "field 'et_account'");
    target.et_account = finder.castView(view, 2131230724, "field 'et_account'");
  }

  @Override public void reset(T target) {
    target.btn_register = null;
    target.iv_left = null;
    target.btn_login = null;
    target.et_password = null;
    target.btn_onekey = null;
    target.et_account = null;
  }
}
