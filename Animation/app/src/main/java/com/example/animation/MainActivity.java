package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {
    LottieAnimationView animationView;
    Button button , demo;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        getSupportActionBar().hide();

        demo = findViewById(R.id.demo);
        dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.dialogbox);
        //dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);

        Button Yes = dialog.findViewById(R.id.yes);
        Button No = dialog.findViewById(R.id.no);

        Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You click on NO", Toast.LENGTH_SHORT).show();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.show();
            }
        });


        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        animationView = findViewById(R.id.animation);
        button = findViewById(R.id.demo);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animationView.setVisibility(View.VISIBLE);
                button.setVisibility(View.INVISIBLE);
                animationView.playAnimation();
                Thread td =new Thread(){
                    public void run()
                    {
                        try {
                            sleep(1000);
                        }
                        catch (Exception e){
                            e.printStackTrace();
                        }
                        finally {
                            Intent intent = new Intent(MainActivity.this,Demo.class);
                            startActivity(intent);
                            finish();
                        }
                    }

                };td.start();
            }
        });
        Intent intent = new Intent(this,ServiceExamp.class);
        ContextCompat.startForegroundService(this,intent);

    }
}