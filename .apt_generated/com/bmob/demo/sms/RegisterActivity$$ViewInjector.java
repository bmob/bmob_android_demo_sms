// Generated code from Butter Knife. Do not modify!
package com.bmob.demo.sms;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class RegisterActivity$$ViewInjector<T extends com.bmob.demo.sms.RegisterActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230725, "field 'et_password'");
    target.et_password = finder.castView(view, 2131230725, "field 'et_password'");
    view = finder.findRequiredView(source, 2131230740, "field 'tv_title'");
    target.tv_title = finder.castView(view, 2131230740, "field 'tv_title'");
    view = finder.findRequiredView(source, 2131230724, "field 'et_account'");
    target.et_account = finder.castView(view, 2131230724, "field 'et_account'");
    view = finder.findRequiredView(source, 2131230735, "field 'et_pwd_again'");
    target.et_pwd_again = finder.castView(view, 2131230735, "field 'et_pwd_again'");
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
  }

  @Override public void reset(T target) {
    target.et_password = null;
    target.tv_title = null;
    target.et_account = null;
    target.et_pwd_again = null;
    target.iv_left = null;
    target.btn_register = null;
  }
}
