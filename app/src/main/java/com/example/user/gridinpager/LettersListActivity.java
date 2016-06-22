package com.example.user.gridinpager;

import android.support.v4.app.Fragment;

/**
 * Created by User on 27.04.2016.
 */
public class LettersListActivity extends SingleFragmentActivity {
    //select this activity class as Main launcher
    protected Fragment createFrag(){
        return new LettersListFragment();
    }


}
