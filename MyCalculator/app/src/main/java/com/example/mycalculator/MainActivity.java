package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText etFirstvalue,etSecondvalue;
    TextView tvAns;
    Button Add,Sub,Multi,divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstvalue = findViewById(R.id.etFirstValue);
        etSecondvalue = findViewById(R.id.etSecondvalue);

        tvAns = findViewById(R.id.tvAns);

        Add = findViewById(R.id.btnAdd);
        Sub = findViewById(R.id.btnSub);
        divide = findViewById(R.id.btnDiiv);
        Multi = findViewById(R.id.btnMul);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int FirstValue,SecondValue,Ans;
                FirstValue = Integer.parseInt(etFirstvalue.getText().toString());
                SecondValue = Integer.parseInt(etSecondvalue.getText().toString());
                Ans = FirstValue+SecondValue;
                tvAns.setText("After operation ans is: "+Ans);
            }
        });

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int FirstValue,SecondValue,Ans;
                FirstValue = Integer.parseInt(etFirstvalue.getText().toString());
                SecondValue = Integer.parseInt(etSecondvalue.getText().toString());
                Ans = FirstValue-SecondValue;
                tvAns.setText("After operation ans is: "+Ans);
            }
        });

        Multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int FirstValue,SecondValue,Ans;
                FirstValue = Integer.parseInt(etFirstvalue.getText().toString());
                SecondValue = Integer.parseInt(etSecondvalue.getText().toString());
                Ans = FirstValue*SecondValue;
                tvAns.setText("After operation ans is: "+Ans);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int FirstValue,SecondValue,Ans;
                FirstValue = Integer.parseInt(etFirstvalue.getText().toString());
                SecondValue = Integer.parseInt(etSecondvalue.getText().toString());
                Ans = FirstValue/SecondValue;
                tvAns.setText("After operation ans is: "+Ans);
            }
        });
    }
}