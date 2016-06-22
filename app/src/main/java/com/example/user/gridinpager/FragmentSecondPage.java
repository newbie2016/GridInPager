package com.example.user.gridinpager;

import android.graphics.drawable.GradientDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.UUID;

/**
 * Created by User on 27.04.2016.
 */
public class FragmentSecondPage extends Fragment{
    private Letters fromLetters;
    Button buttonforLetter,soundButton;
    Button buttonforImage;
    TextView eng, kz;
    MediaPlayer mp;

    //new code

    private static final String EXTRA_ANOTHER_ID="letter_id";
   // private static final String ARG_ID="letter";

//new code
    public static FragmentSecondPage extraId(UUID id){
        Bundle args=new Bundle();
        args.putSerializable(EXTRA_ANOTHER_ID, id);

        FragmentSecondPage secondPage=new FragmentSecondPage();
        secondPage.setArguments(args);

        return secondPage;
    }

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //openning class Letters with object fromLetters
       // fromLetters=new Letters();
        //here we get ID from MainActivity

        //new code
        UUID myId=(UUID)getArguments().getSerializable(EXTRA_ANOTHER_ID);
        fromLetters=LetterSingleton.get(getActivity()).getOneLetter(myId);

    }

    //here we will set View xml file
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle savedInstanceState){
        View v=layoutInflater.inflate(R.layout.second_page_is_fragment, viewGroup, false);

        //here we have to bind widgets in xml file
        buttonforLetter=(Button)v.findViewById(R.id.buttonforLetter);
        buttonforImage=(Button)v.findViewById(R.id.buttonforImage);
        eng=(TextView)v.findViewById(R.id.engtext);
        kz=(TextView)v.findViewById(R.id.kztext);

        buttonforLetter.setText(fromLetters.getLetter());
        buttonforLetter.setBackgroundResource(R.drawable.button_shape);
        GradientDrawable gradientDrawable=(GradientDrawable)buttonforLetter.getBackground();
        gradientDrawable.setColor(fromLetters.getColor());

        buttonforImage.setBackgroundResource(fromLetters.getImage());

        kz.setText(fromLetters.getKazakh());
        eng.setText(fromLetters.getEnglish());

        
       // buttonforLetter=(Button)v.findViewById(R.id.soundbutton);
        buttonforLetter.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                stopPlaying();
                mp=MediaPlayer.create(getActivity(), fromLetters.getSound());
                mp.start();

}
        });
        buttonforImage.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                stopPlaying();
                mp=MediaPlayer.create(getActivity(), fromLetters.getSound());
                mp.start();

            }
        });
        return v;
    }

    public  void stopPlaying(){
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }

    }

    public void onDestroy() {
        super.onDestroy();
        //Log.d(TAG, "onDestroy: " + pageNumber);
    }
}
