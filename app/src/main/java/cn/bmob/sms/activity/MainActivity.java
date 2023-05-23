package cn.bmob.sms.activity;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import java.util.List;

import cn.bmob.sms.CollectionList;
import cn.bmob.sms.R;
import cn.bmob.sms.activity.user.UserLoginPasswordActivity;
import cn.bmob.sms.activity.user.UserLoginSmsActivity;
import cn.bmob.sms.activity.user.UserSignUpOrLoginSmsActivity;
import cn.bmob.sms.activity.user.UserSignUpPasswordActivity;
import cn.bmob.sms.activity.user.UserSignUpPasswordAndSmsActivity;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;

/**
 * @author zhangchaozhou
 */
public class MainActivity extends AppCompatActivity {


    /**
     * 本案例主要功能
     * <p>
     * TODO 1、通常的短信验证：发送短信验证码->验证短信验证码->进行重要的用户操作。
     * <p>
     * TODO 2、用户名密码注册
     * <p>
     * TODO 3、手机号码注册或登录：发送短信验证码->验证短信验证码->若首次验证手机号码则进行注册并登录，若非首次验证手机号码则进行直接登录。
     * <p>
     * TODO 4、用户名密码注册的同时绑定手机号码：发送短信验证码->验证短信验证码->进行用户名密码注册并登录，同时进行绑定手机号码。
     * <p>
     * TODO 5、用户名密码登录。
     * <p>
     * TODO 6、短信验证码登录。
     * <p>
     * TODO 7、注册登录之后进行绑定或解绑手机号码：发送短信验证码->验证短信验证码->进行手机号码的绑定或解绑操作。
     * <p>
     * TODO 8、注册登录之后进行短信验证密码重置：发送短信验证码->验证短信验证码->进行密码重置。
     * <p>
     * TODO 9、注册登录之后进行原始密码重置。
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onTest(View view) {
        BmobQuery<CollectionList> bmobQuery = new BmobQuery<>();
        bmobQuery.findObjects(new FindListener<CollectionList>() {
            @Override
            public void done(List<CollectionList> list, BmobException e) {
                if (e==null){
                    Log.e("done",list==null?"null":list.size()+"");
                }else {
                    Log.e("error",e.getMessage());
                }
            }
        });
    }

    public void onNormal(View view) {
        startActivity(new Intent(this, NormalActivity.class));
    }

    public void onUserSignupPassword(View view) {
        startActivity(new Intent(this, UserSignUpPasswordActivity.class));
    }

    public void onSignupOrLoginSms(View view) {
        startActivity(new Intent(this, UserSignUpOrLoginSmsActivity.class));
    }

    public void onUserSignupPasswordAndSms(View view) {
        startActivity(new Intent(this, UserSignUpPasswordAndSmsActivity.class));
    }

    public void onUserLoginPassword(View view) {
        startActivity(new Intent(this, UserLoginPasswordActivity.class));
    }

    public void onUserLoginSms(View view) {
        startActivity(new Intent(this, UserLoginSmsActivity.class));
    }

}
