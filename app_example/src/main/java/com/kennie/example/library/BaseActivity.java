package com.kennie.example.library;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.kennie.statusbar.CutoutScreenManager;
import com.kennie.statusbar.StatusBarUtil;


/**
 * Author:
 * Date: 2021-11-30 15:36
 * Email: hydznsqk@163.com
 * Des:
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setCutoutScreen(false);
        setStatusBar();
        super.onCreate(savedInstanceState);
    }


    /**
     * 设置刘海屏,默认适配刘海屏和普通屏幕(子类可以重写该方法)
     *
     * @param isFullScreen 是否全屏展示(页面填充到状态栏区域) true:是  false:不是
     *                     可以参考如下链接
     *
     */
    protected void setCutoutScreen(boolean isFullScreen) {
        CutoutScreenManager instance = CutoutScreenManager.getInstance();
        instance.init(this, isFullScreen);
    }

    /**
     * 设置状态栏,默认白底黑字(子类可以重写该方法)
     */
    protected void setStatusBar() {
        //状态栏底部颜色为白色
        StatusBarUtil.setColor(this, Color.WHITE, 0);
        //状态栏字体为黑色
        StatusBarUtil.setLightMode(this);
    }
}