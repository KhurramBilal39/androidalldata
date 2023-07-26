package com.example.myrecyclerchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val songObjects = mutableListOf<Songs>()
        val songsList = findViewById<RecyclerView>(R.id.songList)

        songObjects.add(Songs(R.drawable.ma,"A","Hello Sir"))
        songObjects.add(Songs(R.drawable.mannn,"B","Hello Hassan"))
        songObjects.add(Songs(R.drawable.mann,"C","Hello Khurram"))
        songObjects.add(Songs(R.drawable.woman,"D","Hello Bilal"))
        songObjects.add(Songs(R.drawable.wom,"F","Hello Usman"))
        songObjects.add(Songs(R.drawable.ma,"G","Hello Kamran"))
        songObjects.add(Songs(R.drawable.mannn,"H","Hello Farhan"))
        songObjects.add(Songs(R.drawable.mann,"I","Hello Sultan"))
        songObjects.add(Songs(R.drawable.ma,"J","Hello Sir"))
        songObjects.add(Songs(R.drawable.man,"K","Hello Sir"))
        songObjects.add(Songs(R.drawable.mannn,"L","Hello Sir"))
        songObjects.add(Songs(R.drawable.mann,"M","Hello Sir"))
        songObjects.add(Songs(R.drawable.man,"N","Hello Sir"))
        songObjects.add(Songs(R.drawable.woman,"O","Hello Sir"))
        songObjects.add(Songs(R.drawable.ma,"P","Hello Sir"))

        songsList.adapter = MyAdaptar(this,songObjects)
        songsList.layoutManager = LinearLayoutManager(this)
    }
}