package com.lauren.simplenews.main.widget;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.lauren.simplenews.R;
import com.lauren.simplenews.main.presenter.MainPresenterImpl;
import com.lauren.simplenews.main.view.MainView;

public class MainActivity extends AppCompatActivity implements MainView {

    private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;
    private NavigationView mNavigationView;
    private MainPresenterImpl mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }

    private void initView() {
        // Toolbar
        mToolbar = (Toolbar) findViewById(R.id.id_toolbar);
        setSupportActionBar(mToolbar);

        // DrawerLayout
//        mDrawerLayout = (DrawerLayout) findViewById(R.id.id_drawer_layout);
//        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.drawer_open, R.string.drawer_close);
//        mNavigationView = (NavigationView) findViewById(R.id.id_nv_menu);
//        setupDrawerContent(mNavigationView);
//
//        mMainPresenter = new MainPresenterImpl(this);
    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem item) {
                        mMainPresenter.switchNavigation(item.getItemId());
                        item.setChecked(true);
                        mDrawerLayout.closeDrawers();
                        return true;
                    }
                }

        );
    }

    @Override
    public void switch2News() {

    }

    @Override
    public void switch2Images() {

    }
}
