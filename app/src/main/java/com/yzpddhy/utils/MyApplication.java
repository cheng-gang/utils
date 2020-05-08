package com.yzpddhy.utils;

import android.app.Application;

/**
 * Author:chenggang
 * Date:2020/5/8
 * Description:
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
    }
}
