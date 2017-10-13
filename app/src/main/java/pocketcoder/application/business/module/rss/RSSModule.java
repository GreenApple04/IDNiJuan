package pocketcoder.application.business.module.rss;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import pocketcoder.application.business.scope.FragmentScope;
import pocketcoder.application.presentation.fragment.rss.RSSController;

/**
 * Created by jamesdeperio on 10/13/2017.
 * pocketcoder.application.business.module.rss
 */
@Module
public abstract class RSSModule {
    @Binds public abstract RSSContract.ViewMethod bindViewMethod(RSSController controller);
    @FragmentScope @Provides
    public static RSSContract.Presenter providePresenter(RSSContract.ViewMethod view){
        //can add sub component
        return new RSSPresenter(view);
    }
}
