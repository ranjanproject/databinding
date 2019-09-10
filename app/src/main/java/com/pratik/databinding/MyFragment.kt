package com.pratik.databinding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.pratik.databinding.databinding.FragmentLayoutBinding

class MyFragment: Fragment() {
    private val listUser = listOf<User>(User("Pratik Ranjan", "21"),
        User("name1", "21"),
        User("name2", "22"),
        User("name3", "21"),
        User("name4", "22"),
        User("name4", "21"),
        User("name5", "22"),
        User("name6", "22"))

    lateinit var binding: FragmentLayoutBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_layout, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }
    private fun init(){
        //initialize viewModel here

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = MyAdapter(context,listUser)
        }

       Toast.makeText(activity, "myfragment", Toast.LENGTH_LONG).show()
    }

}