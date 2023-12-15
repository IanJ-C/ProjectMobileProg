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

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MyViewHolder>{

    Context context;
    ArrayList<Makanan> menuArrayList;

    public MenuAdapter(Context context, ArrayList<Makanan> menuArrayList) {
        this.context = context;
        this.menuArrayList = menuArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.menu_layout, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Makanan makanan = menuArrayList.get(position);
        holder.menuName.setText(makanan.menuName);
        holder.menuDesc.setText(makanan.menuDesc);
        holder.menuPrice.setText(makanan.menuPrice);
        holder.menuImage.setImageResource(makanan.menuImage);
    }

    @Override
    public int getItemCount() {
        return menuArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        AppCompatImageView menuImage;
        TextView menuName, menuDesc, menuPrice;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            menuImage = itemView.findViewById(R.id.menu_image);
            menuName = itemView.findViewById(R.id.menu_name);
            menuDesc = itemView.findViewById(R.id.menu_desc);
            menuPrice = itemView.findViewById(R.id.menu_price);
        }
    }
}
