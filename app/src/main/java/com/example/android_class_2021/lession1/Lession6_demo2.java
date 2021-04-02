package com.example.android_class_2021.lession1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Lession6_demo2 extends AppCompatActivity {
    FragmentManager m ;
    Button bta, btb, btc, bta1, btb1, btc1, btback, btpop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lession6_demo2);
        bta = findViewById(R.id.bta);
        btb = findViewById(R.id.btb);
        btc = findViewById(R.id.btc);
        btback = findViewById(R.id.btback);

        bta1 = findViewById(R.id.bta1);
        btb1 = findViewById(R.id.btb1);
        btc1 = findViewById(R.id.btc1);
        btpop = findViewById(R.id.btback1);

        m = getSupportFragmentManager() ;
    }

    public void adda(View view) {
        FragmentTransaction tf = m.beginTransaction();
        Fragment f = new lession6_fa();
        tf.replace(R.id.frame_demo2, f, "taga");
        tf.addToBackStack("taga");
        tf.commit();

    }

    public void addb(View view) {
        FragmentTransaction tf = m.beginTransaction();
        Fragment f = new lession6_fb();
        tf.replace(R.id.frame_demo2, f, "tagb");
        tf.addToBackStack("tagb");
        tf.commit();
    }

    public void addc(View view) {
        FragmentTransaction tf = m.beginTransaction();
        Fragment f = new Lession6_fc();
        tf.replace(R.id.frame_demo2, f, "tagc");
        tf.addToBackStack("tagc");
        tf.commit();
    }

    public void rma(View view) {
        FragmentTransaction tf = m.beginTransaction();
        Fragment f = (Fragment) getSupportFragmentManager().findFragmentByTag("taga");
        tf.remove(f);
        tf.commit();
    }

    public void rmb(View view) {
        FragmentTransaction tf = m.beginTransaction();
        Fragment f = (Fragment) getSupportFragmentManager().findFragmentByTag("tagb");
        tf.remove(f);
        tf.commit();
    }

    public void rmc(View view) {
        FragmentTransaction tf = m.beginTransaction();
        Fragment f = (Fragment) getSupportFragmentManager().findFragmentByTag("tagc");
        tf.remove(f);
        tf.commit();
    }

    public void back(View view) {
//        FragmentTransaction tf = m.beginTransaction();
//        Fragment f = (Fragment) getSupportFragmentManager().findFragmentByTag("taga");
//        tf.remove(f);
//        tf.commit();
        getSupportFragmentManager().popBackStack();
    }

    @Override
    public void onBackPressed() {
        if( getSupportFragmentManager().getBackStackEntryCount() > 0)
            getSupportFragmentManager().popBackStack();
        else
            super.onBackPressed();
    }

    public void popa(View view) {
        getSupportFragmentManager().popBackStack("taga", 0);
    }
}