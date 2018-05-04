package com.fanwe.json;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.fanwe.lib.utils.json.FJson;

public class MainActivity extends AppCompatActivity
{
    public static final String TAG = MainActivity.class.getSimpleName();

    private final String json = "{\"valueInt\":\"1\", \"valueLong\":\"2\", \"valueFloat\":\"3.3\", \"valueDouble\":\"4.4\"}";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestModel model = FJson.jsonToObject(json, TestModel.class);
        Log.i(TAG, model.toString());
    }
}
