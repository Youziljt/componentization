package com.example.modulelib.util;

import android.content.Context;
import android.widget.Toast;

/**
 * Time: 2018/7/4 11:05
 * Desc:
 *
 * @author linjiangtao
 */

public class ToastUtil {

    public static void showToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
