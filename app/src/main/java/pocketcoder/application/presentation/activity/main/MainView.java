package pocketcoder.application.presentation.activity.main;

import pocketcoder.application.R;
import pocketcoder.application.business.module.main.MainContract;
import pocketcoder.application.presentation.base.DIBaseActivity;

/**
 * Created by jamesdeperio on 10/13/2017.
 * pocketcoder.application.presentation.activity.main
 */

public abstract class MainView extends DIBaseActivity implements MainContract.ViewMethod {
    @Override public int initContentView() {
        return R.layout.activity_main;
    }

}
