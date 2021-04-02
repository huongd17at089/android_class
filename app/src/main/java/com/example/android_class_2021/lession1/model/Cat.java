package com.example.android_class_2021.lession1.model;

import com.example.android_class_2021.lession1.R;

public class Cat {
    private int img;
    private String name;

    public Cat(int img, String name) {
        this.img = img;
        this.name = name;
    }

    public Cat() {
        name = "cat";
        img = R.drawable.cat;

    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
