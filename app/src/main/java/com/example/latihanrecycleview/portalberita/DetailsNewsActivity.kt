package com.example.latihanrecycleview.portalberita

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latihanrecycleview.R
import com.example.latihanrecycleview.databinding.ActivityDetailsNewsBinding

class DetailsNewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val getDetail = intent.getSerializableExtra("DETAILS_NEWS") as DataNews

        binding.ivNews.setImageResource(getDetail.imgBerita)
        binding.tvJudulDetailsBerita.text = getDetail.judulBerita
        binding.tvDateDetails.text = getDetail.tanggalBerita
        binding.tvKategori.text = getDetail.kategoriBerita
    }
}