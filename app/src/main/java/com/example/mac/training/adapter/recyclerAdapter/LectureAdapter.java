package com.example.mac.training.adapter.recyclerAdapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mac.training.R;
import com.example.mac.training.model.ModelCourse;

import java.util.ArrayList;

/**
 * Created by mac on 2/24/18.
 */

public class LectureAdapter extends RecyclerView.Adapter<LectureAdapter.ViewHolder> {


    private ArrayList<ModelCourse> allCourses = new ArrayList<>();

    public LectureAdapter(ArrayList<ModelCourse> allCourses) {
        this.allCourses = allCourses;
    }

    @Override
    public LectureAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_lec, parent, false);

        LectureAdapter.ViewHolder holder = new LectureAdapter.ViewHolder(itemView);


        return holder;
    }

    @Override
    public void onBindViewHolder(LectureAdapter.ViewHolder holder, int position) {
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
