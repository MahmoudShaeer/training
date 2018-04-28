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
import com.example.mac.training.model.ModelNotification;

import java.util.ArrayList;

/**
 * Created by mac on 3/23/18.
 */

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.ViewHolder> {

    private ArrayList<ModelNotification> allNotifications = new ArrayList<>();

    private Context context;
    public NotificationAdapter(ArrayList<ModelNotification> allCourses, Context context) {
        this.allNotifications = allCourses;
        this.context=context;
    }

    @Override
    public NotificationAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_notification, parent, false);
        NotificationAdapter.ViewHolder holder = new NotificationAdapter.ViewHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(NotificationAdapter.ViewHolder holder, int position) {
        holder.name.setText(allNotifications.get(position).getName());
        holder.detalis.setText(allNotifications.get(position).getDetalis());
        holder.date.setText(allNotifications.get(position).getDate());
    }


    @Override
    public int getItemCount() {
        return allNotifications.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageCourse;
        public TextView name, date,detalis;

        public ViewHolder(View itemView) {
            super(itemView);

                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent= new Intent(context, CourseActivity.class);
                        context.startActivity(intent);
                    }
                });
            initViews(itemView);
        }

        private void initViews(View itemView) {
            imageCourse = itemView.findViewById(R.id.ItemNotification_CircleImageView_profile);
            name =itemView.findViewById(R.id.ItemNotification_TextView_name);
            date=itemView.findViewById(R.id.ItemNotification_TextView_date);
            detalis=itemView.findViewById(R.id.ItemNotification_TextView_detalis);
        }

    }
}
