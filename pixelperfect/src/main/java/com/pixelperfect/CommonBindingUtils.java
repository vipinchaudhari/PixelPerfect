package com.pixelperfect;

import android.databinding.BindingAdapter;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class CommonBindingUtils {


    @BindingAdapter({"layout_marginTop"})
    public static void setLayoutMarginTop(View self, int margin) {
        ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) self.getLayoutParams();
        layoutParams.topMargin = (int) (getRelativeHeightInPX(margin));
        self.setLayoutParams(layoutParams);
    }

    @BindingAdapter({"layout_marginBottom"})
    public static void setLayoutMarginBottom(View self, int margin) {
        ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) self.getLayoutParams();
        layoutParams.bottomMargin = (int) (getRelativeHeightInPX(margin));
        self.setLayoutParams(layoutParams);
    }

    @BindingAdapter({"layout_marginStart"})
    public static void setLayoutMarginLeft(View self, int margin) {
        ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) self.getLayoutParams();
        layoutParams.leftMargin = (int) (getRelativeWidthInPX(margin));
        self.setLayoutParams(layoutParams);
    }

    @BindingAdapter({"layout_marginEnd"})
    public static void setLayoutMarginRight(View self, int margin) {
        ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) self.getLayoutParams();
        layoutParams.rightMargin = (int) (getRelativeWidthInPX(margin));
        self.setLayoutParams(layoutParams);
    }

    @BindingAdapter({"layout_margin"})
    public static void setLayoutMargin(View self, int margin) {
        ViewGroup.MarginLayoutParams layoutParams = (ViewGroup.MarginLayoutParams) self.getLayoutParams();
        layoutParams.rightMargin = (int) (getRelativeWidthInPX(margin));
        layoutParams.leftMargin = (int) (getRelativeWidthInPX(margin));
        layoutParams.topMargin = (int) (getRelativeWidthInPX(margin));
        layoutParams.bottomMargin = (int) (getRelativeWidthInPX(margin));
        self.setLayoutParams(layoutParams);
    }

    @BindingAdapter({"layout_height"})
    public static void setLayoutHeight(View self, int height) {
        ViewGroup.LayoutParams layoutParams = self.getLayoutParams();
        layoutParams.height = (int) (getRelativeHeightInPX(height));
        self.setLayoutParams(layoutParams);
    }

    @BindingAdapter({"layout_width"})
    public static void setLayoutWidth(View self, int width) {
        ViewGroup.LayoutParams layoutParams = self.getLayoutParams();
        layoutParams.width = (int) (getRelativeWidthInPX(width));
        self.setLayoutParams(layoutParams);
    }


    @BindingAdapter({"textSize"})
    public static void setTextSize(View self, int size) {
        ((TextView) self).setTextSize(TypedValue.COMPLEX_UNIT_PX, (size) * self.getContext().getResources().getDisplayMetrics().density);
    }

    @BindingAdapter({"edit_textSize"})
    public static void setEditTextSize(View self, int size) {
        ((EditText) self).setTextSize(TypedValue.COMPLEX_UNIT_PX, (size) * self.getContext().getResources().getDisplayMetrics().density);
    }


    public static int getRelativeHeightInPX(int px) {
        return (int) (px * ScreenRatio.deviceScreenHeight) / ScreenRatio.referenceScreenHeight;
    }

    public static int getRelativeWidthInPX(int px) {
        return (int) (px * ScreenRatio.deviceScreenWidth) / ScreenRatio.referenceScreenWidth;
    }
}