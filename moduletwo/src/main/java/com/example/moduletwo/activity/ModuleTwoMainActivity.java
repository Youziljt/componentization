package com.example.moduletwo.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.example.modulelib.base.BaseActivity;
import com.example.moduletwo.R;

/**
 * @author linjiangtao
 */

@Route(path = "/moduletwo/main")
public class ModuleTwoMainActivity extends BaseActivity {

    @Autowired
    String name;

    @Autowired
    Boolean sex;

    private TextView tv_name;
    private TextView tv_sex;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_module_two_main;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        super.initView(savedInstanceState);
        ARouter.getInstance().inject(this);
        tv_name = findViewById(R.id.tv_parameter);
        tv_sex = findViewById(R.id.tv_parameter_boolean);
    }

    @Override
    protected void initData() {
        super.initData();
        if (!TextUtils.isEmpty(name)) {
            tv_name.setText(name);
        }

        tv_sex.setText("性别是：" + sex);
    }
}