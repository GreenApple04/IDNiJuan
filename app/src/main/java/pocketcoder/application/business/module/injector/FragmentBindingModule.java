package pocketcoder.application.business.module.injector;

import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;
import pocketcoder.application.business.module.rss.RSSModule;
import pocketcoder.application.business.scope.FragmentScope;
import pocketcoder.application.presentation.fragment.rss.RSSController;

/**
 * Created by jamesdeperio on 10/13/2017.
 * pocketcoder.application.business.module.injector
 */
@Module(includes = AndroidInjectionModule.class)
public abstract class FragmentBindingModule {
    @FragmentScope
    @ContributesAndroidInjector(modules = RSSModule.class)
    abstract RSSController rssControllerInjector();

}
