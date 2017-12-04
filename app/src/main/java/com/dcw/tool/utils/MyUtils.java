package com.dcw.tool.utils;

import android.annotation.SuppressLint;
import android.content.Context;

/**
 * 工具集初始化
 */

public class MyUtils {

    @SuppressLint("StaticFieldLeak")
    private static Context sContext;

    private MyUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * 初始化工具类
     *
     * @param context 上下文
     */
    public static void init(Context context) {
        MyUtils.sContext = context.getApplicationContext();
    }

    /**
     * 获取ApplicationContext
     *
     * @return ApplicationContext
     */
    public static Context getContext() {
        if (sContext != null) {
            return sContext;
        } else {
            throw new NullPointerException("u should init first");
        }
    }
}
