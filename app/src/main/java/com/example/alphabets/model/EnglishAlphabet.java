package com.example.alphabets.model;


import com.example.alphabets.R;

/**
 * Created by thanadej on 11/8/2015 AD.
 */
public class EnglishAlphabet {
    public final char letter;
    public final int image;

    public EnglishAlphabet(char letter, int image) {
        this.letter = letter;
        this.image = image;
    }

    @Override
    public String toString() {
        return String.valueOf(letter);
    }

    public static final EnglishAlphabet[] DATA = {
            new EnglishAlphabet('A', R.drawable.a),
            new EnglishAlphabet('B', R.drawable.b),
            new EnglishAlphabet('C', R.drawable.c),
            new EnglishAlphabet('D', R.drawable.d),
            new EnglishAlphabet('E', R.drawable.e),
            new EnglishAlphabet('F', R.drawable.f),
            new EnglishAlphabet('G', R.drawable.g),
            new EnglishAlphabet('H', R.drawable.h),
            new EnglishAlphabet('I', R.drawable.i),
            new EnglishAlphabet('J', R.drawable.j),
            new EnglishAlphabet('K', R.drawable.k),
            new EnglishAlphabet('L', R.drawable.l),
            new EnglishAlphabet('M', R.drawable.m),
            new EnglishAlphabet('N', R.drawable.n),
            new EnglishAlphabet('O', R.drawable.o),
            new EnglishAlphabet('P', R.drawable.p),
            new EnglishAlphabet('Q', R.drawable.q),
            new EnglishAlphabet('R', R.drawable.r),
            new EnglishAlphabet('S', R.drawable.s),
            new EnglishAlphabet('T', R.drawable.t),
            new EnglishAlphabet('U', R.drawable.u),
            new EnglishAlphabet('V', R.drawable.v),
            new EnglishAlphabet('W', R.drawable.w),
            new EnglishAlphabet('X', R.drawable.x),
            new EnglishAlphabet('Y', R.drawable.y),
            new EnglishAlphabet('Z', R.drawable.z)
    };

}
