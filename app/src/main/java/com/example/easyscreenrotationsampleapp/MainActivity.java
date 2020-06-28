package com.example.easyscreenrotationsampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Main", "onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Main", "onStart()");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("Main", "onResume()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Main", "onDestory");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Main", "onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Main", "onPause");
    }
}
