package com.example.alphabets;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements AlphabetListFragment.MyListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    private void loadFragment(int i) {
        //เรียกผ่าน เมทอดที่สร้างFragment
        AlphabetFragment frag = AlphabetFragment.newInstance(i);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.fragment_container, frag);
        transaction.commit();
    }
    //โค็ดที่เข้าถึงFrameLayout ด้านขวา ส่งมาจาก AlphabetListFragment
    @Override
    public void onAlphaberListItemClckd(int position) {
        if(findViewById(R.id.fragment_container) == null) {
            //หน้าจอแนวตั้งมีเฉพาะ List
            Intent i = new Intent(MainActivity.this,DetailActivity.class);
            i.putExtra("alphabet_index", position);
            startActivity(i);
        }
        else{
            //หน้าจอแนวนอนมีทั้ง List และ Detail
            loadFragment(position);
        }
    }
}
