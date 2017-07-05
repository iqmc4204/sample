package com.example.seongyungo.tab_jordan_chat_app;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

/**
 * Created by seongyungo on 2016. 3. 15..
 */
public class TabActivity extends android.app.TabActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_activity);


        TabHost tabHost1 = getTabHost();
        TabHost tabHost2 = getTabHost();
        TabHost tabHost3 = getTabHost();
        TabHost tabHost4 = getTabHost();

        TabHost.TabSpec spec;
        Intent intent;
        Resources res = getResources();


        intent = new Intent().setClass(this,Home_Activity.class);
        spec = tabHost1.newTabSpec("Main");
        spec.setIndicator("홈");
        spec.setContent(intent);
        tabHost1.addTab(spec);

        intent = new Intent().setClass(this,Community_Activity.class);
        spec = tabHost2.newTabSpec("Comm");
        spec.setIndicator("커뮤니티");
        spec.setContent(intent);
        tabHost2.addTab(spec);

        intent = new Intent().setClass(this,Write_Activity.class);
        spec = tabHost3.newTabSpec("Write");
        spec.setIndicator("글쓰기");
        spec.setContent(intent);
        tabHost3.addTab(spec);

        intent = new Intent().setClass(this,AppInfo_Activity.class);
        spec = tabHost4.newTabSpec("AppInfo");
        spec.setIndicator("앱정보");
        spec.setContent(intent);
        tabHost4.addTab(spec);
/*
        tabHost1.getChildAt(0);
        tabHost1.setBackground(getResources().getDrawable(R.mipmap.ic_launcher));

        tabHost2.getChildAt(1);
        tabHost2.setBackground(getResources().getDrawable(R.mipmap.ic_launcher));

        tabHost3.getChildAt(2);
        tabHost3.setBackground(getResources().getDrawable(R.mipmap.ic_launcher));

        tabHost4.getChildAt(3);
        tabHost4.setBackground(getResources().getDrawable(R.mipmap.ic_launcher));


*/
    }
}
