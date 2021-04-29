package com.example.modulemain;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.modulelib.base.BaseActivity;

/**
 * @author ljt
 * Date: 4/28/21
 * Time: 9:49 AM
 * Description:
 */
public class MainActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);

        findViewById(R.id.tv_module_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 1. 应用内简单的activity跳转
                ARouter.getInstance().build("/moduleone/main")
                        .navigation();
            }
        });

        findViewById(R.id.tv_module_two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 2. 应用内简带参数的activity跳转
                ARouter.getInstance().build("/moduletwo/main")
                        .withString("name","JT")
                        .withBoolean("sex",true)
                        .navigation();
            }
        });

        findViewById(R.id.tv_module_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 3. 应用内fragment的获取
                Intent intent = new Intent(MainActivity.this,ShowFragmentActivity.class);
                startActivity(intent);
            }
        });
    }
}
