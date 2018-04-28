package com.example.mac.training.adapter.recyclerAdapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mac.training.R;
import com.example.mac.training.activity.CourseActivity;
import com.example.mac.training.model.ModelCourse;

import java.util.ArrayList;

/**
 * Created by mac on 2/24/18.
 */

public class CoursesAdapter extends RecyclerView.Adapter<CoursesAdapter.ViewHolder> {


    private ArrayList<ModelCourse> allCourses = new ArrayList<>();
    private Context context;

    public CoursesAdapter(ArrayList<ModelCourse> allCourses,Context context) {

        this.allCourses = allCourses;
        this.context=context;
    }

    @Override
    public CoursesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_courses, parent, false);

        CoursesAdapter.ViewHolder holder = new CoursesAdapter.ViewHolder(itemView);


        return holder;
    }

    @Override
    public void onBindViewHolder(CoursesAdapter.ViewHolder holder, int position) {
        holder.nameDr.setText(allCourses.get(position).getCourseDr());
        holder.nameCourse.setText(allCourses.get(position).getCourseName());
    }


    @Override
    public int getItemCount() {
        return allCourses.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageCourse, details;
        public TextView nameCourse, nameDr;

        public ViewHolder(View itemView) {
            super(itemView);
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent=new Intent(context, CourseActivity.class);
                        context.startActivity(intent);
                    }
                });

            initViews(itemView);
        }

        private void initViews(View itemView) {
            imageCourse = itemView.findViewById(R.id.ItemCourses_TextView_imageCourse);
            details = itemView.findViewById(R.id.ItemCourses_TextView_details);
            nameCourse = itemView.findViewById(R.id.ItemCourses_TextView_nameCourse);
            nameDr = itemView.findViewById(R.id.ItemCourses_TextView_drName);
        }

    }
}
