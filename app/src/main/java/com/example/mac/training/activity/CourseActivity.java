package com.example.mac.training.activity;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.mac.training.R;
import com.example.mac.training.adapter.utilsAdapter.CourseAdapter;
import com.example.mac.training.adapter.utilsAdapter.LevelsAdapter;

public class CourseActivity extends AppCompatActivity implements View.OnClickListener {

    //    private ViewPager mViewPager;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TextView title;
    private Toolbar toolbar;
    private FloatingActionButton add_lec;
//    add_lec
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);
        initViews();
    }

    private void initViews() {
        viewPager = findViewById(R.id.ProfileCookerActivity_ViewPagercourse);
        tabLayout = findViewById(R.id.ProfileCookerActivity_TableLayout_slidingTabscourse);
        add_lec=findViewById(R.id.fab_lec);
        title = findViewById(R.id.ProfileCookerActivity_TextView_titlecourse);
        title.setText("الفيزياء");
        toolbar = findViewById(R.id.ProfileCookerActivity_Toolbar_course);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(this);
        getSupportActionBar().setTitle(null);
        // Get the ViewPager and set it's PagerAdapter so that it can display items
        viewPager.setAdapter(new CourseAdapter(getSupportFragmentManager(),
                this));
        tabLayout.setupWithViewPager(viewPager); // Give the TabLayout the ViewPager
        add_lec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(CourseActivity.this,AddLectureActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View view) {
        finish();
    }



}
