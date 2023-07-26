package com.example.recycelerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import Adapators.CartoonAdapators;
import CartoonModel.CartoonModels;

public class MainActivity extends AppCompatActivity {
    RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler =  findViewById(R.id.recyclerView);

        ArrayList<CartoonModels> list = new ArrayList<>();

        list.add(new CartoonModels(R.drawable.a,"Saskea"));
        list.add(new CartoonModels(R.drawable.b,"Teacher"));
        list.add(new CartoonModels(R.drawable.c,"Naruto"));
        list.add(new CartoonModels(R.drawable.d,"Naruto"));
        list.add(new CartoonModels(R.drawable.e,"Itachi"));
        list.add(new CartoonModels(R.drawable.f,"Hacking"));
//        list.add(new CartoonModels(R.drawable.g,"Saskea"));
        list.add(new CartoonModels(R.drawable.h,"Black Widow"));
        list.add(new CartoonModels(R.drawable.i,"Window 11"));
        list.add(new CartoonModels(R.drawable.j,"Man"));
        list.add(new CartoonModels(R.drawable.k,"Binart"));
        list.add(new CartoonModels(R.drawable.l,"Joker"));
        list.add(new CartoonModels(R.drawable.m,"Offline"));

        CartoonAdapators adapators = new CartoonAdapators(list,this);
        recycler.setAdapter(adapators);

        LinearLayoutManager LayoutManager= new LinearLayoutManager(this);
        recycler.setLayoutManager(LayoutManager);
    }
}