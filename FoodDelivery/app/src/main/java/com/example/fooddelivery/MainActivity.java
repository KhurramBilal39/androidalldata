package com.example.fooddelivery;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.example.fooddelivery.Adapators.MainAdapators;
import com.example.fooddelivery.Models.MainModel;
import com.example.fooddelivery.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding =  ActivityMainBinding.inflate(getLayoutInflater());

        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.b,"2","Full chesse Burger","Burger"));
        list.add(new MainModel(R.drawable.bb,"7","Full chesse Burger","Burger"));
        list.add(new MainModel(R.drawable.bb,"5","Full chesse Burger","Burger"));
        list.add(new MainModel(R.drawable.bbb,"3","Full chesse Burger","Burger"));
        list.add(new MainModel(R.drawable.fries,"1","Full chesse Burger","Fries"));
        list.add(new MainModel(R.drawable.no,"2","Full chesse Burger","Noodles"));

        MainAdapators adapators = new MainAdapators(list,this);
        binding.recyclerView.setAdapter(adapators);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recyclerView.setLayoutManager(layoutManager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.order:
                startActivity(new Intent(MainActivity.this,OrderActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}