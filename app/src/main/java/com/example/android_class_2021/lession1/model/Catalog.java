package com.example.android_class_2021.lession1.model;

import java.util.List;

public class Catalog {
    private int id;
    private int name;
    private List<Product> ds;

    public Catalog() {
    }

    public Catalog(int id, int name, List<Product> ds) {
        this.id = id;
        this.name = name;
        this.ds = ds;
    }

    public List<Product> getDs() {
        return ds;
    }

    public void setDs(List<Product> ds) {
        this.ds = ds;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
