package pocketcoder.application.business.component;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;
import pocketcoder.application.business.module.injector.ActivityBindingModule;
import pocketcoder.application.business.module.injector.ContextBindingModule;
import pocketcoder.application.business.module.injector.FragmentBindingModule;
import pocketcoder.application.business.module.injector.NetworkBindingModule;
import pocketcoder.application.business.scope.InjectorScope;

/**
 * Created by jamesdeperio on 10/13/2017.
 * pocketcoder.application.business.component
 */


@InjectorScope
@Component(
        modules = {
                AndroidSupportInjectionModule.class,
                ContextBindingModule.class,
                ActivityBindingModule.class,
                FragmentBindingModule.class,
                NetworkBindingModule.class
        })
public interface InjectorComponent extends AndroidInjector<DaggerApplication> {
    @Override void inject(DaggerApplication instance);

    @Component.Builder
    interface Builder {
        @BindsInstance
        InjectorComponent.Builder application(Application application);
        @BindsInstance
        InjectorComponent.Builder service(NetworkBindingModule networkBindingModule);
        InjectorComponent build();
    }
}
