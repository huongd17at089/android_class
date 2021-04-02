package com.example.android_class_2021.lession1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class demo_test extends AppCompatActivity {
//    private

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_test);
    }



    public void tinh(View v){
        TextView txt = findViewById(R.id.txt_test);
        EditText ed = findViewById(R.id.ed_test);
        int num = 1;
        try{
            num = Integer.parseInt(ed.getText().toString());
        }catch (NumberFormatException ex){
            System.out.println(ex);
        }

        double s = Math.PI*num*num;
        txt.setText(s + "");
    }
}