package com.example.alphabets;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alphabets.model.EnglishAlphabet;


/**
 * A simple {@link Fragment} subclass.
 */
public class AlphabetFragment extends Fragment {

    private int mAlphabetIndex;

    public AlphabetFragment() {
        // Required empty public constructor
    }
    public static AlphabetFragment newInstance(int alphabetIndex){
        AlphabetFragment fragment = new AlphabetFragment();
        //Bundle(putค่าชนิดไหนเข้าไปก็ได้) เอาไว้เก็บที่อยู่ alphabet โดยการใส่ค่าที่อยู่เข้าไป
        Bundle args = new Bundle();
        args.putInt("alphabet_index", alphabetIndex);
        fragment.setArguments(args);
        // fragment คืนค่าตัวอักษรที่อยู่ใน index นั้นไปให้
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mAlphabetIndex = getArguments().getInt("alphabet_index");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alphabet, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView tv =(TextView) view.findViewById(R.id.alphabet_textview);
        // .DATA[mAlphabetIndex]ดูว่าได้ array ช่องไหน .letter เพื่อดึงแต่ตัวอักษรใน array มา
        char letter = EnglishAlphabet.DATA[mAlphabetIndex].letter;
        tv.setText(String.valueOf(letter));

        ImageView iv = (ImageView) view.findViewById(R.id.imageView);
        int resId = EnglishAlphabet.DATA[mAlphabetIndex].image;
        iv.setImageResource(resId);
    }
}
