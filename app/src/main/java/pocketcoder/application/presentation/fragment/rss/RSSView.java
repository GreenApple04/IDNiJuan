package pocketcoder.application.presentation.fragment.rss;

import pocketcoder.application.business.module.rss.RSSContract;
import pocketcoder.application.presentation.base.DIBaseFragment;

/**
 * Created by jamesdeperio on 10/13/2017.
 * pocketcoder.application.presentation.fragment.rss
 */

public abstract class RSSView extends DIBaseFragment implements RSSContract.ViewMethod {
    @Override public int initContentView() {
        return 0;
    }
}
