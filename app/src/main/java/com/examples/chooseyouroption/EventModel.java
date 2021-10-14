package com.examples.chooseyouroption;

public class EventModel {

    private String name;
    private String details;
    private String date;

    public EventModel() {
    }

    public EventModel(String name, String details, String date) {
        this.name = name;
        this.details = details;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
