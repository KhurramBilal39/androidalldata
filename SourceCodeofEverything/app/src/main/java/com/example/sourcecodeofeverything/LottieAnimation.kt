package com.example.sourcecodeofeverything

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.airbnb.lottie.LottieAnimationView

class LottieAnimation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val laView: LottieAnimationView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lottie_animation)

        laView = findViewById(R.id.laView)
        laView.setAnimation(R.raw.tictactoe)
        laView.playAnimation()
        laView.loop(true)
        Handler(Looper.getMainLooper()).postDelayed(
            {
                val lotAnim:Intent = Intent(this@LottieAnimation,MainActivity::class.java)
                startActivity(lotAnim)
                finish()
            },
        4000)
    }
}