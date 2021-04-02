package com.example.android_class_2021.lession1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class lession4_demo7 extends AppCompatActivity {
    private AutoCompleteTextView  one;
    private MultiAutoCompleteTextView many;
    private String[] ds = {"ha noi", "ha giang", "thai binh", "thai nguyen"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lession4_demo7);
        one = findViewById(R.id.autoCompleteTextView);
        many = findViewById(R.id.many);
        one.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item, ds));
        many.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item, ds));
        many.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}