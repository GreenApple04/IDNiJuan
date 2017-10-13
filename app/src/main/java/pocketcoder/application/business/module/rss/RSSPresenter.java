package pocketcoder.application.business.module.rss;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * Created by jamesdeperio on 10/13/2017.
 * pocketcoder.application.business.module.rss
 */
@RequiredArgsConstructor
public final class RSSPresenter implements RSSContract.Presenter {
    @NonNull RSSContract.ViewMethod viewMethod;
}
