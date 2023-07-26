package com.example.sourcecodeofeverything

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


         Handler(Looper.getMainLooper()).postDelayed({

             val next:Intent = Intent(this@SplashScreen,MainActivity
             ::class.java)
             startActivity(next)
             finish()

         },3000)



    }
}