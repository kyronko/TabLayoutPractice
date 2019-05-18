package com.tjedit.tablayoutpractice;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

public abstract  class BaseActivity extends AppCompatActivity {
    public Context mContext =  this;

    public  abstract  void seuptEvents();
    public  abstract  void seuptValues();
    public  abstract  void bindViews();
}
