package com.example.seongyungo.jordan_community_app;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class Tab_Activity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_activity);

        TabHost tabhost1 = getTabHost();
        TabHost tabhost2 = getTabHost();
        TabHost tabhost3 = getTabHost();
        TabHost tabhost4 = getTabHost();

        TabHost.TabSpec spec;
        Intent intent;
        Resources res = getResources();


        intent = new Intent().setClass(this, Main_Activity.class);
        spec = tabhost1.newTabSpec("main");
        spec.setIndicator("홈");
        spec.setContent(intent);
        tabhost1.addTab(spec);



        intent = new Intent().setClass(this, Community_Activity.class);
        spec = tabhost2.newTabSpec("main");
        spec.setIndicator("커뮤니티");
        spec.setContent(intent);
        tabhost2.addTab(spec);



        intent = new Intent().setClass(this, My_Profile_Activity.class);
        spec = tabhost3.newTabSpec("main");
        spec.setIndicator("내프로필");
        spec.setContent(intent);
        tabhost3.addTab(spec);


        intent = new Intent().setClass(this, Info_App_Activity.class);
        spec = tabhost4.newTabSpec("main");
        spec.setIndicator("앱정보");
        spec.setContent(intent);
        tabhost4.addTab(spec);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_login_, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int id = item.getItemId();
        if(id == R.id.action_settings){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
