package com.example.databinding.util;

public class Student {
    private String name;
    private int age;
    private String imageUrl;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setName(String name) {
        this.name =name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
