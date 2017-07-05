package com.example.seongyungo.jordan_chat_app;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.support.v4.app.Fragment;
/**
 * Created by seongyungo on 2016. 3. 8..
 */
public class Appinfo_Activity extends Fragment{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedIntanceState){

        RelativeLayout layout = (RelativeLayout)inflater.inflate(R.layout.appinfo_activity, container, false);


        Button app_btn = (Button)layout.findViewById(R.id.app_btn);
        app_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "앱정보 엑티비티 버튼 클릭", Toast.LENGTH_SHORT).show();
                Log.d("Tag", "앱정보 버튼 클릭");
            }
        });


        return layout;
    }

}
