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
public class Community_Activity extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedIntanceState){

        RelativeLayout layout = (RelativeLayout)inflater.inflate(R.layout.community_activity, container, false);


        Button comm_btn = (Button)layout.findViewById(R.id.comm_btn);
        comm_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getActivity(), "커뮤니티 엑티비티 버튼 클릭", Toast.LENGTH_SHORT).show();
                Log.d("Tag", "커뮤니티 버튼 클릭");
            }
        });


        return layout;
    }


}
