package com.example.b1611

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RvAdapter(val list: List<OurData>) : RecyclerView.Adapter<RvAdapter.filmViewHolder>() {
    // class viewHolder
    inner class filmViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): filmViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item, parent, false)
        return filmViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: filmViewHolder, position: Int) {
        holder.itemView.apply {
            val RvTitle = findViewById<TextView>(R.id.txtTitle)
            val RvDesc = findViewById<TextView>(R.id.txtDesc)
            val RvImg = findViewById<ImageView>(R.id.imgFilm)

            RvTitle.text = list[position].titleOD
            RvDesc.text = list[position].descOD
            RvImg.setImageResource(list[position].imgOD)

        }
    }

}
