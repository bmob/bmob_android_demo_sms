// Generated code from Butter Knife. Do not modify!
package com.bmob.demo.sms;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class ResetPasswordActivity$$ViewInjector<T extends com.bmob.demo.sms.ResetPasswordActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230736, "field 'et_pwd'");
    target.et_pwd = finder.castView(view, 2131230736, "field 'et_pwd'");
    view = finder.findRequiredView(source, 2131230729, "field 'et_phone'");
    target.et_phone = finder.castView(view, 2131230729, "field 'et_phone'");
    view = finder.findRequiredView(source, 2131230731, "field 'btn_send' and method 'sendCode'");
    target.btn_send = finder.castView(view, 2131230731, "field 'btn_send'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.sendCode(p0);
        }
      });
    view = finder.findRequiredView(source, 2131230730, "field 'et_code'");
    target.et_code = finder.castView(view, 2131230730, "field 'et_code'");
    view = finder.findRequiredView(source, 2131230734, "field 'btn_reset' and method 'reset'");
    target.btn_reset = finder.castView(view, 2131230734, "field 'btn_reset'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.reset(p0);
        }
      });
    view = finder.findRequiredView(source, 2131230740, "field 'tv_title'");
    target.tv_title = finder.castView(view, 2131230740, "field 'tv_title'");
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
  }

  @Override public void reset(T target) {
    target.et_pwd = null;
    target.et_phone = null;
    target.btn_send = null;
    target.et_code = null;
    target.btn_reset = null;
    target.tv_title = null;
    target.iv_left = null;
  }
}
