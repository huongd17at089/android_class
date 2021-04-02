package com.example.android_class_2021.lession1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class lession4_demo3 extends AppCompatActivity {

    private ListView listView;
    private String[] list;
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lession2_login);
        initView();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = adapter.getItem(position);
                Toast.makeText(lession4_demo3.this, "your select" + item, Toast.LENGTH_LONG).show();
            }
        });
    }

    private void initView() {
        listView = findViewById(R.id.listView);
        list = getResources().getStringArray(R.array.tech);
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, list);
        listView.setAdapter(adapter);

    }
}
