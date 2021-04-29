package com.example.modulemain;

import android.os.Bundle;
import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.modulelib.base.BaseActivity;


/**
 * @author ljt
 * Time: 2018/7/5 17:06
 * Desc:
 */

public class ShowFragmentActivity extends BaseActivity {

    private Fragment fragmentModuleOneShow;
    private Fragment fragmentModuleTwoShow;
    private FragmentTransaction fragmentTransaction;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_show_fragment;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        fragmentModuleOneShow = (Fragment) ARouter.getInstance()
                .build("/moduleone/showfragment")
                .navigation();
        fragmentModuleTwoShow = (Fragment) ARouter.getInstance()
                .build("/moduletwo/showfragment")
                .navigation();

        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.fl_fragment,fragmentModuleOneShow);
        fragmentTransaction.add(R.id.fl_fragment,fragmentModuleTwoShow);
        fragmentTransaction.show(fragmentModuleOneShow).hide(fragmentModuleTwoShow);
        findViewById(R.id.tv_moduleone_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.show(fragmentModuleOneShow).hide(fragmentModuleTwoShow);

            }
        });
        findViewById(R.id.tv_moduletwo_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction.show(fragmentModuleTwoShow).hide(fragmentModuleOneShow);
            }
        });
        fragmentTransaction.commit();
    }

    @Override
    protected void initData() {
        super.initData();
    }

}
