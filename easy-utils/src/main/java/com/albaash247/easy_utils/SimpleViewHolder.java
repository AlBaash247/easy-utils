package com.albaash247.easy_utils;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SimpleViewHolder extends RecyclerView.ViewHolder {
    public ImageView ivImg;
    public TextView tvTitle;
    public TextView tvDetails;


    public SimpleViewHolder(@NonNull View itemView) {
        super(itemView);
        ivImg = itemView.findViewById(R.id.ivImg);
        tvTitle = itemView.findViewById(R.id.tvTitle);
        tvDetails = itemView.findViewById(R.id.tvDetails);
    }
}
