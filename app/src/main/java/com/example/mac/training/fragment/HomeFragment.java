package com.example.mac.training.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.mac.training.R;
import com.example.mac.training.activity.CoursesOfYear;
import com.example.mac.training.activity.LevelsActivity;


/**
 * Created by mac on 2/10/18.
 */

public class HomeFragment extends Fragment implements View.OnClickListener {


    private LinearLayout physics;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_details_chapters, container, false);
        initView(view);
        actionViews();
        return view;
    }

    private void actionViews() {
        physics.setOnClickListener(this);
    }

    private void initView(View view) {
        physics = view.findViewById(R.id.DepartMentActivity_LinearLayout_physcs);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.DepartMentActivity_LinearLayout_physcs) {
            Intent intent=new Intent(getActivity(), LevelsActivity.class);
            startActivity(intent);

        }

    }
}
