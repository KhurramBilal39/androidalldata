package com.example.myrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val info = mutableListOf<ContactModel>()
        val recCheck = findViewById<RecyclerView>(R.id.rCView)

        info.add(ContactModel(R.drawable.ma, "Khurram", "52312441"))
        info.add(ContactModel(R.drawable.man, "Usman", "6431411"))
        info.add(ContactModel(R.drawable.mann, "Farhan", "743521"))
        info.add(ContactModel(R.drawable.mannn, "Salman", "8451357"))
        info.add(ContactModel(R.drawable.wom, "Hassan Noor", "1234673"))
        info.add(ContactModel(R.drawable.woman, "Kamran", "175425"))
        info.add(ContactModel(R.drawable.user, "Api", "175425"))

        recCheck.adapter = RecyclerAdaptar(info)
        recCheck.layoutManager = LinearLayoutManager(this)
    }
}