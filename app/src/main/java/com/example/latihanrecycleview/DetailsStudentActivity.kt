package com.example.latihanrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latihanrecycleview.databinding.ActivityDetailsStudentBinding

class DetailsStudentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsStudentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsStudentBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}