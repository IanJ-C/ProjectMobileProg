package com.example.fooddelivery;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DealsAdapter extends RecyclerView.Adapter<DealsAdapter.MyViewHolder>{

    Context context;
    ArrayList<Deals> dealsArrayList;

    public DealsAdapter(Context context, ArrayList<Deals> dealsArrayList) {
        this.context = context;
        this.dealsArrayList = dealsArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.deals_layout, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Deals deals = dealsArrayList.get(position);
        holder.menuName1.setText(deals.menuName1);
        holder.menuDesc1.setText(deals.menuDesc1);
        holder.menuPrice1.setText(deals.menuPrice1);
        holder.menuImage1.setImageResource(deals.menuImage1);
    }

    @Override
    public int getItemCount() {
        return dealsArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        AppCompatImageView menuImage1;
        TextView menuName1, menuDesc1, menuPrice1;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            menuImage1 = itemView.findViewById(R.id.menu_image1);
            menuName1 = itemView.findViewById(R.id.menu_name1);
            menuDesc1 = itemView.findViewById(R.id.menu_desc1);
            menuPrice1 = itemView.findViewById(R.id.menu_price1);
        }
    }
}
