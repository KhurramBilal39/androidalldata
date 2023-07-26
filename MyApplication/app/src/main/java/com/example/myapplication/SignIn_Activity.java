package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignIn_Activity extends AppCompatActivity {

    TextView tv_SignUp;
    Button Sign_in;
    EditText tv_User_Gmail,tv_Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        getSupportActionBar().setTitle("Sign In");
        Sign_in=findViewById(R.id.btn_SignIn);
        tv_User_Gmail=findViewById(R.id.tv_user_gmail);
        tv_Password =  findViewById(R.id.tv_password);
    Sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tv_User_Gmail.getText().toString().equals("KhurramBilal@gmail.com")) {
                    if (tv_Password.getText().toString().equals("Pakistan122")) {
                        Toast.makeText(SignIn_Activity.this, "Weclome Khurram Bilal", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(SignIn_Activity.this, nextpageoflogin.class);
                        startActivity(intent);

                    } else {
                        Toast.makeText(SignIn_Activity.this, "Your Password is Icorrect", Toast.LENGTH_SHORT).show();
                    }
                } else {

                    Toast.makeText(SignIn_Activity.this, "Your Gmail is incorrect", Toast.LENGTH_LONG).show();
                }
            }




        });
        tv_SignUp=findViewById(R.id.tv_SignUp);
        tv_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignIn_Activity.this, "You click on create new Account", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(SignIn_Activity.this,SignUp_Activity.class);
                startActivity(intent);
            }
        });
    }
}