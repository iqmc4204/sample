package com.example.seongyungo.jordan_community_app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by seongyungo on 2016. 3. 2..
 */
public class Main_Activity extends AppCompatActivity {

    TextView home_tv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);


        btn = (Button)findViewById(R.id.btn);
        home_tv=(TextView)findViewById(R.id.home_tv);

    }
}
