package com.example.restrictusertotakingscreenshot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

public class TopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE,WindowManager.LayoutParams.FLAG_SECURE);

    }
}