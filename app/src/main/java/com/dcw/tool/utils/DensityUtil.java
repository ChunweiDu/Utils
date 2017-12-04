package com.dcw.tool.utils;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;

/**
 * 像素转换工具
 */
public class DensityUtil {

    @SuppressLint("StaticFieldLeak")
    private static Context sContext = MyUtils.getContext();

    /**
     * 获取屏幕的宽度
     *
     * @return int
     */
    public static int getScreenWidth() {
        return sContext.getResources().getDisplayMetrics().widthPixels;
    }

    /**
     * 获取屏幕的高度
     *
     * @return int
     */
    public static int getScreenHeight() {
        return sContext.getResources().getDisplayMetrics().heightPixels;
    }

    /**
     * @param dpValue dp数值
     * @return dp to  px
     */
    public static int dip2px(float dpValue) {
        final float scale = sContext.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);

    }

    /**
     * 获取屏幕尺寸
     */
    @SuppressLint("ObsoleteSdkInt")
    @SuppressWarnings("deprecation")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
    public static Point getScreenSize() {
        WindowManager windowManager = (WindowManager) sContext.getSystemService(Context.WINDOW_SERVICE);
        Display display = null;
        if (windowManager != null) {
            display = windowManager.getDefaultDisplay();
        }
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.HONEYCOMB_MR2) {
            if (display != null) {
                return new Point(display.getWidth(), display.getHeight());
            } else {
                return null;
            }
        } else {
            Point point = new Point();
            if (display != null) {
                display.getSize(point);
            }
            return point;
        }
    }

    /**
     * @param pxValue px的数值
     * @return px to dp
     */
    public static int px2dip(float pxValue) {
        final float scale = sContext.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);

    }
}
