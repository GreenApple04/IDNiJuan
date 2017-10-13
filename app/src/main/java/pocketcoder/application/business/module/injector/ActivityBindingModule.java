package pocketcoder.application.business.module.injector;

import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;
import pocketcoder.application.business.module.main.MainModule;
import pocketcoder.application.business.scope.ActivityScope;
import pocketcoder.application.presentation.activity.main.MainController;

/**
 * Created by jamesdeperio on 10/13/2017.
 * pocketcoder.application.business.module.injector
 */
@Module(includes = AndroidInjectionModule.class)
public abstract class ActivityBindingModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainController mainControllerInjector();


}
