package com.example.android_class_2021.lession1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class lession4_demo4 extends AppCompatActivity {
    private ListView listView;
    private Integer[] img = {R.drawable.android_icon, R.drawable.android_icon, R.drawable.android_icon};
    private String[] title = {"Title", "Title", "Title"};
//    private String[] subTitle = {"Title", "Title", "Title"};
    private String[] content = {"Title", "Title", "Title"};
    private String[] subTitle;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lession2_login);
        initView();
        title = getResources().getStringArray(R.array.title);
        listView = findViewById(R.id.listView);
        final TechAdapter tech = new TechAdapter(this, img, title, subTitle, content);
        listView.setAdapter(tech);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                for ( int i = 0 ; i < tech.getCount(); i++)
                    parent.getChildAt(i).setBackgroundColor(Color.TRANSPARENT);
                parent.getChildAt(position).setBackgroundColor(Color.YELLOW);
                Toast.makeText(lession4_demo4.this, "select" + tech.getTitle(position), Toast.LENGTH_LONG).show();
            }
        });

    }

    private void initView() {

    }
}
