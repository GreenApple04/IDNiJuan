package pocketcoder.application.business.app;

import android.os.Process;
import android.os.StrictMode;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import pocketcoder.application.R;
import pocketcoder.application.business.component.DaggerInjectorComponent;
import pocketcoder.application.business.module.injector.NetworkBindingModule;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by jamesdeperio on 10/13/2017.
 * pocketcoder.application.business.app
 */

public class MainApplication extends DaggerApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        Process.setThreadPriority(Process.THREAD_PRIORITY_BACKGROUND);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/roboto-light.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerInjectorComponent.builder().application(this).service(new NetworkBindingModule()).build();
    }
}
