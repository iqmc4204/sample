package com.example.seongyungo.jordan_chat_app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;

import java.util.ArrayList;

/**
 * Created by seongyungo on 2016. 3. 8..
 *
 *

 */





public class Home_Activity extends Fragment {

    ArrayList<String> myitems;
    ArrayAdapter<String> mon2;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedIntanceState){

        LinearLayout layout = (LinearLayout)inflater.inflate(R.layout.home_activity, container, false);


        myitems = new ArrayList<String>();
        mon2 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, myitems);


        GridView grid = (GridView)layout.findViewById(R.id.home_grid_view);
        grid.setAdapter(mon2);



        return layout;
    }



    }







