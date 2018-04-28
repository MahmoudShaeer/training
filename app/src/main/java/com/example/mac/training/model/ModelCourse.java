package com.example.mac.training.model;

/**
 * Created by mac on 2/24/18.
 */

public class ModelCourse {


    private String courseName;
    private String courseDr;

    public ModelCourse() {
    }

    public ModelCourse(String courseName, String courseDr) {
        this.courseName = courseName;
        this.courseDr = courseDr;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDr() {
        return courseDr;
    }

    public void setCourseDr(String courseDr) {
        this.courseDr = courseDr;
    }
}
