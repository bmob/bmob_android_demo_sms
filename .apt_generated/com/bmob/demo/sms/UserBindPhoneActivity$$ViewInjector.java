// Generated code from Butter Knife. Do not modify!
package com.bmob.demo.sms;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.Injector;

public class UserBindPhoneActivity$$ViewInjector<T extends com.bmob.demo.sms.UserBindPhoneActivity> implements Injector<T> {
  @Override public void inject(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131230740, "field 'tv_title'");
    target.tv_title = finder.castView(view, 2131230740, "field 'tv_title'");
    view = finder.findRequiredView(source, 2131230721, "field 'et_input'");
    target.et_input = finder.castView(view, 2131230721, "field 'et_input'");
    view = finder.findRequiredView(source, 2131230720, "field 'et_number'");
    target.et_number = finder.castView(view, 2131230720, "field 'et_number'");
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
    view = finder.findRequiredView(source, 2131230723, "field 'tv_bind' and method 'bind'");
    target.tv_bind = finder.castView(view, 2131230723, "field 'tv_bind'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.bind();
        }
      });
    view = finder.findRequiredView(source, 2131230722, "field 'tv_send' and method 'send'");
    target.tv_send = finder.castView(view, 2131230722, "field 'tv_send'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.send();
        }
      });
  }

  @Override public void reset(T target) {
    target.tv_title = null;
    target.et_input = null;
    target.et_number = null;
    target.iv_left = null;
    target.tv_bind = null;
    target.tv_send = null;
  }
}
