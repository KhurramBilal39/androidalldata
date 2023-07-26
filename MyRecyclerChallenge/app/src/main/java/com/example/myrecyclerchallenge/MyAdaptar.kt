package com.example.myrecyclerchallenge

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MyAdaptar(val c: Context, val songs:List<Songs>): RecyclerView.Adapter<MyAdaptar.MyViewHolder>() {

   // private var lastPostion = -1;

    class MyViewHolder(itemView: View) :ViewHolder(itemView){
        var txtTitle = itemView.findViewById<TextView>(R.id.txtTitle)
        var txtDescription = itemView.findViewById<TextView>(R.id.txtDescription)
        var images = itemView.findViewById<ImageView>(R.id.imag)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_list,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtTitle.text = songs[position].title
        holder.txtDescription.text = songs[position].Description
        holder.images.setImageResource(songs[position].images)
        setAnimation(holder.itemView,position )
    }
    private fun setAnimation(viewtoAnimate:View,position: Int){
//        if(position>lastPostion){
            val slideIn: Animation = AnimationUtils.loadAnimation(this.c,android.R.anim.slide_in_left)
            viewtoAnimate.startAnimation(slideIn)
           // lastPostion = position
        //}

    }
}