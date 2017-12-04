package com.dcw.tool;

import android.app.Application;

import com.dcw.tool.utils.MyUtils;

/**
 * @Author： duchunwei
 * @Date: 2017/12/1   11:13
 * @Email： duchunwei_it@163.com
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        MyUtils.init(this);
    }
}
