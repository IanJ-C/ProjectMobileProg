package com.example.fooddelivery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.fooddelivery.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    FrameLayout fragmenContainer;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new FirstFragment());

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bottomNav.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.home) {
                loadFragment(new FirstFragment());
            } else if (itemId == R.id.menu) {
                loadFragment(new SecondFragment());
            } else if (itemId == R.id.profile) {
                loadFragment(new ThirdFragment());
            }
            return true;
        });

        fragmenContainer = findViewById(R.id.fragmentContainer);

        loadFragment(new FirstFragment());
    }

    private void loadFragment(Fragment selectedFragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragmentContainer, selectedFragment);
        transaction.commit();
    }
}