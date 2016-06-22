package com.example.user.gridinpager;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.List;
import java.util.UUID;

/**
 * Created by User on 27.04.2016.
 */
public class LettersListFragment extends Fragment {
    //here goes our List:adapter viewholders
    private RecyclerView recyclerView;
    private LetterAdapter letterAdapter;


    //here we will set View xml file
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle savedInstanceState){
        View v=layoutInflater.inflate(R.layout.recycler_view, viewGroup, false);


        //here we have to bind widgets in xml file
        recyclerView=(RecyclerView)v.findViewById(R.id.recyclerview);

        GridLayoutManager mLayoutManager = new GridLayoutManager(getActivity(),6);
        //mLayoutManager
          /*mLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup(){
          public int getSpanSize(int position){
                return position==8 ? 2 :1;
            }
        });
        */

        recyclerView.setLayoutManager(mLayoutManager);

      //  recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),6));




        updateIU();

        return v;

    }

    public void updateIU(){
        LetterSingleton letterSingleton=LetterSingleton.get(getActivity());
        List<Letters> crimes=letterSingleton.getLetters();

        letterAdapter=new LetterAdapter(crimes);
        recyclerView.setAdapter(letterAdapter);
    }

    public class LetterHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        Button buttonLetter;
        private Letters holderletters;


        //constructor of holder class
        public LetterHolder(View itemview){
            super(itemview);
            itemview.setOnClickListener(this);
            //here programmatically created button without xml file
            buttonLetter=(Button)itemview.findViewById(R.id.singleletter);
        }
        public void onClick(View v){
           // Toast.makeText(getActivity(), "Hello" + holderletters.getLetter(), Toast.LENGTH_SHORT).show();
           // Intent intent=new Intent(getActivity(), MainActivity.class);


            //new code
            Intent intent=ViewPagerActivity.extraId(getActivity(), holderletters.getId());

            startActivity(intent);
        }
        public void bindLetter(Letters letters){
            holderletters=letters;
            buttonLetter.setText(holderletters.getLetter());
            buttonLetter.setBackgroundResource(R.drawable.button_shape);


            GradientDrawable gradientDrawable=(GradientDrawable)buttonLetter.getBackground();
            gradientDrawable.setColor(holderletters.getColor());

           // buttonLetter.setBackgroundColor(holderletters.getColor());

        }

    }
    //here goes adapter subclass with List
    public class LetterAdapter extends RecyclerView.Adapter<LetterHolder>{
        private List<Letters> listfromLetters;

        public LetterAdapter(List<Letters> letterses){
            listfromLetters=letterses;
        }
        //the first method will inflate layout of item and calls only once to create thats it
        @Override
        public LetterHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater=LayoutInflater.from(getActivity());
            View view=layoutInflater.inflate(R.layout.list_item, parent, false);

            return new LetterHolder(view);
        }

        @Override
        public void onBindViewHolder(LetterHolder holder, int position) {
            //here goes datas which need to be bind
            Letters fromLetters=listfromLetters.get(position);
            //holder.buttonLetter.setText(fromLetters.getLetter());

            holder.bindLetter(fromLetters);

        }

        @Override
        public int getItemCount() {
            return listfromLetters.size();
        }
    }


}
