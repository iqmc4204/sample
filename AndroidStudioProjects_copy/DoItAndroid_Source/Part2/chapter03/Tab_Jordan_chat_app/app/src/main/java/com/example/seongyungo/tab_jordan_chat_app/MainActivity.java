package com.example.seongyungo.tab_jordan_chat_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button join_us_btn;
    Button cancle_btn;
    Button start_btn;
    EditText login_id_edit;
    EditText login_passwd_edit;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        start_btn = (Button)findViewById(R.id.start_btn);
        join_us_btn = (Button)findViewById(R.id.join_us_btn);
        cancle_btn = (Button)findViewById(R.id.cancle_btn);

        login_id_edit = (EditText)findViewById(R.id.login_id_edit);
        login_passwd_edit = (EditText)findViewById(R.id.login_passwd_edit);



        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent().setClass(MainActivity.this, TabActivity.class);
                startActivity(intent);
            }
        });



        join_us_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent().setClass(MainActivity.this, Joinus_Activity.class);
                startActivity(intent);
            }
        });


        cancle_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });





    }
}
