package com.example.breakingbadapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar // <-- 1. IMPORT INI

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        // --- TAMBAHKAN KODE INI ---
        val aboutToolbar: MaterialToolbar = findViewById(R.id.about_toolbar)
        setSupportActionBar(aboutToolbar)
        // --- SELESAI PENAMBAHAN ---

        supportActionBar?.title = "About Me"
        // Tambahkan tombol kembali/up
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    // Handle klik tombol kembali
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}