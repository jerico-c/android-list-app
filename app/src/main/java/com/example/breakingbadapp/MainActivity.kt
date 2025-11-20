package com.example.breakingbadapp

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

    private lateinit var rvCharacters: RecyclerView
    private val list = ArrayList<Character>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // --- TAMBAHKAN KODE INI ---
        // 2. Temukan Toolbar berdasarkan ID-nya
        val mainToolbar: MaterialToolbar = findViewById(R.id.main_toolbar)

        // 3. Set Toolbar ini sebagai ActionBar yang aktif
        setSupportActionBar(mainToolbar)
        // --- SELESAI PENAMBAHAN ---

        // Atur judul untuk ActionBar (sekarang tidak akan null)
        supportActionBar?.title = "Breaking Bad Characters"

        // Inisialisasi RecyclerView dari layout
        rvCharacters = findViewById(R.id.rv_characters)
        rvCharacters.setHasFixedSize(true)

        // Ambil data...
        list.addAll(CharacterData.listData)

        // Panggil fungsi untuk menampilkan list
        showRecyclerList() // Error Anda akan hilang setelah menambahkan fungsi di bawah
    }

    // --- FUNGSI YANG HILANG ---

    /**
     * Menampilkan data ke RecyclerView.
     */
    private fun showRecyclerList() {
        // Atur LayoutManager
        rvCharacters.layoutManager = LinearLayoutManager(this)

        // Buat instance dari adapter dan kirimkan 'list' data
        val listCharacterAdapter = ListCharacterAdapter(list)

        // Atur adapter ke RecyclerView
        rvCharacters.adapter = listCharacterAdapter
    }

    /**
     * Membuat menu (dari res/menu/menu_main.xml)
     */
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    /**
     * Menangani klik pada item menu.
     */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Cek item mana yang diklik
        if (item.itemId == R.id.about_page) { // ID dari file menu_main.xml
            // Buat Intent untuk pindah ke AboutActivity
            val moveIntent = Intent(this, AboutActivity::class.java)
            startActivity(moveIntent)
        }
        return super.onOptionsItemSelected(item)
    }
}