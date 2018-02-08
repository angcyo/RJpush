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
    public static void init(Context context, boolean isDebug) {
        JPushInterface.setDebugMode(isDebug);    // 设置开启日志,发布时请关闭日志
        JPushInterface.init(context);            // 初始化 JPush
    }
}
