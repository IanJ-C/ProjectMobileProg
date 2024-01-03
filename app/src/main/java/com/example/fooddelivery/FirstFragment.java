package com.example.fooddelivery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    ArrayList<Makanan> menuArrayList;
    ArrayList<Deals> dealsArrayList;
    ArrayList<Popular> popularArrayList;
    ArrayList<Recent> recentArrayList;
    private int[] menuImage1, menuImage2, menuImage3;
    private String[] menuName1, menuName2, menuName3;
    private String[] menuDesc1, menuDesc2, menuDesc3;
    private String[] menuPrice1, menuPrice2, menuPrice3;
    private RecyclerView dealsRecycler, popularRecycler, recentRecycler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        dataInitialize();
        dataInitialize2();
        dataInitialize3();

        LinearLayoutManager dealsLayoutManager
                = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);

        LinearLayoutManager popularLayoutManager
                = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);

        LinearLayoutManager reecentLayoutManager
                = new LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false);

        dealsRecycler = view.findViewById(R.id.deals_recycler);
        dealsRecycler.setLayoutManager(dealsLayoutManager);
        dealsRecycler.setHasFixedSize(true);
        DealsAdapter dealsAdapter = new DealsAdapter(getContext(), dealsArrayList);
        dealsRecycler.setAdapter(dealsAdapter);
        dealsAdapter.notifyDataSetChanged();

        popularRecycler = view.findViewById(R.id.popular_recycler);
        popularRecycler.setLayoutManager(popularLayoutManager);
        popularRecycler.setHasFixedSize(true);
        PopularAdapter popularAdapter = new PopularAdapter(getContext(), popularArrayList);
        popularRecycler.setAdapter(dealsAdapter);
        popularAdapter.notifyDataSetChanged();

        recentRecycler = view.findViewById(R.id.recent_recycler);
        recentRecycler.setLayoutManager(reecentLayoutManager);
        recentRecycler.setHasFixedSize(true);
        RecentAdapter recentAdapter = new RecentAdapter(getContext(), recentArrayList);
        recentRecycler.setAdapter(dealsAdapter);
        popularAdapter.notifyDataSetChanged();
    }

    private void dataInitialize(){
        dealsArrayList = new ArrayList<>();

        menuImage1 = new int[]{
                R.drawable.burger,
                R.drawable.fried_chicken,
                R.drawable.pizza,
                R.drawable.spaghetti,
                R.drawable.salad,
                R.drawable.tofu_stew,
                R.drawable.brownie,
                R.drawable.smoothie
        };

        menuName1 = new String[]{
                "Beef Burger",
                "Chicken",
                "Pizza",
                "Spaghetti",
                "Salad",
                "Tofu Stew",
                "Brownie",
                "Smoothie"
        };

        menuDesc1 = new String[]{
                "Burger with Beef Patty",
                "Crispy Fried Chicken",
                "Toppings and Mozarella",
                "Mushroom Sauce Pasta",
                "Healthy Vegetables",
                "Tofu in Spicy Soup",
                "Sweet Chocolate Dessert",
                "Fruit & Berry Smoothie"
        };

        menuPrice1 = new  String[]{
                "Rp.40.000",
                "Rp.30.000",
                "Rp.80.000",
                "Rp.35.000",
                "Rp.20.000",
                "Rp.30.000",
                "Rp.15.000",
                "Rp.25.000"
        };

        for (int i = 0; i < menuImage1.length; i++){
            Deals deals = new Deals(menuImage1[i], menuName1[i], menuDesc1[i], menuPrice1[i]);
            dealsArrayList.add(deals);
        }
    }

    private void dataInitialize2(){
        popularArrayList = new ArrayList<>();

        menuImage2 = new int[]{
                R.drawable.burger,
                R.drawable.fried_chicken,
                R.drawable.pizza,
                R.drawable.spaghetti,
                R.drawable.salad,
                R.drawable.tofu_stew,
                R.drawable.brownie,
                R.drawable.smoothie
        };

        menuName2 = new String[]{
                "Beef Burger",
                "Chicken",
                "Pizza",
                "Spaghetti",
                "Salad",
                "Tofu Stew",
                "Brownie",
                "Smoothie"
        };

        menuDesc2 = new String[]{
                "Burger with Beef Patty",
                "Crispy Fried Chicken",
                "Toppings and Mozarella",
                "Mushroom Sauce Pasta",
                "Healthy Vegetables",
                "Tofu in Spicy Soup",
                "Sweet Chocolate Dessert",
                "Fruit & Berry Smoothie"
        };

        menuPrice2 = new  String[]{
                "Rp.40.000",
                "Rp.30.000",
                "Rp.80.000",
                "Rp.35.000",
                "Rp.20.000",
                "Rp.30.000",
                "Rp.15.000",
                "Rp.25.000"
        };

        for (int i = 0; i < menuImage2.length; i++){
            Popular popular = new Popular(menuImage2[i], menuName2[i], menuDesc2[i], menuPrice2[i]);
            popularArrayList.add(popular);
        }
    }

    private void dataInitialize3(){
        recentArrayList = new ArrayList<>();

        menuImage3 = new int[]{
                R.drawable.burger,
                R.drawable.fried_chicken,
                R.drawable.pizza,
                R.drawable.spaghetti,
                R.drawable.salad,
                R.drawable.tofu_stew,
                R.drawable.brownie,
                R.drawable.smoothie
        };

        menuName3 = new String[]{
                "Beef Burger",
                "Chicken",
                "Pizza",
                "Spaghetti",
                "Salad",
                "Tofu Stew",
                "Brownie",
                "Smoothie"
        };

        menuDesc3 = new String[]{
                "Burger with Beef Patty",
                "Crispy Fried Chicken",
                "Toppings and Mozarella",
                "Mushroom Sauce Pasta",
                "Healthy Vegetables",
                "Tofu in Spicy Soup",
                "Sweet Chocolate Dessert",
                "Fruit & Berry Smoothie"
        };

        menuPrice3 = new  String[]{
                "Rp.40.000",
                "Rp.30.000",
                "Rp.80.000",
                "Rp.35.000",
                "Rp.20.000",
                "Rp.30.000",
                "Rp.15.000",
                "Rp.25.000"
        };

        for (int i = 0; i < menuImage3.length; i++){
            Recent recent = new Recent(menuImage3[i], menuName3[i], menuDesc3[i], menuPrice3[i]);
            recentArrayList.add(recent);
        }
    }
}