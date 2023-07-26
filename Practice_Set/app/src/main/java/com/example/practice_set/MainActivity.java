package com.example.practice_set;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvFirst,tvWay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvFirst=findViewById(R.id.btnFirst);
        tvWay=findViewById(R.id.btnFirstWay);

   tvFirst.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Toast.makeText(MainActivity.this, "First Layout", Toast.LENGTH_SHORT).show();
       }
   });
   tvWay.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Toast.makeText(MainActivity.this, "First Way", Toast.LENGTH_SHORT).show();
       }
   });
    }
}