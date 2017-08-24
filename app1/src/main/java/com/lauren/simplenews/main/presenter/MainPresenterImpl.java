package com.lauren.simplenews.main.presenter;

import com.lauren.simplenews.R;
import com.lauren.simplenews.main.view.MainView;

/**
 * Created by Administrator on 2017/8/20 0020.
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

            default:

                break;
        }
    }
}
