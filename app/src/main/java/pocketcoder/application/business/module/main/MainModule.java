package pocketcoder.application.business.module.main;

import dagger.Binds;
import dagger.Module;
import pocketcoder.application.presentation.activity.main.MainController;

/**
 * Created by jamesdeperio on 10/13/2017.
 * pocketcoder.application.business.module.main
 */
@Module
public abstract class MainModule {
    @Binds public abstract MainContract.ViewMethod bindViewMethod(MainController controller);

}
