package com.example.sourcecodeofeverything

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class Animation : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        val myView:View
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animation)

        myView = findViewById(R.id.moveView)
        val tvTic:TextView = findViewById(R.id.tvTicTacToe)
        val btTrans:Button = findViewById(R.id.btnTranslate)
        val btAlpha:Button = findViewById(R.id.btnAplha)
        val btScale:Button = findViewById(R.id.btnScale)
        val btnRotate:Button = findViewById(R.id.btnRotate)



        btTrans.setOnClickListener {
            val move: Animation? = AnimationUtils.loadAnimation(this@Animation,R.anim.move)
            tvTic.startAnimation(move)

            btAlpha.setOnClickListener {

                val alphe:Animation? = AnimationUtils.loadAnimation(this@Animation,R.anim.alpha)
                myView.startAnimation(alphe)
            }
            btnRotate.setOnClickListener {

                val rotate:Animation? = AnimationUtils.loadAnimation(this@Animation,R.anim.rotate)
                myView.startAnimation(rotate)
            }
            btScale.setOnClickListener {

                val scale:Animation? = AnimationUtils.loadAnimation(this@Animation,R.anim.scale)
                myView.startAnimation(scale)
            }
        }
    }
}