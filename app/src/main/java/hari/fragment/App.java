package hari.fragment;

import android.app.Application;

import hari.fragment.manager.SharedPreferenceManager;

/**
 * Created by Hari on 26/01/16.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SharedPreferenceManager.getInstance().init(this);
    }
}
