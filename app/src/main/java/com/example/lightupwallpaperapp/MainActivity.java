package com.example.lightupwallpaperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(Color.rgb(255,255,255));

        setContentView(R.layout.activity_main);
    }

    public void openLogin(View view) {
        Intent login = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(login);
    }
}
