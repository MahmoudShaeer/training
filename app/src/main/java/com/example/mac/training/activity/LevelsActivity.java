package com.example.mac.training.activity;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import com.example.mac.training.R;
import com.example.mac.training.adapter.utilsAdapter.LevelsAdapter;

public class LevelsActivity extends AppCompatActivity implements View.OnClickListener {

    //    private ViewPager mViewPager;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TextView title;
    private Toolbar toolbar;
    private FloatingActionButton add_course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);
        initViews();
    }

    private void initViews() {
        viewPager = findViewById(R.id.ProfileCookerActivity_ViewPager);
        tabLayout = findViewById(R.id.ProfileCookerActivity_TableLayout_slidingTabs);
        add_course=findViewById(R.id.fab_course);
        title = findViewById(R.id.ProfileCookerActivity_TextView_title);
        title.setText("مستويات الكلية");
        toolbar = findViewById(R.id.ProfileCookerActivity_Toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(this);
        getSupportActionBar().setTitle(null);
        // Get the ViewPager and set it's PagerAdapter so that it can display items
        viewPager.setAdapter(new LevelsAdapter(getSupportFragmentManager(),
                this));
        tabLayout.setupWithViewPager(viewPager); // Give the TabLayout the ViewPager
//        TabsFont.getInstance().setTabsFont(tabLayout, this); // to set font for tabsLayout

        add_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LevelsActivity.this,AddCourseActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View view) {
        finish();
    }

}
