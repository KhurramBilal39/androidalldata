package com.example.sourcecodeofeverything

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntentPassingFirst : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_passing_first)


        val intent = Intent(this@IntentPassingFirst,IntentPassingSecond::class.java)
        intent.putExtra("Roll No",12)
        intent.putExtra("StudentName","Khurram")
        intent.putExtra("CollegeName","St.Patrick")
        val btnNext:Button = findViewById(R.id.btnNext)
        btnNext.setOnClickListener {

            startActivity(intent)
        }



    }
}