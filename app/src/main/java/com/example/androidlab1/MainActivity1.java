package com.example.androidlab1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        Button responseButton = findViewById(R.id.response_button);
        responseButton.setOnClickListener(view -> Toast.makeText(MainActivity1.this, "Hello back!", Toast.LENGTH_LONG).show());
    }
}
