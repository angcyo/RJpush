package com.angcyo.rjpush;

import android.content.Context;

import cn.jpush.android.api.JPushInterface;

/**
 * Copyright (C) 2016,深圳市红鸟网络科技股份有限公司 All rights reserved.
 * 项目名称：
 * 类的描述：
 * 创建人员：Robi
 * 创建时间：2018/02/07 19:52
 * 修改人员：Robi
 * 修改时间：2018/02/07 19:52
 * 修改备注：
 * Version: 1.0.0
 */
public class RJpush {

    /**
     * 初始化
     */
    public static void init(Context context, boolean isDebug) {
        // 设置开启日志,发布时请关闭日志
        JPushInterface.setDebugMode(isDebug);
        // 初始化 JPush
        JPushInterface.init(context);

        Logger.LOG_ENABLE = isDebug;
    }

    /*
     * http://docs.jiguang.cn/jpush/client/Android/android_api/
     * */

    /**
     * 停止推送服务。
     */
    public static void stopPush(Context context) {
        JPushInterface.stopPush(context);
    }

    /**
     * 恢复推送服务。
     */
    public static void resumePush(Context context) {
        JPushInterface.resumePush(context);
    }

    /**
     * 用来检查 Push Service 是否已经被停止
     */
    public static boolean isPushStopped(Context context) {
        return JPushInterface.isPushStopped(context);
    }

    /**
     * 动态配置 channel，优先级比 AndroidManifest 里配置的高
     */
    public static void setChannel(Context context, String channel) {
        JPushInterface.setChannel(context, channel);
    }

    /**
     * 调用此 API 来取得应用程序对应的 RegistrationID。 只有当应用程序成功注册到 JPush 的服务器时才返回对应的值，否则返回空字符串。
     */
    public static String getRegistrationID(Context context) {
        return JPushInterface.getRegistrationID(context);
    }
}
