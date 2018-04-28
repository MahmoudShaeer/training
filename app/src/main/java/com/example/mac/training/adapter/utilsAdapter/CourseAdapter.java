package com.example.mac.training.adapter.utilsAdapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.mac.training.R;
import com.example.mac.training.fragment.course.LectureFragment;
import com.example.mac.training.fragment.course.SectionFragment;
import com.example.mac.training.fragment.levels.LevelFourFragment;
import com.example.mac.training.fragment.levels.LevelOneFragment;
import com.example.mac.training.fragment.levels.LevelThreeFragment;
import com.example.mac.training.fragment.levels.LevelTwoFragment;


/**
 * Created by mac on 2/27/18.
 */

public class CourseAdapter extends FragmentPagerAdapter {

    private final int PAGE_COUNT = 2;
    private Context context;

    public CourseAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new LectureFragment();
            case 1:
                return new SectionFragment();

            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return "المحاضرات";
            case 1:
                return "السكاشن";
            default:
                return null;
        }
    }
}
