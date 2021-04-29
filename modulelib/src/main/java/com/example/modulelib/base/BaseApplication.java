package com.example.modulelib.base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author ljt
 * Date: 4/28/21
 * Time: 9:21 AM
 * Description:
 */
public class BaseApplication extends Application {
    private boolean isDebug = true;

    @Override
    public void onCreate() {
        super.onCreate();
        if (isDebug) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }
}
