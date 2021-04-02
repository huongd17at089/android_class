package com.example.android_class_2021.lession1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lession6_demo1 extends AppCompatActivity {

    private FragmentManager m;
    private lession6_fa fa ;
    private lession6_fb fb;
    private Button bt1, bt2;
    private Fragment f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lession6_demo1);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        m = getSupportFragmentManager();
//        FragmentTransaction ft = m.beginTransaction();
//        FragmentTransaction add = ft.add(fa);
//        ft.commit();
        bt1.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = m.beginTransaction();
                f = new lession6_fa();
                ft.replace(R.id.frame, f, "taga");
                ft.addToBackStack("taga");
                ft.commit();

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = m.beginTransaction();
                f = new lession6_fb();
                ft.replace(R.id.frame, f, "tagb");
                ft.commit();

            }
        });
    }
}