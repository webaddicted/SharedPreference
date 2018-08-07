package com.example.deepaksharma.sharedpreference;

import android.app.Application;

import com.example.preference.PreferenceUtil;

/**
 * Created by deepaksharma on 7/8/18.
 */

public class GlobalClass extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        PreferenceUtil.init(getApplicationContext());
    }
}
