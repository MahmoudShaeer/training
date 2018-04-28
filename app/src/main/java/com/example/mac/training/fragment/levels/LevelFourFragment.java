package com.example.mac.training.fragment.levels;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mac.training.R;
import com.example.mac.training.adapter.recyclerAdapter.CoursesAdapter;
import com.example.mac.training.model.ModelCourse;

import java.util.ArrayList;

/**
 * Created by mac on 3/23/18.
 */

public class LevelFourFragment extends Fragment {


    private RecyclerView allCourses;
    private CoursesAdapter coursesAdapter;
    private ArrayList<ModelCourse> data = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view=inflater.inflate(R.layout.level_fragment,container,false);
        initViews(view);
        setAdapter();
        return view;
    }

    private void setAdapter() {
        setData();
        coursesAdapter = new CoursesAdapter(data,getActivity());
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        allCourses.setLayoutManager(mLayoutManager);
        allCourses.setItemAnimator(new DefaultItemAnimator());
        allCourses.setAdapter(coursesAdapter);
    }

    private void initViews(View view) {
        allCourses = view.findViewById(R.id.levelFragment_RecyclerView_allCourses);
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
