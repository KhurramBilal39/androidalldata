
package com.example.fooddelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.fooddelivery.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {


    ActivityDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());

       final int image = getIntent().getIntExtra("image",0);
       final int price = Integer.parseInt(getIntent().getStringExtra("price"));
        final String descripation = getIntent().getStringExtra("descripation");
       final String name = getIntent().getStringExtra("name");

        binding.detailImage.setImageResource(image);
        binding.detailPrice.setText(String.format("%d",price));
        binding.detailDescripation.setText(descripation);
        binding.detailfoodname.setText(name);

        DBHelper helper =   new DBHelper(this);

        binding.orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               boolean isInserted = helper.insertOrder(
                        binding.boxUser.getText().toString(),
                        binding.boxPhone.getText().toString(),
                        price,
                        image,
                        name,
                        descripation,
                        Integer.parseInt(binding.detailQuantity.getText().toString())
                );
               if (isInserted){
                   Toast.makeText(DetailActivity.this, "Data successfully inserted", Toast.LENGTH_SHORT).show();
               }else
                   Toast.makeText(DetailActivity.this, "Error occur", Toast.LENGTH_SHORT).show();
            }
        });
    }
}