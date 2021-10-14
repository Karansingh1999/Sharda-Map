package com.examples.chooseyouroption;

import java.io.Serializable;

public class PlaceModel implements Serializable {

    public PlaceModel(String name, int image, String detail) {
        this.name = name;
        this.image = image;
        this.detail = detail;
    }

    private String name;
    private int image;
    private String detail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return name;
    }
}
