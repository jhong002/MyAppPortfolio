package com.captech.jhong.myappportfolio;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class HomeActivity extends AppCompatActivity {
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initToolbar(getString(R.string.app_name), false);

        if (savedInstanceState == null){
            HomeFragment homeFragment = HomeFragment.newInstance();
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace(R.id.fl_home_activity, homeFragment);
            transaction.commitAllowingStateLoss();
        }

    }

    private void initToolbar(String title, boolean homeUpEnabled) {
        mToolbar = (Toolbar) findViewById(R.id.lac_toolbar);
        if (mToolbar != null) {
            mToolbar.setTitle(title);
            setSupportActionBar(mToolbar);
        }

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(homeUpEnabled);
        }
    }
}
