package com.example.serviseapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.serviseapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.startService.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), MyService.class);
            i.putExtra("userName","Safa");
            startService(i);
        });

        binding.stopService.setOnClickListener(v -> {

        });
    }
}