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

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.MyViewHolder>{

    Context context;
    ArrayList<Popular> popularArrayList;

    public PopularAdapter(Context context, ArrayList<Popular> popularArrayList) {
        this.context = context;
        this.popularArrayList = popularArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.popular_layout, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Popular popular = popularArrayList.get(position);
        holder.menuName2.setText(popular.menuName2);
        holder.menuDesc2.setText(popular.menuDesc2);
        holder.menuPrice2.setText(popular.menuPrice2);
        holder.menuImage2.setImageResource(popular.menuImage2);
    }

    @Override
    public int getItemCount() {
        return popularArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        AppCompatImageView menuImage2;
        TextView menuName2, menuDesc2, menuPrice2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            menuImage2 = itemView.findViewById(R.id.menu_image2);
            menuName2 = itemView.findViewById(R.id.menu_name2);
            menuDesc2 = itemView.findViewById(R.id.menu_desc2);
            menuPrice2 = itemView.findViewById(R.id.menu_price2);
        }
    }
}
