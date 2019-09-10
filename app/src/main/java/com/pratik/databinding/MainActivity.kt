package com.pratik.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pratik.databinding.databinding.ActivityMainBinding
import com.pratik.databinding.databinding.ItemLayoutBinding


class MainActivity : AppCompatActivity() {
    private val listUser = listOf<User>(User("Pratik Ranjan", "21"),
        User("name1", "21"),
        User("name2", "22"),
        User("name3", "21"),
        User("name4", "22"),
        User("name4", "21"),
        User("name5", "22"),
        User("name6", "22"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = MyAdapter(this@MainActivity,listUser)
        }

    }
}
