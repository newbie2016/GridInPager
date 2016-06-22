package com.example.user.gridinpager;

import java.util.UUID;

/**
 * Created by User on 27.04.2016.
 */
public class Letters {

    private UUID mId;
    private String mLetter;
    private int mImage;
    private int mSound;
    private int mColor;
    private String mEnglish, mKazakh;


    public Letters(){
        mId=UUID.randomUUID();
       // mLetter=l;
    }

    public UUID getId(){
        return mId;
    }
    //setter and getter for string letter like Aa Bb Cc
    public void setLetter(String letter){
        mLetter=letter;
    }
    public String getLetter(){
        return mLetter;
    }

    public void setImage(int image){
        mImage=image;
    }

    public int getImage(){
        return mImage;
    }

    public void setSound(int sound){
        mSound=sound;
    }
    public int getSound(){
        return mSound;
    }

    public void setColor(int color){
        mColor=color;
    }
    public int getColor(){
        return mColor;
    }

    public void setEnglish(String english){
        mEnglish=english;
      //  mKazakh=kazakh;
    }
    public String getEnglish() {
        return mEnglish;
    }
    public void setKazakh(String kazakh){
        mKazakh=kazakh;
    }
    public String getKazakh() {
        return mKazakh;
    }



}
