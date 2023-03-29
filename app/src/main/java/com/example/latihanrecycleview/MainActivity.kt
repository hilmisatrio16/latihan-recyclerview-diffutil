package com.example.latihanrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.latihanrecycleview.adapter.StudentAdapter
import com.example.latihanrecycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val listStudentData = arrayListOf(
            Student("Koko", 21),
            Student("Daniel", 98),
            Student("Rolonad", 27),
            Student("Joko", 17),
            Student("Fedrich", 56),
            Student("Zlatan", 41),
            Student("Bruno", 26),
            Student("Mario", 33),
            Student("Gomez", 41)

        )
        val adapterStudent = StudentAdapter(listStudentData)

        binding.rvStudent.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvStudent.adapter = adapterStudent


    }
}