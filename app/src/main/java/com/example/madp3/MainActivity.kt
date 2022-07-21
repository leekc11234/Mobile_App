package com.example.madp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.example.madp3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        var student = Student()

        binding.btnSetValue.setOnClickListener(){
            //binding.tvAge.text = student.age.toString()

            student.age = 28

            binding.apply {
                invalidateAll()
            }
        }
        binding.btnGetValue.setOnClickListener(){
            binding.data = student
        }

       // var btn = findViewById<Button>(R.id.btnGetValue)



    }
}