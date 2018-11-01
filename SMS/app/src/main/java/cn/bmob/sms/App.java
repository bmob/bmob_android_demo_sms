package cn.bmob.sms;

import android.app.Application;

import cn.bmob.v3.Bmob;

/**
 * Created on 18/9/25 10:42
 *
 * @author zhangchaozhou
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Bmob.initialize(this,"49b9ed429b19a20987669c88dc576345");
    }
}
