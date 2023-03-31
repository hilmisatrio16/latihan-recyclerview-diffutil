package com.example.latihanrecycleview.portalberita

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.latihanrecycleview.R

class NewsAdapter(var listBerita : ArrayList<DataNews>) : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {

    var onClick : ((DataNews) -> Unit)? = null

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var judulBerita = view.findViewById<TextView>(R.id.tvJudulBerita)
        var tanggalBerita = view.findViewById<TextView>(R.id.tvTanggalBerita)
        var kategoriBerita = view.findViewById<TextView>(R.id.tvKategoriBerita)
        var imgBerita = view.findViewById<ImageView>(R.id.ivBerita)
        val card = view.findViewById<CardView>(R.id.card)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_news,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsAdapter.ViewHolder, position: Int) {
        holder.judulBerita.text = listBerita[position].judulBerita
        holder.tanggalBerita.text = listBerita[position].tanggalBerita
        holder.kategoriBerita.text = listBerita[position].kategoriBerita
        holder.imgBerita.setImageResource(listBerita[position].imgBerita)

        holder.card.setOnClickListener {
            onClick?.invoke(listBerita[position])
        }

    }

    override fun getItemCount(): Int {
        return listBerita.size
    }
}