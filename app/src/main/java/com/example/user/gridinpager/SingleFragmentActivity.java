package com.example.user.gridinpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by User on 27.04.2016.
 */
public abstract class SingleFragmentActivity extends FragmentActivity {
    protected abstract Fragment createFrag();

    //copied from MainActivity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //when you use Support library you'll declare like SupportFragmentManager
        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.framelayout);

        //checking if null then open fragment class and within fragmentManager commit id of framelayout
        if (fragment == null) {
            fragment = createFrag();
            fragmentManager.beginTransaction().add(R.id.framelayout, fragment).commit();
        }
    }
    }
