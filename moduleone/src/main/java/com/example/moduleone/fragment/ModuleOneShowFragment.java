package com.example.moduleone.fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.modulelib.base.BaseFragment;
import com.example.moduleone.R;

/**
 * @author ljt
 * Date: 4/28/21
 * Time: 3:45 PM
 * Description:
 */

@Route(path = "/moduleone/showfragment")
public class ModuleOneShowFragment extends BaseFragment {
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_module_one_show;
    }
}
