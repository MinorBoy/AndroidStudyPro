package com.example.android.androidstudypro;

/**
 * Created by MinorBoy on 2017/12/5.
 * 水果类
 */
public class Fruit {
    private String name;
    private int imageId;

    public Fruit(String name, int imageId){
        this.name = name;
        this.imageId = imageId;
    }
    public String getName() {
        return name;
    }
    public int getImageId() {
        return imageId;
    }
}
