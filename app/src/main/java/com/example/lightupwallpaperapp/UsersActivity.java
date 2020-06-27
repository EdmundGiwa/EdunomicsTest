package com.example.lightupwallpaperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class UsersActivity extends AppCompatActivity {

    private static final String[] USERNAMES = new String[]{
      "Alison", "Alice", "Alfred", "Aye", "Bella", "Beauty", "Bell", "Cathrine", "Cathy"
      , "Catino", "Dab", "Doroughty", "Ella", "Euniece", "Eniola", "John", "Edmund", "Isaac"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(Color.rgb(255,255,255));
        setContentView(R.layout.activity_users);


        AutoCompleteTextView editTextView = findViewById(R.id.actv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, USERNAMES);
        editTextView.setAdapter(adapter);
    }
}