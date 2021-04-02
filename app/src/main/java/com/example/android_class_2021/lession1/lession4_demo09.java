package com.example.android_class_2021.lession1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.android_class_2021.lession1.model.Cat;
import com.example.android_class_2021.lession1.model.CatAdapter;

import java.util.ArrayList;
import java.util.List;

import model.*;

public class lession4_demo09 extends AppCompatActivity {

    private RecyclerView revCat;
    private CatAdapter adapter;
    private  Spinner sp;
    private EditText txt;
    private Button add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lession4_demo09);
        revCat = findViewById(R.id.rev);
        sp =findViewById(R.id.spin_img);
        txt = findViewById(R.id.cat_name);
        add = findViewById(R.id.btn_add);
        adapter = new CatAdapter(this);
        GridLayoutManager gm = new GridLayoutManager(this, 3);
        revCat.setLayoutManager(gm);
        adapter.setData(createData());
        revCat.setAdapter(adapter);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cat c = new Cat();
                String i = sp.getSelectedItem().toString();
                int img = R.drawable.cat;
                switch (img){
                    case 1:
                        img = R.drawable.cat;
                        break;
                    case 2:
                        img = R.drawable.cat;
                        break;
                }

                String name = txt.getText().toString();
                c.setImg(img);
                c.setName(name);
                adapter.add(c);
            }
        });
    }

    private List<Cat> createData(){
        List<Cat> ds = new ArrayList<Cat>() ;
        ds.add(new Cat(R.drawable.cat, "cat1"));
        ds.add(new Cat(R.drawable.cat, "cat2"));
        return ds;
    }


}