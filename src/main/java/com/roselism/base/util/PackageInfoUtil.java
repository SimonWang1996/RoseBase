package com.roselism.base.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * @author: Hyper Simon Wang
 * @create_time: 2016/05/12 12:20
 * @packageName: com.roselism.mobilesafe24.util
 */
public class PackageInfoUtil {

    /**
     * 获得当前app的版本名
     *
     * @param context 上下文对象
     * @return 版本名称
     * @throws PackageManager.NameNotFoundException
     */
    public static String getVersionName(Context context) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = getPackageInfo(context);
        String versionName = packageInfo.versionName;
        return versionName;
    }

    /**
     * 获得当前app的版办号
     *
     * @param context 上下文对象
     * @return 版本码
     * @throws PackageManager.NameNotFoundException
     */
    public static int getVersionCode(Context context) throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo = getPackageInfo(context);
        int versionCode = packageInfo.versionCode;
        return versionCode;
    }

    /**
     * 获得packageInfo对象
     *
     * @param context 上下文对象
     * @return
     * @throws PackageManager.NameNotFoundException
     */
    private static PackageInfo getPackageInfo(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.GET_ACTIVITIES);
    }
}