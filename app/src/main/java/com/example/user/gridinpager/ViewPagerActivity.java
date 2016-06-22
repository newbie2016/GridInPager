package com.example.user.gridinpager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import java.util.List;
import java.util.UUID;

/**
 * Created by User on 29.04.2016.
 */
public class ViewPagerActivity extends FragmentActivity {

    private static final String EXTRA_ID="nomer";

    //creating viewpager and List to use get position
    private ViewPager viewPager;
    private List<Letters> viewpagerList;

    //retreiving id
    public static Intent extraId(Context context, UUID someid){
        Intent intent=new Intent(context, ViewPagerActivity.class);
        intent.putExtra(EXTRA_ID, someid);
        return intent;
    }

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager_layout);

        //id from NewIntent above
        UUID anotherid=(UUID)getIntent().getSerializableExtra(EXTRA_ID);


        viewPager=(ViewPager)findViewById(R.id.viewpager);
        //wth following doing???????
        viewpagerList=LetterSingleton.get(this).getLetters();

        FragmentManager fragmentManager=getSupportFragmentManager();
        viewPager.setAdapter(new FragmentStatePagerAdapter(fragmentManager) {


            @Override
            public Fragment getItem(int position) {
                Letters letters=viewpagerList.get(position);

                return FragmentSecondPage.extraId(letters.getId());
            }



            @Override
            public int getCount() {
                return viewpagerList.size();
            }


        });



        //without following code paging will show from the beginning
        for(int i=0; i<viewpagerList.size();i++){
            if(viewpagerList.get(i).getId().equals(anotherid)){
                viewPager.setCurrentItem(i);
                break;
            }
        }






    }
}
