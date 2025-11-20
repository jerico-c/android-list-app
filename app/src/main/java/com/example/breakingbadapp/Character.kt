package com.example.breakingbadapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize // Ini adalah kuncinya!
data class Character(
    val name: String,
    val description: String,
    val photo: Int, // ID drawable
    val overview: String, // Deskripsi singkat untuk di list
    val shareLink: String, // Link untuk tombol share
    val job: String,
    val affiliation: String
) : Parcelable