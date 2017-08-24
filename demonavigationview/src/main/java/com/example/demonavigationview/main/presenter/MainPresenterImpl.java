package com.example.demonavigationview.main.presenter;

import com.example.demonavigationview.R;
import com.example.demonavigationview.main.view.MainView;

/**
 * Created by Administrator on 2017/8/22 0022.
 */

public class MainPresenterImpl implements MainPresenter {

    private final MainView mMainView;

    public MainPresenterImpl(MainView mainView) {
        this.mMainView = mainView;
    }

    @Override
    public void switchNavigation(int id) {
        switch (id) {
            case R.id.navigation_item_news:
                mMainView.switch2News();
                break;
            case R.id.navigation_item_images:
                mMainView.switch2Image();
                break;
            case R.id.navigation_item_weather:
                mMainView.switch2Weather();
                break;
            case R.id.navigation_item_about:
                mMainView.switch2About();
                break;
            default:
                mMainView.switch2News();
                break;
        }
    }
}
