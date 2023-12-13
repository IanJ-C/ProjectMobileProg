package com.example.fooddelivery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class SecondFragment extends Fragment {
    View myView;
    Button callBtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.fragment_second, container, false);

        callBtn = myView.findViewById(R.id.callBtn);
        
        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(myView.getContext(), "Toast dari fragment", Toast.LENGTH_SHORT).show();
            }
        });

        loadFragment(new FirstFragment());

        return myView;
    }

    private void loadFragment(Fragment selectedFragment){
        FragmentManager manager = getChildFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.secondFragmentContainer, selectedFragment);
        transaction.commit();
    }
}
