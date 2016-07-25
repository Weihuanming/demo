package com.example.sp.demo4.utils;

import android.content.Context;
import android.preference.PreferenceManager;

/**
 * Created by sp on 2016/7/19.
 */
public class PreferenceUtils {

    public static Boolean getBoolean(Context context, String key, Boolean defaultValue)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(key, defaultValue);
    }

    public static Integer getInteger(Context context, String key, Integer defaultValue)
    {
        return PreferenceManager.getDefaultSharedPreferences(context).getInt(key, defaultValue);
    }

    public static void putInt(Context context, String key, int value)
    {
        PreferenceManager
                .getDefaultSharedPreferences(context)
                .edit()
                .putInt(key, value)
                .apply();
    }
}
