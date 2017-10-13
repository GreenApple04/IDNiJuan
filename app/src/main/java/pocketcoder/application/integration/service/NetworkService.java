package pocketcoder.application.integration.service;

import android.content.Context;

import org.jetbrains.annotations.NotNull;

import jamesdeperio.github.com.codepocket.service.RetrofitService;

/**
 * Created by jamesdeperio on 10/13/2017.
 * pocketcoder.application.integration
 */

public class NetworkService extends RetrofitService implements NetworkServiceContract {
    // @GETTER public DownloadService downloadService;
    public NetworkService(Context context) {
        //downloadService= (DownloadService) initialize(context, DownloadService.class);
    }

    @Override public int setCacheSize() {
        return 10;
    }
    @NotNull @Override public String setBaseURL() {
        return "http://url.com/";
    }
}
