package com.example.latihanrecycleview.portalberita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Data
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihanrecycleview.R
import com.example.latihanrecycleview.Student
import com.example.latihanrecycleview.adapter.StudentAdapter
import com.example.latihanrecycleview.databinding.ActivityNewsBinding

class NewsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listNewsData = arrayListOf(
            DataNews("FIFA: Indonesia Batal Jadi Tuan Rumah Piala Dunia U-20 2023", "Rabu, 29 Maret 2023 22:12 WIB", "Sports", R.drawable.img_news_satu),
            DataNews("Usai PPATK dan Sri Mulyani, Mahfud MD Bakal Jelaskan ke DPR Soal Transaksi Janggal Rp 300 Triliun Besok", "28 Mar 2023, 14:00 WIB", "Ekonomi", R.drawable.img_news_two),
            DataNews("Heboh Tolak Israel di Piala Dunia U-20, Palestina Justru Bilang Begini", "Senin, 27 Mar 2023 15:00 WIB","Sports", R.drawable.img_news_three),
            DataNews("Pengakuan Ketua Komisi III Saat Mulai Ikuti Rapat Bahas Transaksi Rp 349 T: Asli, Saya Enggak Paham", "29/03/2023, 23:12 WIB", "Politik", R.drawable.img_news_four),
            DataNews("Pedagang Takjil di Jalan Cipinang Muara Jaktim Raup Rp 500.000 Per Hari", "29/03/2023, 23:11 WIB","lokal", R.drawable.img_news_five),
            DataNews("Hasil PSIS Vs Persebaya 1-2: Mahesa Jenar Takluk, Telan 6 Kekalahan Beruntun", "29/03/2023, 23:07 WIB", "Sports", R.drawable.img_news_six),
            DataNews("Diduga Rangkul Istri Orang di Tiktok, Warga Probolinggo Dianiaya dengan Senjata Tajam Usai Tarawih","29/03/2023, 22:36 WIB", "Kejahatan", R.drawable.img_news_seven),
            DataNews("Ridwan Kamil Balik Roasting Kiky Saputri, Cari Cuan dari Ejekan hingga Singgung Perseteruan dengan BLINK", "28/03/2023, 08:38 WIB", "Selebriti", R.drawable.img_berita_eight),
            DataNews("Siti Fauziah: Bu Tedjo di Tilik The Series Jadi Lebih Kompleks","29/03/2023, 20:47 WIB","Selebriti", R.drawable.img_news_nine),
            DataNews("Sinopsis The Commuter, Konspirasi Kriminal di Dalam Kereta Komuter", "24/03/2023, 11:02 WIB", "Film", R.drawable.img_news_ten)



        )
        val adapterNews = NewsAdapter(listNewsData)

        binding.rvNews.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvNews.adapter = adapterNews


        adapterNews.onClick = {
//            val moveActivity = Intent(this, DetailsNewsActivity::class.java)
//            moveActivity.putExtra("DETAILS_NEWS", it)
//            startActivity(moveActivity)

            val pindah = Intent(this, DetailsNewsActivity::class.java)
            pindah.putExtra("DETAILS_NEWS", it)
            startActivity(pindah)
            Toast.makeText(this, "coba", Toast.LENGTH_SHORT).show()
        }
    }
}
