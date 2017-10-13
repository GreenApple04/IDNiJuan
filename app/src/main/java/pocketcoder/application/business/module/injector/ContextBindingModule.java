package pocketcoder.application.business.module.injector;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Created by jamesdeperio on 10/13/2017.
 * pocketcoder.application.business.module.injector
 */
 @Module
 public abstract class ContextBindingModule {
    @Binds abstract Context bindContext(Application application);
}
