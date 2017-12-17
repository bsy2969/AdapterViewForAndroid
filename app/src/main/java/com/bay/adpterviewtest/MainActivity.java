package com.bay.adpterviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "AdapterViewtest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> dataArray = new ArrayList<String>();
        final String dataFormat = "data_%d";
        for(int i=0; i< 99; ++i){
            dataArray.add(String.format(dataFormat,i));
        }

        ArrayAdapter<String> adapter=new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1,dataArray);
        ListView listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);



    }
}
