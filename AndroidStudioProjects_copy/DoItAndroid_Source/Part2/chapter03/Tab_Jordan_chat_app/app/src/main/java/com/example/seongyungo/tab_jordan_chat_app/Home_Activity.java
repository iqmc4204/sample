package com.example.seongyungo.tab_jordan_chat_app;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by seongyungo on 2016. 3. 16..
 */
public class Home_Activity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);





        int img [] = {R.mipmap.ic_launcher,
                R.mipmap.ic_launcher };

        MyAdapter adapter = new MyAdapter(getApplicationContext(),img, R.layout.griditem);

        gridView = (GridView)findViewById(R.id.gridView);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });






    }

    }

  class MyAdapter extends BaseAdapter {
     int layout;
     int img[];
     Context context;
     LayoutInflater lnf;

     public MyAdapter(Context context, int img[], int layout) {
         this.context = context;
         this.layout = layout;
         this.img = img;
         lnf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
     }


     @Override
     public int getCount() {
         return img.length;
     }

     @Override
     public Object getItem(int position) {
         return null;
     }

     @Override
     public long getItemId(int position) {
         return position;
     }

     @Override
     public View getView(int position, View convertView, ViewGroup parent) {
         if (convertView == null) {
             convertView = lnf.inflate(layout, null);
             ImageView imageView = (ImageView) convertView.findViewById(R.id.imageview);
             imageView.setImageResource(img[position]);
         }
             return convertView;

     }
 }
