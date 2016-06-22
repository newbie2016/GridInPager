package com.example.user.gridinpager;

import android.content.Context;
import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by User on 27.04.2016.
 */
public class LetterSingleton {
    private static LetterSingleton sLetterSingleton;
    private List<Letters> mListLetters;

    public static LetterSingleton get(Context context) {
        if (sLetterSingleton == null) {
            sLetterSingleton = new LetterSingleton(context);

        }
        return sLetterSingleton;
    }

    //constructor with context parameters
    private LetterSingleton(Context context) {
        //here create array
        mListLetters = new ArrayList<>();

        Letters lettera=new Letters();
        lettera.setLetter("Aa");
        lettera.setImage(R.drawable.apple);
        lettera.setEnglish("Apple");
        lettera.setKazakh("Алма");
        lettera.setSound(R.raw.a);
        lettera.setSound(R.raw.apple);
        lettera.setColor(Color.parseColor("#CC0033"));
        mListLetters.add(lettera);

        Letters letterb=new Letters();
        letterb.setLetter("Bb");
        letterb.setImage(R.drawable.ball);
        letterb.setEnglish("Ball");
        letterb.setKazakh("Доп");
        letterb.setSound(R.raw.b);
        letterb.setColor(Color.parseColor("#d11947"));
        mListLetters.add(letterb);

        Letters letterc=new Letters();
        letterc.setLetter("Cc");
        letterc.setImage(R.drawable.cat);
        letterc.setEnglish("Cat");
        letterc.setKazakh("Мысық");
        letterc.setSound(R.raw.c);
        letterc.setColor(Color.parseColor("#d6325b"));
        mListLetters.add(letterc);

        Letters letterd=new Letters();
        letterd.setLetter("Dd");
        letterd.setImage(R.drawable.dog);
        letterd.setEnglish("Dog");
        letterd.setKazakh("Ит");
        letterd.setSound(R.raw.d);
        letterd.setColor(Color.parseColor("#db4c70"));
        mListLetters.add(letterd);

        Letters lettere=new Letters();
        lettere.setLetter("Ee");
        lettere.setImage(R.drawable.elephant);
        lettere.setEnglish("Elephant");
        lettere.setKazakh("Піл");
        lettere.setSound(R.raw.e);
        lettere.setColor(Color.parseColor("#e06684"));
        mListLetters.add(lettere);

        Letters letterf=new Letters();
        letterf.setLetter("Ff");
        letterf.setImage(R.drawable.fish);
        letterf.setEnglish("Fish");
        letterf.setKazakh("Балық");
        letterf.setSound(R.raw.f);
        letterf.setColor(Color.parseColor("#e57f99"));

        mListLetters.add(letterf);

        Letters letterg=new Letters();
        letterg.setLetter("Gg");
        letterg.setImage(R.drawable.giraffe);
        letterg.setEnglish("Giraffe");
        letterg.setKazakh("Керік");
        letterg.setSound(R.raw.g);
        letterg.setColor(Color.parseColor("#f9651f"));

        mListLetters.add(letterg);

        Letters letterh=new Letters();
        letterh.setLetter("Hh");
        letterh.setImage(R.drawable.house);
        letterh.setSound(R.raw.h);
        letterh.setEnglish("House");
        letterh.setKazakh("Үй");
        letterh.setColor(Color.parseColor("#f97435"));
        mListLetters.add(letterh);

        Letters letteri=new Letters();
        letteri.setLetter("Ii");
        letteri.setImage(R.drawable.icecream);
        letteri.setEnglish("Ice-cream");
        letteri.setKazakh("Балмұздақ");
        letteri.setSound(R.raw.i);
        letteri.setColor(Color.parseColor("#fa834b"));

        mListLetters.add(letteri);

        Letters letterj=new Letters();
        letterj.setLetter("Jj");
        letterj.setImage(R.drawable.juiceee);
        letterj.setEnglish("Juice");
        letterj.setKazakh("Шырын");
        letterj.setSound(R.raw.j);
        letterj.setColor(Color.parseColor("#fa9362"));

        mListLetters.add(letterj);

        Letters letterk=new Letters();
        letterk.setLetter("Kk");
        letterk.setImage(R.drawable.key);
        letterk.setEnglish("Key");
        letterk.setKazakh("Кілт");
        letterk.setSound(R.raw.k);
        letterk.setColor(Color.parseColor("#fcb28f"));
        mListLetters.add(letterk);

        Letters letterl=new Letters();
        letterl.setLetter("Ll");
        letterl.setImage(R.drawable.lion);
        letterl.setEnglish("Lion");
        letterl.setKazakh("Арыстан");
        letterl.setSound(R.raw.l);
        letterl.setColor(Color.parseColor("#fdc6a1"));
        mListLetters.add(letterl);

        Letters letterm=new Letters();
        letterm.setLetter("Mm");
        letterm.setImage(R.drawable.moon);
        letterm.setEnglish("Moon");
        letterm.setKazakh("Ай");
        letterm.setSound(R.raw.m);
        letterm.setColor(Color.parseColor("#048900"));

        mListLetters.add(letterm);

        Letters lettern=new Letters();
        lettern.setLetter("Nn");
        lettern.setImage(R.drawable.notes);
        lettern.setEnglish("Notes");
        lettern.setKazakh("Нота");
        lettern.setSound(R.raw.n);
        lettern.setColor(Color.parseColor("#1d9419"));

        mListLetters.add(lettern);

        Letters lettero=new Letters();
        lettero.setLetter("Oo");
        lettero.setImage(R.drawable.onion);
        lettero.setEnglish("Onion");
        lettero.setKazakh("Пияз");
        lettero.setSound(R.raw.o);
        lettero.setColor(Color.parseColor("#36a032"));
        mListLetters.add(lettero);

        Letters letterp=new Letters();
        letterp.setLetter("Pp");
        letterp.setImage(R.drawable.pumpkin);
        letterp.setEnglish("Pumpkin");
        letterp.setKazakh("Асқабақ");
        letterp.setSound(R.raw.p);
        letterp.setColor(Color.parseColor("#36a032"));
        mListLetters.add(letterp);

        Letters letterq=new Letters();
        letterq.setLetter("Qq");
        letterq.setImage(R.drawable.queens);
        letterq.setEnglish("Queen");
        letterq.setKazakh("Ханшайым");
        letterq.setSound(R.raw.q);
        letterq.setColor(Color.parseColor("#4fac4c"));
        mListLetters.add(letterq);

        Letters letterr=new Letters();
        letterr.setLetter("Rr");
        letterr.setImage(R.drawable.rainbow);
        letterr.setEnglish("Rainbow");
        letterr.setKazakh("Кемпірқосақ");
        letterr.setSound(R.raw.r);
        letterr.setColor(Color.parseColor("#68b866"));
        mListLetters.add(letterr);

        Letters letterss=new Letters();
        letterss.setLetter("Ss");
        letterss.setImage(R.drawable.sunflowerr);
        letterss.setEnglish("Sunflower");
        letterss.setKazakh("Күнбағыс");
        letterss.setSound(R.raw.s);
        letterss.setColor(Color.parseColor("#9acf99"));
        mListLetters.add(letterss);

        Letters lettert=new Letters();
        lettert.setLetter("Tt");
        lettert.setImage(R.drawable.turtlee);
        lettert.setEnglish("Turtle");
        lettert.setKazakh("Тасбақа");
        lettert.setSound(R.raw.t);
        lettert.setColor(Color.parseColor("#9a59a1"));
        mListLetters.add(lettert);

        Letters letteru=new Letters();
        letteru.setLetter("Uu");
        letteru.setImage(R.drawable.umbrella);
        letteru.setEnglish("Umbrella");
        letteru.setKazakh("Қолшатыр");
        letteru.setSound(R.raw.u);
        letteru.setColor(Color.parseColor("#a469aa"));
        mListLetters.add(letteru);

        Letters letterv=new Letters();
        letterv.setLetter("Vv");
        letterv.setImage(R.drawable.violin);
        letterv.setEnglish("Violin");
        letterv.setKazakh("Скрипка");
        letterv.setSound(R.raw.v);
        letterv.setColor(Color.parseColor("#ae7ab3"));
        mListLetters.add(letterv);

        Letters lettersw=new Letters();
        lettersw.setLetter("Ww");
        lettersw.setImage(R.drawable.watch);
        lettersw.setEnglish("Watch");
        lettersw.setKazakh("Қолсағат");
        lettersw.setSound(R.raw.w);
        lettersw.setColor(Color.parseColor("#c29bc6"));
        mListLetters.add(lettersw);

        Letters letterx=new Letters();
        letterx.setLetter("Xx");
        letterx.setImage(R.drawable.fox);
        letterx.setEnglish("foX");
        letterx.setKazakh("Түлкі");
        letterx.setSound(R.raw.x);
        letterx.setColor(Color.parseColor("#d6bcd9"));
        mListLetters.add(letterx);

        Letters lettery=new Letters();
        lettery.setLetter("Yy");
        lettery.setImage(R.drawable.yellow);
        lettery.setEnglish("Yellow");
        lettery.setKazakh("Сары");
        lettery.setSound(R.raw.y);
        lettery.setColor(Color.parseColor("#feff46"));
        mListLetters.add(lettery);

        Letters letterz=new Letters();
        letterz.setLetter("Zz");
        letterz.setImage(R.drawable.zero);
        letterz.setEnglish("Zero");
        letterz.setKazakh("Нөл");
        letterz.setSound(R.raw.z);
        letterz.setColor(Color.parseColor("#feff90"));
        mListLetters.add(letterz);






//        adapter.notifyDataSetChanged();


    }



    //here creating method which returns List
    public List<Letters> getLetters() {
        return mListLetters;
    }
    //here creating another method which will return id from Letter class
    public Letters getOneLetter(UUID uuid) {
        for (Letters letter : mListLetters) {
            if (letter.getId().equals(uuid)) {
                return letter;
            }
        }
    return null;
    }

}

