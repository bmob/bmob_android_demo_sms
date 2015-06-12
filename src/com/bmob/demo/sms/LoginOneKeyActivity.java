package com.bmob.demo.sms;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.LogInListener;
import cn.bmob.v3.listener.RequestSMSCodeListener;

import com.bmob.demo.sms.bean.User;

/**
 * 一键登录
 * 
 * @class LoginPhoneActivity
 * @author smile
 * @date 2015-6-5 上午11:23:44
 * 
 */
public class LoginOneKeyActivity extends BaseActivity {

	MyCountTimer timer;
	@InjectView(R.id.iv_left)
	ImageView iv_left;
	@InjectView(R.id.tv_title)
	TextView tv_title;
	@InjectView(R.id.et_phone)
	EditText et_phone;
	@InjectView(R.id.et_verify_code)
	EditText et_code;
	@InjectView(R.id.btn_send)
	Button btn_send;
	@InjectView(R.id.btn_login)
	Button btn_login;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_onekey);
		ButterKnife.inject(this);
		iv_left.setVisibility(View.VISIBLE);
		tv_title.setText("手机号码一键登录");
	}

	class MyCountTimer extends CountDownTimer{  
		  
        public MyCountTimer(long millisInFuture, long countDownInterval) {  
            super(millisInFuture, countDownInterval);  
        }  
		@Override  
        public void onTick(long millisUntilFinished) {  
            btn_send.setText((millisUntilFinished / 1000) +"秒后重发");  
        }  
        @Override  
        public void onFinish() {  
        	btn_send.setText("重新发送验证码");  
        }  
    }  
	
	@OnClick(R.id.iv_left)
	public void back(View view) {
		finish();
	}

	@OnClick(R.id.btn_login)
	public void login(View view) {
		oneKeyLogin();
	}

	@OnClick(R.id.btn_send)
	public void sendCode(View view) {
		requestSMSCode();
	}

	private void requestSMSCode() {
		String number = et_phone.getText().toString();
		if (!TextUtils.isEmpty(number)) {
			timer = new MyCountTimer(60000, 1000);   
			timer.start();   
			Bmob.requestSMSCode(this, number,"一键注册或登录模板", new RequestSMSCodeListener() {

				@Override
				public void done(Integer smsId, BmobException ex) {
					// TODO Auto-generated method stub
					if (ex == null) {// 验证码发送成功
						toast("验证码发送成功");// 用于查询本次短信发送详情
					}else{
						timer.cancel();
					}
				}
			});
		} else {
			toast("请输入手机号码");
		}
	}

	/**
	 * 一键登录操作
	 * 
	 * @method login
	 * @return void
	 * @exception
	 */
	private void oneKeyLogin() {
		final String phone = et_phone.getText().toString();
		final String code = et_code.getText().toString();

		if (TextUtils.isEmpty(phone)) {
			showToast("手机号码不能为空");
			return;
		}

		if (TextUtils.isEmpty(code)) {
			showToast("验证码不能为空");
			return;
		}
		final ProgressDialog progress = new ProgressDialog(LoginOneKeyActivity.this);
		progress.setMessage("正在验证短信验证码...");
		progress.setCanceledOnTouchOutside(false);
		progress.show();
		// V3.3.9提供的一键注册或登录方式，可传手机号码和验证码
		BmobUser.signOrLoginByMobilePhone(LoginOneKeyActivity.this,phone, code, new LogInListener<User>() {

			@Override
			public void done(User user, BmobException ex) {
				// TODO Auto-generated method stub
				progress.dismiss();
				if(ex==null){
					toast("登录成功");
					Intent intent = new Intent(LoginOneKeyActivity.this,MainActivity.class);
					intent.putExtra("from", "loginonekey");
					startActivity(intent);
					finish();
				}else{
					toast("登录失败：code="+ex.getErrorCode()+"，错误描述："+ex.getLocalizedMessage());
				}
			}
		});
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		if(timer!=null){
			timer.cancel();
		}
	}
}
