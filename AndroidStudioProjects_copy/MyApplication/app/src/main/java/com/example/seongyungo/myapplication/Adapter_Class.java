package com.example.seongyungo.myapplication;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by seongyungo on 2016. 3. 7..
 */
public class Adapter_Class extends Activity {

    Activity act = this;

    GridView gridView;

//이미지 배열 선언

    ArrayList<Bitmap> picArr = new ArrayList<Bitmap>();

//텍스트 배열 선언

    ArrayList<String> textArr = new ArrayList<String>();


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);


        Bitmap bm1 = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);

        Bitmap bm2 = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);

        Bitmap bm3 = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);

        Bitmap bm4 = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);

        Bitmap bm5 = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);

        Bitmap bm6 = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);

        Bitmap bm7 = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);

        Bitmap bm8 = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);

        Bitmap bm9 = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);

        Bitmap bm10 = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);


        picArr.add(bm1);

        picArr.add(bm2);

        picArr.add(bm3);

        picArr.add(bm4);

        picArr.add(bm5);

        picArr.add(bm6);

        picArr.add(bm7);

        picArr.add(bm8);

        picArr.add(bm9);

        picArr.add(bm10);


        for (int i = 0; i < 10; i++) {

            textArr.add("숫자" + Integer.toString(i));

        }


        gridView = (GridView) findViewById(R.id.gridview);

        gridView.setAdapter(new gridAdapter());


    }


    public class gridAdapter extends BaseAdapter {

        LayoutInflater inflater;


        public gridAdapter() {

            inflater = (LayoutInflater) act.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        }


        @Override

        public int getCount() {

// TODO Auto-generated method stub

            return picArr.size();    //그리드뷰에 출력할 목록 수

        }


        @Override

        public Object getItem(int position) {

// TODO Auto-generated method stub

            return picArr.get(position);    //아이템을 호출할 때 사용하는 메소드

        }


        @Override

        public long getItemId(int position) {

// TODO Auto-generated method stub

            return position;    //아이템의 아이디를 구할 때 사용하는 메소드

        }


        @Override

        public View getView(int position, View convertView, ViewGroup parent) {

// TODO Auto-generated method stub

            if (convertView == null) {

                convertView = inflater.inflate(R.layout.homeitem, parent, false);

            }


            ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView1);

            TextView textView = (TextView) convertView.findViewById(R.id.textView1);


            imageView.setImageBitmap(picArr.get(position));

            textView.setText(textArr.get(position));


            imageView.setOnClickListener(new View.OnClickListener() {


                @Override

                public void onClick(View v) {

// TODO Auto-generated method stub

//이미지를 터치했을때 동작하는 곳

                }

            });


            return convertView;

        }
    }

}
