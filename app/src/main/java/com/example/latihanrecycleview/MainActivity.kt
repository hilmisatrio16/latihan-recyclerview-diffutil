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
            Student("Koko", 21, R.drawable.img_man),
            Student("Daniel", 98, R.drawable.img_man),
            Student("Rolonad", 27,R.drawable.img_man),
            Student("Joko", 17,R.drawable.img_man ),
            Student("Fedrich", 56, R.drawable.img_man),
            Student("Zlatan", 41, R.drawable.img_man),
            Student("Bruno", 26, R.drawable.img_man),
            Student("Mario", 33, R.drawable.img_man),
            Student("Gomez", 41, R.drawable.img_woman)

        )

        val adapterStudent = StudentAdapter(listStudentData)

        binding.rvStudent.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvStudent.adapter = adapterStudent

    }
}