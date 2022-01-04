package com.kennie.example.library;

import android.os.Bundle;
import android.view.View;

import com.kennie.statusbar.StatusBarUtil;


public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }

    @Override
    protected void setCutoutScreen(boolean isFullScreen) {
        super.setCutoutScreen(true);
    }

    @Override
    protected void setStatusBar() {
        StatusBarUtil.setTransparent(this);
        StatusBarUtil.setDarkMode(this);
    }
}