package com.example.mac.training.model;

/**
 * Created by mac on 3/23/18.
 */

public class ModelNotification {

   private String name,detalis,date;


    public ModelNotification() {
    }

    public ModelNotification(String name, String detalis, String date) {
        this.name = name;
        this.detalis = detalis;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetalis() {
        return detalis;
    }

    public void setDetalis(String detalis) {
        this.detalis = detalis;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
