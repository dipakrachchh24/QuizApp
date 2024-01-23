package com.example.quizapp;

public class DataHolder {
    private static final DataHolder instance = new DataHolder();

    public static DataHolder getInstance() {
        return instance;
    }

    private int data;
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
