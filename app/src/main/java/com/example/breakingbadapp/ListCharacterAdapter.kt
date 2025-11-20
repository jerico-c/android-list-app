package com.example.breakingbadapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.breakingbadapp.DetailActivity

class ListCharacterAdapter(private val listCharacter: ArrayList<Character>) :
    RecyclerView.Adapter<ListCharacterAdapter.ViewHolder>() {

    // 1. ViewHolder
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgPhoto: ImageView = view.findViewById(R.id.img_item_photo)
        val tvName: TextView = view.findViewById(R.id.tv_item_name)
        val tvOverview: TextView = view.findViewById(R.id.tv_item_overview)
    }

    // 2. onCreateViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row_character, parent, false)
        return ViewHolder(view)
    }

    // 3. getItemCount
    override fun getItemCount(): Int = listCharacter.size

    // 4. onBindViewHolder
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val character = listCharacter[position]

        Glide.with(holder.itemView.context)
            .load(character.photo)
            .into(holder.imgPhoto)

        holder.tvName.text = character.name
        holder.tvOverview.text = character.overview

        // --- INI LOGIKA KLIK-NYA ---
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)

            // Perhatikan: Ini JAUH lebih bersih daripada di proyek referensi.
            // Kita hanya mengirim SATU objek 'Character' karena sudah Parcelable.
            intent.putExtra(DetailActivity.EXTRA_CHARACTER, character)

            holder.itemView.context.startActivity(intent)
        }
    }
}