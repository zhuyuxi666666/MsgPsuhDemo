package push.youmeng.example.com.msgpsuhdemo;

import android.app.Application;

import com.umeng.message.IUmengRegisterCallback;
import com.umeng.message.PushAgent;

/**
 * Created by lenovo on 2017/12/11.
 */

public class ApplicationTest extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PushAgent mPushAgent = PushAgent.getInstance(this);
//注册推送服务，每次调用register方法都会回调该接口
        mPushAgent.register(new IUmengRegisterCallback() {

            @Override
            public void onSuccess(String deviceToken) {
                //注册成功会返回device token
            }

            @Override
            public void onFailure(String s, String s1) {

            }
        });
    }
}
