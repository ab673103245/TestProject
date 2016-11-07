package qianfeng.testproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("google-my:", "onCreate: 仅作git测试使用");
        Log.d("Log_frist", "onCreate: sdjklfdsjfldsjfds");
    }
}
