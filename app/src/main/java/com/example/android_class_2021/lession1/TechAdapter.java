package com.example.android_class_2021.lession1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class TechAdapter extends ArrayAdapter<String> {

    private Activity context;
    private Integer[] img;
    private String[] title;
    private String[] subTitle;
    private String[] content;

    public TechAdapter(@NonNull Activity context, Integer[] img,
           String[] title,
            String[] subTitle,
            String[] content) {
        super(context, R.layout.list_item, title);
        this.context = context;
        this.title = title;
        this.subTitle = subTitle;
        this.content = content;
        this.img = img;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) { // view cua 1 item vi tri position
//        return super.getView(position, convertView, parent);
        LayoutInflater inflater = context.getLayoutInflater(); //
        View v = inflater.inflate(R.layout.list_item2, null, true); // view of listView //list_item2
        ImageView i = v.findViewById(R.id.ico);
        TextView tvTitle = v.findViewById(R.id.title);
        TextView tvSubTitle = v.findViewById(R.id.subTitle);
        TextView tvContent = v.findViewById(R.id.content);
        i.setImageResource(img[position]);
        tvSubTitle.setText(subTitle[position]);
        tvTitle.setText(subTitle[position]);
        tvContent.setText(content[position]);
        return v;
    }

    public  String getTitle(int position){
        return title[position];

    }
}
