package com.example.android_class_2021.lession1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class lession4_demo8 extends AppCompatActivity {
    private TextView txt;
    private Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lession4_demo8);
        txt = findViewById(R.id.txt_menu);
        bt = findViewById(R.id.btColor);
        registerForContextMenu(bt); // giu lau nut
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.mycontextmenu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_demo8, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.red:
                bt.setBackgroundColor(Color.RED);
                bt.setTextColor(Color.WHITE);
                break;
            case R.id.blue:
                bt.setBackgroundColor(Color.BLUE);
                break;
            case R.id.green:
                bt.setBackgroundColor(Color.GREEN);
                break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        //item = file , ex
        switch(item.getItemId()){
            case R.id.mFile:
                txt.setText("chon file");
                break;

            case R.id.phone:
                txt.setText("chon sdt");
                break;

            case R.id.email:
                txt.setText("chon email");
                break;
            case R.id.mEx:
                System.exit(0);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}