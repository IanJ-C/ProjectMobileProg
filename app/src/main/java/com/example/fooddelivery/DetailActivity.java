package com.example.fooddelivery;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class DetailActivity extends AppCompatActivity {

    FrameLayout detailFragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        detailFragmentContainer = findViewById(R.id.detailFragmentContainer);

        loadFragment(new SecondFragment());
    }

    private void loadFragment(Fragment selectedFragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.detailFragmentContainer, selectedFragment);
        transaction.commit();
    }
}