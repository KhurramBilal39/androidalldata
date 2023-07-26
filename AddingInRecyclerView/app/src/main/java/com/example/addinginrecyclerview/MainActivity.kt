package com.example.addinginrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.addinginrecyclerview.model.UserData
import com.example.addinginrecyclerview.view.UserAdaptar
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var addsBtn:FloatingActionButton
    private lateinit var recy:RecyclerView
    private lateinit var userList:ArrayList<UserData>
    private lateinit var userAdapater:UserAdaptar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // set List
        userList = ArrayList()
        // set findViewbyID
        addsBtn = findViewById(R.id.fbBtn)
        recy = findViewById(R.id.rCAdd)
        //  set Adapter
        userAdapater = UserAdaptar(this,userList)
        // set Recycler Adapter
        recy.layoutManager= LinearLayoutManager(this)
        recy.adapter = userAdapater
        // set DialogBox
        addsBtn.setOnClickListener{ addInfo() }

    }

    private fun addInfo() {
        val inflater = LayoutInflater.from(this)
        val v = inflater.inflate(R.layout.add_item,null)
        val addDialog = AlertDialog.Builder(this)
        // set View
        val userName = v.findViewById<EditText>(R.id.etName)
        val userNo = v.findViewById<EditText>(R.id.etNumber)
        addDialog.setView(v)
        addDialog.setPositiveButton("Ok"){
            dialog,_->
            val userNames = userName.text.toString()
            val userNumbers = userNo.text.toString()
           userList.add(UserData("Name: $userNames","Mobile Number. : $userNumbers"))
            userAdapater.notifyDataSetChanged()
            Toast.makeText(this,"Adding User Information Sucessfully",Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }
        addDialog.setNegativeButton("Cancel"){
            dialog,_->
            dialog.dismiss()
            Toast.makeText(this,"Cancel",Toast.LENGTH_SHORT).show()
        }
        addDialog.create()
        addDialog.show()
    }
}