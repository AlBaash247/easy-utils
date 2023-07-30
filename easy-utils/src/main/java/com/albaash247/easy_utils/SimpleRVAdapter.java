package com.albaash247.easy_utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class SimpleRVAdapter extends RecyclerView.Adapter<SimpleViewHolder> {

    private View mCostumeListItem;

    private ArrayList<MyItem> mItemsArrayList;


    public SimpleRVAdapter() {
        mItemsArrayList = new ArrayList<>();
    }

    @NonNull
    @Override
    public SimpleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return getListItemView(parent);
    }


    @Override
    public void onBindViewHolder(@NonNull SimpleViewHolder holder, int position) {
        MyItem item = mItemsArrayList.get(position);
        Glide
                .with(holder.ivImg.getContext())
                .load(item.getImgUrl())
                .into(holder.ivImg);

        holder.tvTitle.setText(item.getTitle());
        holder.tvDetails.setText(item.getDetails());
    }


    @Override
    public int getItemCount() {
        return mItemsArrayList.size();
    }


    public void addItems(MyItem item) {
        mItemsArrayList.add(item);
        notifyItemInserted(mItemsArrayList.size() - 1);
    }

    public void addItems(ArrayList<MyItem> items) {
        mItemsArrayList.addAll(items);
        notifyItemRangeInserted((mItemsArrayList.size() - items.size()), items.size());
    }

    public void setItems(ArrayList<MyItem> items) {
        clear();
        mItemsArrayList = items;
        notifyItemRangeInserted(0, items.size()-1);
    }

    private void setListItemView(View costumeListItem) {
        mCostumeListItem = costumeListItem;
    }

    public void clear() {
        int size = mItemsArrayList.size();
        mItemsArrayList.clear();
        notifyItemRangeRemoved(0, size);
    }

    private View getDefaultListItemView(ViewGroup parent) {
        View defaultListView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_simple, parent, false);
        return defaultListView;
    }

    private SimpleViewHolder getListItemView(ViewGroup parent) {
        if (mCostumeListItem == null) {
            return new SimpleViewHolder(getDefaultListItemView(parent));
        } else {
            return new SimpleViewHolder(mCostumeListItem);
        }

    }


}
