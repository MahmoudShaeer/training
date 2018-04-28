package com.example.mac.training.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.mac.training.R;
import com.example.mac.training.fragment.HomeFragment;
import com.example.mac.training.fragment.MyCoursesFragment;
import com.example.mac.training.fragment.NotificationFragment;
import com.example.mac.training.fragment.ProfileFragment;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener {

    private NavigationView navigationView;
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;
    private ImageView notification;
    private View headerLayout;
    private TextView title;
    private int itemId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        drawerLayout = findViewById(R.id.HomeActivity_DrawerLayout_drawer);
        navigationView = findViewById(R.id.HomeActivity_navigation_view);
        headerLayout = navigationView.getHeaderView(0); // 0-index header
        title = findViewById(R.id.HomeActivity_TextView_title);
        toolbar = findViewById(R.id.HomeActivity_Toolbar_toolbar);

        notification = findViewById(R.id.HomeActivity_ImageView_notification);

        FragmentManager ft = getSupportFragmentManager();
        ft.beginTransaction()
                .replace(R.id.HomeActivity_FrameLayout_container, new HomeFragment(), "HomeFragment")
                .commit();
        ft.executePendingTransactions();


        navigationView.setNavigationItemSelectedListener(this);

        toolbar.setNavigationOnClickListener(this);

        headerLayout.setOnClickListener(this);
        notification.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view.getId() == headerLayout.getId() && drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawers();
            replaceContentMainFragment(new ProfileFragment());
        } else if (view.getId() == R.id.HomeActivity_ImageView_notification) {
            replaceContentMainFragment(new NotificationFragment());
        } else {
            drawerLayout.openDrawer(Gravity.START);
        }
    }


    //handle & change fragments on item selection
    public void replaceContentMainFragment(Fragment fragment) {
        FragmentManager ft = getSupportFragmentManager();
        ft.beginTransaction()
                .replace(R.id.HomeActivity_FrameLayout_container, fragment, "HomeFragment")
                .addToBackStack("HomeFragment")
                .commit();
        ft.executePendingTransactions();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawers();  // CLOSE DRAWER
        itemId = item.getItemId();
        switch (item.getItemId()) {
            case R.id.nav_home: {
                    replaceContentMainFragment(new HomeFragment());
                break;
            }
            case R.id.nav_profile: {
                replaceContentMainFragment(new ProfileFragment());
                navigationView.getMenu().getItem(1).setChecked(true);
                break;
            }
            case R.id.nav_myCourses:
            {
                replaceContentMainFragment(new MyCoursesFragment());
                break;

            }
            case R.id.nav_logout: {
                alertDialogLogout();
                break;
            }
        }
        return true;
    }


    private void alertDialogLogout() {
      AlertDialog.Builder builder = new AlertDialog.Builder(this);
        TextView textView = new TextView(this);
        textView.setText("Log out");
        textView.setTextColor(ContextCompat.getColor(this, android.R.color.black));
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        textView.setPadding(33, 50, 10, 10);
        builder.setCustomTitle(textView);
        builder.setMessage("Are u sure Logout ?")
                .setCancelable(false)
                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                        startActivity(intent);

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                }).show();

    }
}
