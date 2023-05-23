package cn.bmob.sms.activity.user;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import cn.bmob.sms.R;
import cn.bmob.v3.BmobUser;

/**
 * Created on 18/9/26 09:52
 * TODO 用户登录后首页
 * @author zhangchaozhou
 */
public class UserMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_main);
    }

    public void toResetPassword(View view) {
        startActivity(new Intent(this,UserResetPasswordActivity.class));
    }

    public void toResetSms(View view) {
        startActivity(new Intent(this,UserResetSmsActivity.class));
    }

    public void toBind(View view) {
        startActivity(new Intent(this,UserBindActivity.class));
    }

    public void toUnBind(View view) {
        startActivity(new Intent(this,UserUnBindActivity.class));
    }

    public void onExit(View view) {
        BmobUser.logOut();
        finish();
    }
}
