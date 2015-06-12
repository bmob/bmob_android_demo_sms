package com.bmob.demo.sms;

import com.bmob.demo.sms.bean.User;

import cn.bmob.v3.BmobUser;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**  
 * 首页  
 * @class  MainActivity  
 * @author smile   
 * @date   2015-6-5 下午3:02:13  
 *   
 */
public class MainActivity extends Activity {

	@InjectView(R.id.iv_left)
	ImageView iv_left;
	@InjectView(R.id.tv_title)
	TextView tv_title;
	
	@InjectView(R.id.tv_user)
	TextView tv_user;
	
	@InjectView(R.id.btn_bind)
	Button btn_bind;
	@InjectView(R.id.btn_reset)
	Button btn_reset;
	String from;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.inject(this);
		from = getIntent().getStringExtra("from");
		if(from.equals("login")){
			btn_bind.setVisibility(View.VISIBLE);
		}else{
			btn_bind.setVisibility(View.GONE);
		}
		iv_left.setVisibility(View.VISIBLE);
		tv_title.setText("首页");
	}

	private void UpdateUser(){
		User user = BmobUser.getCurrentUser(this, User.class);
		//用户只有绑定过手机号或者用手机号注册登录过就可以直接通过手机号码来重置用户密码了，所以加下这个判断
		if(user!=null && user.getMobilePhoneNumberVerified()!=null && user.getMobilePhoneNumberVerified()){
			btn_reset.setVisibility(View.VISIBLE);
		}else{
			btn_reset.setVisibility(View.INVISIBLE);
		}
		tv_user.setText(user.getUsername()+"-"+user.getAge()+"-"+user.getMobilePhoneNumberVerified()+"-"+user.getMobilePhoneNumber());
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		UpdateUser();
	}
	
	@OnClick(R.id.iv_left)
	public void back(View view) {
		finish();
	}
	
	@OnClick(R.id.btn_bind)
	public void bind(View view) {
		startActivity(new Intent(this, UserBindPhoneActivity.class));
	}
	
	@OnClick(R.id.btn_reset)
	public void resetPasswordByCode(View view) {
		startActivity(new Intent(this, ResetPasswordActivity.class));
	}
}
