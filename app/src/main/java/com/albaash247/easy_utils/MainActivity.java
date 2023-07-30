package com.albaash247.easy_utils;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private SimpleRVAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter = new SimpleRVAdapter();
        RecyclerView rvItems = findViewById(R.id.rvItems);


        rvItems.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        rvItems.setAdapter(mAdapter);


        Button btnAdd1Item = findViewById(R.id.btnAdd1Item);
        Button btnAddItems = findViewById(R.id.btnAddItems);
        Button btnSetItems = findViewById(R.id.btnSetItems);
        Button btnClear = findViewById(R.id.btnClear);

        btnAdd1Item.setOnClickListener(view -> add1Item());
        btnAddItems.setOnClickListener(view -> addItems());
        btnSetItems.setOnClickListener(view -> setItems());
        btnClear.setOnClickListener(view -> mAdapter.clear());
    }


    private void add1Item() {
        MyItem i = new MyItem();
        i.setImgUrl("https://www.deleukstetaartenshop.com/media/catalog/product/m/y/my_project_2_2.png");
        i.setTitle("an Item");
        i.setDetails("added by add1Item() function");
        mAdapter.addItems(i);
    }

    private void addItems() {
        ArrayList<MyItem> itemArrayList = new ArrayList<>();

        MyItem i;

        i = new MyItem();
        i.setImgUrl("https://img.taste.com.au/hbNtzI2Q/taste/2021/08/clinkers-cake-173208-2.jpg");
        i.setTitle("item 1");
        i.setDetails("added by addItems() function");
        itemArrayList.add(i);

        i = new MyItem();
        i.setImgUrl("https://www.lifeloveandsugar.com/wp-content/uploads/2014/08/Best-Moist-Chocolate-Cake1-1.jpg");
        i.setTitle("item 2");
        i.setDetails("added by addItems() function");
        itemArrayList.add(i);

        i = new MyItem();
        i.setImgUrl("https://insanelygoodrecipes.com/wp-content/uploads/2022/05/Sweet-Homemade-Chocolate-Ice-Cream-Cake-500x500.jpg");
        i.setTitle("item 3");
        i.setDetails("added by addItems() function");
        itemArrayList.add(i);

        mAdapter.addItems(itemArrayList);
    }

    private void setItems() {
        ArrayList<MyItem> itemArrayList = new ArrayList<>();

        MyItem i;

        i = new MyItem();
        i.setImgUrl("https://hips.hearstapps.com/hmg-prod/images/wdy050121lifeoftheparty-003-1621611282.jpg?crop=0.998xw:0.337xh;0,0.276xh&resize=1200:*");
        i.setTitle("item 1");
        i.setDetails("added by setItems() function");
        itemArrayList.add(i);

        i = new MyItem();
        i.setImgUrl("https://www.blessthismessplease.com/wp-content/uploads/2021/07/chocolate-candy-cake-3.jpg");
        i.setTitle("item 2");
        i.setDetails("added by setItems() function");
        itemArrayList.add(i);

        i = new MyItem();
        i.setImgUrl("https://realfood.tesco.com/media/images/1400x919-ApprovedTescoFestiveStreetFood6919ClassicCristmasCake-5aac3563-6153-4213-a444-3f2e215e64cd-0-1400x919.jpg");
        i.setTitle("item 3");
        i.setDetails("added by setItems() function");
        itemArrayList.add(i);

        mAdapter.setItems(itemArrayList);
    }



}