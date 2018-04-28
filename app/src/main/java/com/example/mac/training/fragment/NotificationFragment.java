package com.example.mac.training.fragment;

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
import com.example.mac.training.adapter.recyclerAdapter.NotificationAdapter;
import com.example.mac.training.model.ModelCourse;
import com.example.mac.training.model.ModelNotification;

import java.util.ArrayList;

/**
 * Created by mac on 2/17/18.
 */

public class NotificationFragment extends Fragment {

    private RecyclerView allNotificatoin;
//NotificationAdapter

    private NotificationAdapter notificationAdapter;
    private ArrayList<ModelNotification> data = new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.notification_fragment, container, false);
        initViews(view);
        setAdapter();
        return view;
    }

    private void setAdapter() {
        setData();
        notificationAdapter = new NotificationAdapter(data,getActivity());
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        allNotificatoin.setLayoutManager(mLayoutManager);
        allNotificatoin.setItemAnimator(new DefaultItemAnimator());
        allNotificatoin.setAdapter(notificationAdapter);
    }

    private void initViews(View view) {
        allNotificatoin = view.findViewById(R.id.NotificationFragment_RecyclerView_notification);
    }

    private void setData() {
        data.add(new ModelNotification("shaeer","details ","12-4-3"));

        data.add(new ModelNotification("shaeer","details ","12-4-3"));

        data.add(new ModelNotification("shaeer","details ","12-4-3"));

        data.add(new ModelNotification("shaeer","details ","12-4-3"));

        data.add(new ModelNotification("shaeer","details ","12-4-3"));

        data.add(new ModelNotification("shaeer","details ","12-4-3"));

        data.add(new ModelNotification("shaeer","details ","12-4-3"));

        data.add(new ModelNotification("shaeer","details ","12-4-3"));

        data.add(new ModelNotification("shaeer","details ","12-4-3"));


    }
}
