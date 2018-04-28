package com.example.mac.training.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.mac.training.R;

public class AddCourseActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView title;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_course);

        initView();
    }

    private void initView() {
        title = findViewById(R.id.AddCourseActivity_TextView_title);
        title.setText("إضافة مادة");
        toolbar = findViewById(R.id.AddCourseActivity_Toolbar_course);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(this);
        getSupportActionBar().setTitle(null);

    }

    @Override
    public void onClick(View view) {
        finish();
    }
}
