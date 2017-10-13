package pocketcoder.application.business.module.injector;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import dagger.android.AndroidInjectionModule;
import pocketcoder.application.business.scope.InjectorScope;
import pocketcoder.application.integration.service.NetworkService;
import pocketcoder.application.integration.service.NetworkServiceContract;

/**
 * Created by jamesdeperio on 10/13/2017.
 * pocketcoder.application.business.module.injector
 */
@Module(includes = AndroidInjectionModule.class)
public class NetworkBindingModule {
    @InjectorScope @Provides
    public NetworkServiceContract provideNetworkService(Context context){
        return new NetworkService(context);
    }
}
