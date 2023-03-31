package com.example.latihanrecycleview.portalberita

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.latihanrecycleview.R

class NewsAdapterDiffUtil(val listBerita : ArrayList<DataNews>) : RecyclerView.Adapter<NewsAdapterDiffUtil.ViewHolder>() {

    //diffutil
    private var diffCallback = object  : DiffUtil.ItemCallback<DataNews>(){
        override fun areItemsTheSame(oldItem: DataNews, newItem: DataNews): Boolean {
            return oldItem.judulBerita == newItem.judulBerita
        }

        override fun areContentsTheSame(oldItem: DataNews, newItem: DataNews): Boolean {
            return oldItem.hashCode() == newItem.hashCode()
        }

    }
    //add
    var differ = AsyncListDiffer(this, diffCallback)
    //add
    fun submitData(value: ArrayList<DataNews>){
        differ.submitList(value)
    }

//

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var judulBerita = view.findViewById<TextView>(R.id.tvJudulBerita)
        var tanggalBerita = view.findViewById<TextView>(R.id.tvTanggalBerita)
        var kategoriBerita = view.findViewById<TextView>(R.id.tvKategoriBerita)
        var imgBerita = view.findViewById<ImageView>(R.id.ivBerita)
        val card = view.findViewById<CardView>(R.id.card)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NewsAdapterDiffUtil.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_news,parent, false)
        return NewsAdapterDiffUtil.ViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsAdapterDiffUtil.ViewHolder, position: Int) {
        //add
        var data = differ.currentList[position]
        holder.judulBerita.text = data.judulBerita
        holder.tanggalBerita.text = data.tanggalBerita
        holder.kategoriBerita.text = data.kategoriBerita
        holder.imgBerita.setImageResource(data.imgBerita)

    }

    override fun getItemCount(): Int {
        //add
       return differ.currentList.size
    }

}