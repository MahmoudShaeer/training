package com.example.mac.training.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.mac.training.R;
import com.example.mac.training.adapter.recyclerAdapter.CoursesAdapter;
import com.example.mac.training.model.ModelCourse;

import java.util.ArrayList;

public class CoursesOfYear extends AppCompatActivity {

    private RecyclerView allCourses;
    private CoursesAdapter coursesAdapter;
    private ArrayList<ModelCourse> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses_of_year);
        initViews();
        setAdapter();
    }

    private void setAdapter() {
        setData();
        coursesAdapter = new CoursesAdapter(data,this);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        allCourses.setLayoutManager(mLayoutManager);
        allCourses.setItemAnimator(new DefaultItemAnimator());
        allCourses.setAdapter(coursesAdapter);
    }

    private void initViews() {
        allCourses = findViewById(R.id.CoursesOfYear_RecyclerView_allCourses);
    }

    private void setData() {
        data.add(new ModelCourse("android","dr.hassan"));
        data.add(new ModelCourse("java","dr.rea7ab"));
        data.add(new ModelCourse("testing","dr.galal"));
        data.add(new ModelCourse("wla 7aga","dr.meriana"));
        data.add(new ModelCourse("androidsd","dr.hassan"));
        data.add(new ModelCourse("androidfd","dr.hagfgfssan"));
        data.add(new ModelCourse("androifdsd","dr.hassagfgfn"));
        data.add(new ModelCourse("andrfdfdoid","dr.hasdfsfssan"));
        data.add(new ModelCourse("androfdfdid","dr.hassfssfan"));
    }

}
