package cn.bmob.sms;

import android.app.Application;

import cn.bmob.v3.Bmob;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Bmob.initialize(this,"Your Application ID");
    }
}
