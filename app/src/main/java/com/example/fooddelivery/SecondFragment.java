package com.example.fooddelivery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    ArrayList<Makanan> menuArrayList;
    private int[] menuImage;
    private String[] menuName;
    private String[] menuDesc;
    private String[] menuPrice;
    private RecyclerView recyclerview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        dataInitialize();

        recyclerview = view.findViewById(R.id.menu_recycler);
        recyclerview.setLayoutManager(new GridLayoutManager(getContext(), 2));
        recyclerview.setHasFixedSize(true);
        MenuAdapter menuAdapter = new MenuAdapter(getContext(), menuArrayList);
        recyclerview.setAdapter(menuAdapter);
        menuAdapter.notifyDataSetChanged();
    }

    private void dataInitialize(){
        menuArrayList = new ArrayList<>();

        menuImage = new int[]{
            R.drawable.burger,
            R.drawable.burger,
            R.drawable.burger,
            R.drawable.burger,
            R.drawable.burger,
            R.drawable.burger,
            R.drawable.burger,
            R.drawable.burger
        };

        menuName = new String[]{
            "Beef Burger",
            "Beef Burger",
            "Beef Burger",
            "Beef Burger",
            "Beef Burger",
            "Beef Burger",
            "Beef Burger",
            "Beef Burger",
            "Beef Burger"
        };

        menuDesc = new String[]{
            "Burger with Beef Patty",
            "Burger with Beef Patty",
            "Burger with Beef Patty",
            "Burger with Beef Patty",
            "Burger with Beef Patty",
            "Burger with Beef Patty",
            "Burger with Beef Patty",
            "Burger with Beef Patty",
            "Burger with Beef Patty"
        };

        menuPrice = new  String[]{
            "Rp.40.000",
            "Rp.40.000",
            "Rp.40.000",
            "Rp.40.000",
            "Rp.40.000",
            "Rp.40.000",
            "Rp.40.000",
            "Rp.40.000",
            "Rp.40.000"
        };

        for (int i = 0; i < menuImage.length; i++){
            Makanan makanan = new Makanan(menuImage[i], menuName[i], menuDesc[i], menuPrice[i]);
            menuArrayList.add(makanan);
        }
    }
}
