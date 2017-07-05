package com.example.seongyungo.jordan_chat_app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class Main_Activity extends FragmentActivity implements OnClickListener {


    private int Num_pages = 3;   //최대 페이지수

    private final static int FRAGMENT_PAGE1 = 0;
    private final static int FRAGMENT_PAGE2 = 1;
    private final static int FRAGMENT_PAGE3 = 2;

    ViewPager mViewPager;  //뷰페이져를 지칭할 변수수

    Button page_num_btn_1, page_num_btn_2, page_num_btn_3;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

       //ViewPager를 검색하고 어댑터를 연결해주고 첫페이지를 선정해줌줌
       mViewPager = (ViewPager)findViewById(R.id.pager);
       mViewPager.setAdapter(new pagerAdapter(getSupportFragmentManager()));
       mViewPager.setCurrentItem(FRAGMENT_PAGE1);

       page_num_btn_1 = (Button)findViewById(R.id.page_num_btn_1);
       page_num_btn_1.setOnClickListener(this);

       page_num_btn_2 = (Button)findViewById(R.id.page_num_btn_2);
       page_num_btn_2.setOnClickListener(this);

       page_num_btn_3 = (Button)findViewById(R.id.page_num_btn_3);
       page_num_btn_3.setOnClickListener(this);


   }

    //FragmentPagerAdapter : Fragment로써 각각 페이지를 어떻게 보여줄지 정의
    private class pagerAdapter extends FragmentPagerAdapter{
        public pagerAdapter(android.support.v4.app.FragmentManager fm){
            super(fm);
        }

        //특정 위치에 맞는 Fragment를 불러옴 몇번째 화면에 어떤 Fragment가 올지 정해줌


        @Override
        public Fragment getItem(int position) {

            switch(position){
                case FRAGMENT_PAGE1:
                    return new Home_Activity();

                case FRAGMENT_PAGE2:
                    return new Community_Activity();

                case FRAGMENT_PAGE3:
                    return new Appinfo_Activity();

                default:
                    return null;

            }


        }


        //생성 가능한 페이지 갯수를 반환

        @Override
        public int getCount() {
            return Num_pages;
        }
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.page_num_btn_1:
                mViewPager.setCurrentItem(FRAGMENT_PAGE1);
                break;

            case R.id.page_num_btn_2:
                mViewPager.setCurrentItem(FRAGMENT_PAGE2);
                break;

            case R.id.page_num_btn_3:
                mViewPager.setCurrentItem(FRAGMENT_PAGE3);
                break;
        }

        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                page_num_btn_1.setSelected(false);
                page_num_btn_2.setSelected(false);
                page_num_btn_3.setSelected(false);

                switch (position){
                    case 0:
                        page_num_btn_1.setSelected(true);
                        break;

                    case 1:
                        page_num_btn_2.setSelected(true);
                        break;

                    case 2:
                        page_num_btn_3.setSelected(true);
                        break;


                }

            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

            page_num_btn_1.setSelected(true);
    }
}
