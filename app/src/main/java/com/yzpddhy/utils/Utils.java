package com.yzpddhy.utils;

import android.app.Application;
import android.content.Context;

/**
 * Author:chenggang
 * Date:2020/5/7
 * Description: 工具类，需要在Application onCreate()中初始化
 */
public class Utils {

    private static Context mContext = null;

    /**
     * 初始化
     *
     * @param context
     */
    public static void init(Application context) {
        mContext = context;
    }

    public static Context getContext() {
        if (mContext == null) {
            throw new IllegalArgumentException("you must init Utils in your Application onCreate method!");
        }
        return mContext;
    }
}
