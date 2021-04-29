package com.example.moduleone.activity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.modulelib.base.BaseActivity;
import com.example.moduleone.R;

/**
 * @author linjiangtao
 */
@Route(path = "/moduleone/main")
public class ModuleOneMainActivity extends BaseActivity {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_module_one_main;
    }
}