package com.pratik.databinding

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pratik.databinding.databinding.ItemLayoutBinding

class MyAdapter(private val context:Context,private val userList: List<User>): RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemLayoutBinding.inflate(inflater, parent, false)
        return MyViewHolder(context,binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       val user = userList[position]
       holder.bindView(user)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

}