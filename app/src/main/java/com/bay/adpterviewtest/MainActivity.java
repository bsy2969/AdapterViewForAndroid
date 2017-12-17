package com.bay.adpterviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "AdapterViewtest";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a=4/2;

        Log.d(TAG, "안녕하세요!!");

        String str2=String.format("a=%d",a);
        int d = Log.d(TAG, str2);


    }
}
