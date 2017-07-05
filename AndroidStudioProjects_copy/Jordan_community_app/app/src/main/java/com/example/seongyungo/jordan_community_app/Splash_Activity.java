package com.example.seongyungo.jordan_community_app;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;


/**
 * Created by seongyungo on 2016. 3. 2..
 */
public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);


        Handler handler = new Handler(){

            @Override
        public void handleMessage(Message msg){
                super.handleMessage(msg);


                Intent intent = new Intent(Splash_Activity.this, Login_Activity.class);
                startActivity(intent);
                finish();
            }
        };
        handler.sendEmptyMessageDelayed(0, 1000);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if((keyCode == KeyEvent.KEYCODE_BACK)){
            return false;

        }
        return super.onKeyDown(keyCode, event);
    }
}
