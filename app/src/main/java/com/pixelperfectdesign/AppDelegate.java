package com.pixelperfectdesign;

import android.app.Application;

import com.pixelperfect.ScreenRatio;

public class AppDelegate extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ScreenRatio.setupScreenResolution(getApplicationContext());
    }
}
