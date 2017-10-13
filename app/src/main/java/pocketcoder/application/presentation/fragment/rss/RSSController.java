package pocketcoder.application.presentation.fragment.rss;

import android.os.Bundle;

import javax.inject.Inject;

import pocketcoder.application.business.module.rss.RSSContract;

/**
 * Created by jamesdeperio on 10/13/2017.
 * pocketcoder.application.presentation.fragment.rss
 */

public class RSSController extends RSSView implements RSSContract.Event {
    @Inject RSSContract.Presenter presenter;

    @Override
    public void initialization(Bundle bundle) {

    }

    @Override
    public void onLoadEvent(Bundle bundle) {

    }
}
