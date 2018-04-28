package com.example.mac.training.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.example.mac.training.R;

public class AddLectureActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView title;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_lecture);

        initView();
    }

    private void initView() {
        title = findViewById(R.id.AddLectureActivity_TextView_title);
        title.setText("إضافة ملف");
        toolbar = findViewById(R.id.AddLectureActivity_Toolbar_course);
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

