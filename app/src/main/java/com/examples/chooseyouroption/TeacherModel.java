package com.examples.chooseyouroption;

public class TeacherModel {

    public TeacherModel(int image) {
        this.image = image;
    }

    private int image;
    private String name;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
