package com.yzpddhy.utils.sputil;

import android.content.Context;
import android.content.SharedPreferences;

import com.yzpddhy.utils.Utils;

import java.util.Set;

/**
 * Author:chenggang
 * Date:2020/5/7
 * Description: SharedPreferences 工具类
 */
public class SpUtil {
    /**
     * @return
     */
    private static SharedPreferences getSharedPreferences() {
        return Utils.getContext().getSharedPreferences("sp", Context.MODE_PRIVATE);
    }

    /**
     * @return
     */
    private static SharedPreferences.Editor getEditor() {
        return getSharedPreferences().edit();
    }

    /**
     * 保存String值
     *
     * @param key
     * @param value
     */
    public static void setValue(String key, String value) {
        SharedPreferences.Editor editor = getEditor();
        editor.putString(key, value);
        editor.apply();
    }

    /**
     * 获取String值
     *
     * @param key
     * @param defValue
     * @return
     */
    public static String getValue(String key, String defValue) {
        return getSharedPreferences().getString(key, defValue);
    }

    /**
     * 保存boolean值
     *
     * @param key
     * @param value
     */
    public static void setValue(String key, boolean value) {
        SharedPreferences.Editor editor = getEditor();
        editor.putBoolean(key, value);
        editor.apply();
    }

    /**
     * 获取boolean值
     *
     * @param key
     * @param defValue
     * @return
     */
    public static boolean getValue(String key, boolean defValue) {
        return getSharedPreferences().getBoolean(key, defValue);
    }

    /**
     * 保存int值
     *
     * @param key
     * @param value
     */
    public static void setValue(String key, int value) {
        SharedPreferences.Editor editor = getEditor();
        editor.putInt(key, value);
        editor.apply();
    }

    /**
     * 获取int值
     *
     * @param key
     * @param defValue
     * @return
     */
    public static int getValue(String key, int defValue) {
        return getSharedPreferences().getInt(key, defValue);
    }

    /**
     * 保存long值
     *
     * @param key
     * @param value
     */
    public static void setValue(String key, long value) {
        SharedPreferences.Editor editor = getEditor();
        editor.putLong(key, value);
        editor.apply();
    }

    /**
     * 获取long值
     *
     * @param key
     * @param defValue
     * @return
     */
    public static long getValue(String key, long defValue) {
        return getSharedPreferences().getLong(key, defValue);
    }

    /**
     * 保存 Set<String>
     *
     * @param key
     * @param value
     */
    public static void setValue(String key, Set<String> value) {
        SharedPreferences.Editor editor = getEditor();
        editor.putStringSet(key, value);
        editor.apply();
    }

    /**
     * 获取 Set<String>
     *
     * @param key
     * @param defValue
     * @return
     */
    public static Set<String> getValue(String key, Set<String> defValue) {
        return getSharedPreferences().getStringSet(key, defValue);
    }
}
