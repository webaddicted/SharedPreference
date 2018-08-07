package com.example.deepaksharma.sharedpreference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.preference.PreferenceUtil;

public class MainActivity extends AppCompatActivity {
private static final String NAME = "user_name";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PreferenceUtil.getInstance().setPreference(NAME, "Deepak");
        Toast.makeText(this, ""+PreferenceUtil.getInstance().getPreference(NAME,"hi"), Toast.LENGTH_SHORT).show();
    }
}
