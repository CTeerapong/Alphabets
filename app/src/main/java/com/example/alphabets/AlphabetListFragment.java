package com.example.alphabets;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.alphabets.model.EnglishAlphabet;

/**
 * Created by thanadej on 11/8/2015 AD.
 */
public class AlphabetListFragment extends ListFragment{

    interface  MyListener{
        public void onAlphaberListItemClckd(int position);
    }

    private MyListener listener;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<EnglishAlphabet> adapter = new ArrayAdapter<>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                EnglishAlphabet.DATA
        );
        // เอา adapter ที่สร้าง ใส่ลงไปใน listAdapter
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Toast.makeText(getActivity(), "Position: " + position, Toast.LENGTH_LONG).show();

        listener.onAlphaberListItemClckd(position);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        listener = (MyListener) context;
    }
}
