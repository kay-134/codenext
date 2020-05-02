package com.example.myquiz;

public class Categoryitem {
    private String name;
    private int photo;

    public Categoryitem(String name, int photo) {
        this.name = name;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public int getPhoto() {
        return photo;
    }
}
