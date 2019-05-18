package com.tjedit.tablayoutpractice;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tjedit.tablayoutpractice.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {
    ActivityMainBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bindViews();
        seuptEvents();
        seuptValues();
    }

    @Override
    public void seuptEvents() {

    }

    @Override
    public void seuptValues() {
        act.tabLayout.addTab(act.tabLayout.newTab().setText("홈").setIcon(R.mipmap.ic_launcher));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("채팅목록"));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("검색"));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("더보기"));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("더보기"));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("더보기"));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("더보기"));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("더보기"));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("더보기"));
        act.tabLayout.addTab(act.tabLayout.newTab().setText("더보기"));

    }

    @Override
    public void bindViews() {
        act = DataBindingUtil.setContentView(this, R.layout.activity_main);

    }
}
