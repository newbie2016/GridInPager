package com.example.user.gridinpager;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import java.util.UUID;

public class MainActivity extends SingleFragmentActivity {


   //new code
    private static final String MAIN_ID="frommain";

    //new code
    public static Intent extraId(Context context, UUID id){
        Intent intent=new Intent(context, MainActivity.class);
        intent.putExtra(MAIN_ID, id);

        return intent;

    }

    protected Fragment createFrag(){
  //      return new FragmentSecondPage();



        //new code
       UUID id=(UUID)getIntent().getSerializableExtra(MAIN_ID);
       return FragmentSecondPage.extraId(id);


    }





}