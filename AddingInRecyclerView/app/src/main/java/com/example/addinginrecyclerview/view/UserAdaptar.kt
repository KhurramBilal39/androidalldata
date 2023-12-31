package com.example.addinginrecyclerview.view

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.EditText
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.addinginrecyclerview.R
import com.example.addinginrecyclerview.model.UserData

class UserAdaptar(val c:Context,val userList:ArrayList<UserData>):RecyclerView.Adapter<UserAdaptar.UserViewHolder>() {

    private  var lastPostion = -1
    inner class  UserViewHolder(val v: View):RecyclerView.ViewHolder(v){

        var name:TextView
        var number:TextView
        var mMenus:ImageView
        init {
            name = v.findViewById<TextView>(R.id.txtTitle)
            number = v.findViewById<TextView>(R.id.txtDescription)
            mMenus = v.findViewById(R.id.mMenu)
            mMenus.setOnClickListener{ popupMenus(it) }
        }

        @SuppressLint("DiscouragedPrivateApi")
        private fun popupMenus(v: View) {
            val position = userList[adapterPosition]
            val popupMenus = PopupMenu(c,v)
            popupMenus.inflate(R.menu.show_menu)
            popupMenus.setOnMenuItemClickListener {
                when(it.itemId){
                    R.id.editText->{
                        val v = LayoutInflater.from(c).inflate(R.layout.add_item,null)
                        val name = v.findViewById<EditText>(R.id.etName)
                        val number = v.findViewById<EditText>(R.id.etNumber)
                        AlertDialog.Builder(c)
                            .setView(v)
                            .setPositiveButton("Ok"){
                                dialog,_->
                                position.userName = name.text.toString()
                                position.userNumber = number.text.toString()
                                notifyDataSetChanged()
                                Toast.makeText(c,"User information successfully Edited",Toast.LENGTH_SHORT).show()
                                dialog.dismiss()
                            }
                            .setNegativeButton("Cancel"){
                                dialog,_->
                                dialog.dismiss()
                            }
                            .create()
                            .show()

                        true
                    }
                    R.id.delete->{

                        AlertDialog.Builder(c)
                            .setTitle("Delete")
                            .setIcon(R.drawable.ic_warning)
                            .setPositiveButton("Yes"){
                                dialog,_->
                                userList.removeAt(adapterPosition)
                                notifyDataSetChanged()
                                Toast.makeText(c,"Deleted This Information",Toast.LENGTH_SHORT).show()
                                dialog.dismiss()
                            }
                            .setNegativeButton("No"){
                                dialog,_->
                                dialog.dismiss()
                            }
                            .create()
                            .show()

                        true
                    }
                    else->true
                }

            }
            popupMenus.show()
            val popup = PopupMenu::class.java.getDeclaredField("mPopup")
            popup.isAccessible = true
            val menu = popup.get(popupMenus)
            menu.javaClass.getDeclaredMethod("setForceShowIcon",Boolean::class.java)
                .invoke(menu,true)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v = inflater.inflate(R.layout.item_list,parent,false)
        return UserViewHolder(v)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val newList = userList[position]
        holder.name.text = newList.userName
        holder.number.text = newList.userNumber

        setAnimation(holder.itemView,position )
    }
    private fun setAnimation(viewtoAnimate:View,position: Int){
        if(position>lastPostion){
       val slideIn:Animation = AnimationUtils.loadAnimation(c,android.R.anim.slide_in_left)
        viewtoAnimate.startAnimation(slideIn)
        lastPostion = position
    }

    }
}