package com.pixelperfect;

import android.content.Context;

public class ScreenRatio {
    public static Integer referenceScreenWidth = 360;
    public static Integer referenceScreenHeight = 640;

    public static Integer deviceScreenWidth = 360;
    public static Integer deviceScreenHeight = 640;

    public static void setupScreenResolution(int width, int height, Context context) {
        referenceScreenWidth = width;
        referenceScreenHeight = height;
        deviceScreenWidth = getScreenWidth();
        deviceScreenHeight = getScreenHeight();
    }

    public static void setupScreenResolution(Context context) {
        deviceScreenWidth = context.getResources().getDisplayMetrics().widthPixels;
        deviceScreenHeight = context.getResources().getDisplayMetrics().heightPixels;
    }

    private float getScreenWidth() {
        //return screenWidth==0?getResources().getDisplayMetrics().widthPixels:screenWidth;
        return (referenceScreenWidth * getScreenHeight()) / referenceScreenHeight;
    }

    private float getScreenHeight() {
        //return screenHeight==0?getResources().getDisplayMetrics().heightPixels:screenHeight;
        return (referenceScreenHeight * getResources().getDisplayMetrics().widthPixels) / referenceScreenWidth;
    }

}
