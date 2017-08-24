package com.example.demonavigationview.main.widget;

import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.demonavigationview.R;
import com.example.demonavigationview.main.presenter.MainPresenterImpl;
import com.example.demonavigationview.main.view.MainView;

public class MainActivity extends AppCompatActivity implements
        MainView{

    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;
    private Toolbar mToolbar;
    private ActionBar supportActionBar;
    private ActionBar actionBar;
    private MainPresenterImpl mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*DrawerLayout*/
        mDrawerLayout = (DrawerLayout) findViewById(R.id.id_drawer_layout);
        /*NavigationView*/
        mNavigationView = (NavigationView) findViewById(R.id.id_nv_menu);
        /*ToolBar*/
        mToolbar = (Toolbar) findViewById(R.id.id_toolbar);
        setSupportActionBar(mToolbar);

        actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_date_range_white_24dp);
        actionBar.setDisplayHomeAsUpEnabled(true);

        setupDrawerContent(mNavigationView);

        mMainPresenter = new MainPresenterImpl(this);

        switch2News();
    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                menuItem.setChecked(true);
                mDrawerLayout.closeDrawers();
                return true;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            mDrawerLayout.openDrawer(GravityCompat.START);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void switch2News() {
        //
    }

    @Override
    public void switch2Image() {

    }

    @Override
    public void switch2Weather() {

    }

    @Override
    public void switch2About() {

    }
}
