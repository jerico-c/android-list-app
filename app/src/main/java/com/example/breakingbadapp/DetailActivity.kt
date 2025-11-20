package com.example.breakingbadapp

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {

    // Companion object untuk menyimpan 'key' intent
    companion object {
        const val EXTRA_CHARACTER = "extra_character"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Sembunyikan ActionBar
        supportActionBar?.hide()

        // Ambil Views
        val imgPhoto: ImageView = findViewById(R.id.img_detail_photo)
        val tvName: TextView = findViewById(R.id.tv_detail_name)
        val tvDescription: TextView = findViewById(R.id.tv_detail_description)
        val btnShare: Button = findViewById(R.id.action_share)

        // --- AMBIL VIEW BARU ---
        val tvJob: TextView = findViewById(R.id.tv_detail_job)
        val tvAffiliation: TextView = findViewById(R.id.tv_detail_affiliation)

        // --- Menerima data Parcelable ---
        val character = if (Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra(EXTRA_CHARACTER, Character::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra(EXTRA_CHARACTER)
        }

        // Tampilkan data
        if (character != null) {
            Glide.with(this)
                .load(character.photo)
                .into(imgPhoto)

            tvName.text = character.name
            tvDescription.text = character.description

            // --- TAMPILKAN DATA BARU ---
            tvJob.text = character.job
            tvAffiliation.text = character.affiliation

            // Logika Tombol Share (seperti di referensi)
            btnShare.setOnClickListener {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                val shareMessage = "Check out this Breaking Bad character: ${character.name}\n${character.shareLink}"
                shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage)
                startActivity(Intent.createChooser(shareIntent, "Share via"))
            }
        }
    }
}