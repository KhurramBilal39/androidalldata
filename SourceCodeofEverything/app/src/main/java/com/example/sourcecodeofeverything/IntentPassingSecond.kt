package com.example.sourcecodeofeverything

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class IntentPassingSecond : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val tvtext:TextView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_passing_second)

        val froAct:Intent = intent

       val title = froAct.getStringExtra("StudentName")
        val College = froAct.getStringExtra("CollegeName")
        val rollNo = froAct.getIntExtra("Roll No",0)

         tvtext = findViewById(R.id.tvText)

        tvtext.text = "Roll No of Student is $rollNo and Name is $title"
        supportActionBar?.title = "$College"
    }
}