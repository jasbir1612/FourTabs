package com.jasbir.fourtabs;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.gc.materialdesign.views.ButtonFlat;

public class MainActivity extends FragmentActivity {

    private ViewPager pager;
    private ButtonFlat btnnext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = (ViewPager) findViewById(R.id.pager);


        FragmentStatePagerAdapter adapter = new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {

                switch (position){
                    case 0: return new Activity1();
                    case 1: return new Activity2();
                    case 2: return new Activity3();

                    default:return null;

                }


            }

            @Override
            public int getCount() {
                return 3;
            }
        };

        pager.setAdapter(adapter);

    }


}
