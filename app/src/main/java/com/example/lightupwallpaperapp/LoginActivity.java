package com.example.lightupwallpaperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setStatusBarColor(Color.rgb(0,0,0));

        setContentView(R.layout.activity_login);
    }

    public void openUsers(View view) {
        Intent intent = new Intent(LoginActivity.this, UsersActivity.class);
        startActivity(intent);
    }
}