package com.example.moduletwo.fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.modulelib.base.BaseFragment;
import com.example.moduletwo.R;
/**
 * @author ljt
 * Date: 4/28/21
 * Time: 4:05 PM
 * Description:
 */

@Route(path = "/moduletwo/showfragment")
public class ModuleTwoShowFragment extends BaseFragment {
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_module_two_show;
    }

}
