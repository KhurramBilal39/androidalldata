package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.fooddelivery.Adapators.OrderAdapators;
import com.example.fooddelivery.Models.OrderModels;
import com.example.fooddelivery.databinding.ActivityOrderBinding;

import java.util.ArrayList;

public class OrderActivity extends AppCompatActivity {
    ActivityOrderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityOrderBinding.inflate(getLayoutInflater());

        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());


        DBHelper helper= new DBHelper(this);
        ArrayList<OrderModels> list = helper.getOrders();

        //ArrayList<OrderModels> list = new ArrayList<>();



        OrderAdapators adapators = new OrderAdapators(list,this);
       binding.orderRecycelerView.setAdapter(adapators);

        LinearLayoutManager linearLayout = new LinearLayoutManager(this);
         binding.orderRecycelerView.setLayoutManager(linearLayout);
    }
}