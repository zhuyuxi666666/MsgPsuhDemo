package push.youmeng.example.com.msgpsuhdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.umeng.message.PushAgent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PushAgent.getInstance(getApplication()).onAppStart();
    }
}
