package com.example.myrecycler

import android.annotation.SuppressLint
import android.content.Context
import android.provider.ContactsContract.CommonDataKinds.Im
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdaptar(val arrContacts:ArrayList<ContactModel>) : RecyclerView.Adapter<RecyclerAdaptar.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.contact_row,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.txtname.text = arrContacts[position].name
        holder.contactNo.text = arrContacts[position].number
        holder.image.setImageResource(arrContacts[position].img)

    }

    override fun getItemCount(): Int {
        return arrContacts.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var txtname = itemView.findViewById<TextView>(R.id.txtName)
        var contactNo = itemView.findViewById<TextView>(R.id.contactNumber)
        var image = itemView.findViewById<ImageView>(R.id.imag)
    }

}
