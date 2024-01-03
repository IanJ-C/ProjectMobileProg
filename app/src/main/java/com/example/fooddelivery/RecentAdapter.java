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

public class RecentAdapter extends RecyclerView.Adapter<RecentAdapter.MyViewHolder>{

    Context context;
    ArrayList<Recent> recentArrayList;

    public RecentAdapter(Context context, ArrayList<Recent> recentArrayList) {
        this.context = context;
        this.recentArrayList = recentArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.recent_layout, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Recent recent = recentArrayList.get(position);
        holder.menuName3.setText(recent.menuName3);
        holder.menuDesc3.setText(recent.menuDesc3);
        holder.menuPrice3.setText(recent.menuPrice3);
        holder.menuImage3.setImageResource(recent.menuImage3);
    }

    @Override
    public int getItemCount() {
        return recentArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        AppCompatImageView menuImage3;
        TextView menuName3, menuDesc3, menuPrice3;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            menuImage3 = itemView.findViewById(R.id.menu_image3);
            menuName3 = itemView.findViewById(R.id.menu_name3);
            menuDesc3 = itemView.findViewById(R.id.menu_desc3);
            menuPrice3 = itemView.findViewById(R.id.menu_price3);
        }
    }
}
