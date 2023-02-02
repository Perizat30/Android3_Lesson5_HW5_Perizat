package com.example.android3_lesson5_hw5_perizat;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.android3_lesson5_hw5_perizat.databinding.ItemBasketballBinding;
import java.util.ArrayList;

public class BasketballAdapter extends RecyclerView.Adapter<BasketballViewHolder>{
    public ArrayList<Basketball> arrayList;
    private final OnItemClick onItemClick;

    public BasketballAdapter(ArrayList<Basketball> arrayList, OnItemClick onItemClick) {
        this.arrayList = arrayList;
        this.onItemClick=onItemClick;
    }

    @NonNull
    @Override
    public BasketballViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BasketballViewHolder(ItemBasketballBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull BasketballViewHolder holder, int position) {
        holder.onBind(arrayList.get(position));
        holder.itemView.setOnClickListener(v -> onItemClick.OnClick(arrayList.get(holder.getAdapterPosition())));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}

class BasketballViewHolder extends RecyclerView.ViewHolder {
    ItemBasketballBinding binding;

    public BasketballViewHolder(ItemBasketballBinding binding) {
        super(binding.getRoot());
        this.binding=binding;
    }

    void onBind(Basketball basketball){
        binding.textViewTitle.setText(basketball.getName());
        binding.textViewSezon.setText(basketball.getSeason());
        Glide.with(this.itemView).load(basketball.getImage()).into(binding.imageViewIcon);

    }
}