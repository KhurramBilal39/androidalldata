package com.example.sourcecodeofeverything


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar


@Suppress("DEPRECATION")
class CustomToolbar : AppCompatActivity() {

    lateinit var toolbar:Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     setContentView(R.layout.activity_custom_toolbar)

        toolbar  = findViewById(R.id.toolbar)

        setSupportActionBar(toolbar)

        if(supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.title = "My ToolBar"
        }




    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.opt_menu,menu)
        return super.onCreateOptionsMenu(menu)


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val itemid:Int  = item.itemId
        if (itemid == R.id.folder){
            Toast.makeText(this,"Created New Folder",Toast.LENGTH_SHORT).show()
        }else if(itemid==R.id.contact){
            Toast.makeText(this,"Contact Number",Toast.LENGTH_SHORT).show()
        }else if (itemid == android.R.id.home){
            super.onBackPressed()
        }else{
            Toast.makeText(this,"Setting is Saved",Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}