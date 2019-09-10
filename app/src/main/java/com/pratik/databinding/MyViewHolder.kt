package com.pratik.databinding

import android.app.PendingIntent.getActivity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.pratik.databinding.databinding.ItemLayoutBinding

class MyViewHolder(context: Context, binding: ItemLayoutBinding):
    RecyclerView.ViewHolder(binding.root) {

    private var myBinding:ItemLayoutBinding? = null
    private var myContext:Context? = null
    init{
      myBinding = binding
      myContext =  context

    }
    fun bindView(user: User){
        myBinding?.user = user
        myBinding?.textView3?.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(myContext, user.name, Toast.LENGTH_LONG).show()
            }
        })
    }

}