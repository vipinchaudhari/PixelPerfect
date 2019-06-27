package com.pixelperfect;

import android.content.Context;

public class ScreenRatio {
    public static Integer referenceScreenWidth = 360;
    public static Integer referenceScreenHeight = 640;

    public static float deviceScreenWidth = 360;
    public static float deviceScreenHeight = 640;

    public static void setupScreenResolution(int width, int height, Context context) {
        referenceScreenWidth = width;
        referenceScreenHeight = height;
        deviceScreenWidth = getScreenWidth(context);
        deviceScreenHeight = getScreenHeight(context);
    }

    public static void setupScreenResolution(Context context) {
        deviceScreenWidth = context.getResources().getDisplayMetrics().widthPixels;
        deviceScreenHeight = context.getResources().getDisplayMetrics().heightPixels;
    }

    private static float getScreenWidth(Context context) {
        //return screenWidth==0?getResources().getDisplayMetrics().widthPixels:screenWidth;
        return (referenceScreenWidth * getScreenHeight(context)) / referenceScreenHeight;
    }

    private static float getScreenHeight(Context context) {
        //return screenHeight==0?getResources().getDisplayMetrics().heightPixels:screenHeight;
        return (referenceScreenHeight * context.getResources().getDisplayMetrics().widthPixels) / referenceScreenWidth;
    }

}
