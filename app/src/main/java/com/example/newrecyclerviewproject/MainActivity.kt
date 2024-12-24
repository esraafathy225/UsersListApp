package com.example.newrecyclerviewproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.databinding.DataBindingUtil
import com.example.newrecyclerviewproject.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Data binding   View binding

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val users = mutableListOf(
            User("Ahmed Mohamed", "Ahmed@gmail.com"),
            User("Mahmoud Mohamed", "Mahmoud@gmail.com"),
            User("Mona Ahmed", "Mona@gmail.com"),
            User("Menna Ali", "Menna@gmail.com"),
            User("Youssef Mohamed", "Youssef@gmail.com"),
            User("Ahmed Mohamed", "Ahmed@gmail.com"),
            User("Mahmoud Ahmed", "Mahmoud@gmail.com"),
            User("Yasmine Ahmed", "Mona@gmail.com"),
            User("Mohamed Ali", "Menna@gmail.com"),
            User("Farida Mohamed", "Youssef@gmail.com")
        )

        val userAdapter = UserAdapter(users)

        binding.rvStudents.adapter = userAdapter

    }
}

