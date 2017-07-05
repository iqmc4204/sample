package com.example.seongyungo.tab_jordan_chat_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class Joinus_Activity extends AppCompatActivity {

    Button comfirm_id_btn;
    Button final_join_us_btn;
    Button join_us_cancle_btn;
    EditText join_us_id_edit;
    EditText join_us_passwd_edit;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joinus_activity);

        comfirm_id_btn = (Button)findViewById(R.id.confirm_id_btn);
        final_join_us_btn = (Button)findViewById(R.id.final_join_us_btn);
        join_us_cancle_btn = (Button)findViewById(R.id.join_us_cancle_btn);

        join_us_id_edit = (EditText)findViewById(R.id.join_us_id_edit);
        join_us_passwd_edit = (EditText)findViewById(R.id.joing_us_passwd_edit);



    }
}
