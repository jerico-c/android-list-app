# Breaking Bad App ⚗️

Aplikasi Android sederhana yang menampilkan daftar karakter dari serial TV populer "Breaking Bad". Proyek ini dikembangkan sebagai submission akhir untuk kelas **Belajar Membuat Aplikasi Android untuk Pemula** di Dicoding Indonesia.

Aplikasi ini mendemonstrasikan implementasi dasar Android menggunakan Kotlin, termasuk penggunaan RecyclerView, Intent (Explicit & Implicit), Parcelable, dan Material Design.

## 📱 Fitur Utama

Sesuai dengan kriteria penilaian (Bintang 5), aplikasi ini memiliki fitur berikut:

* **List Karakter:** Menampilkan lebih dari 10 karakter menggunakan `RecyclerView` dan `CardView`.
* **Detail Karakter:** Menampilkan informasi mendalam (Foto, Nama, Pekerjaan, Afiliasi, Deskripsi) ketika item diklik.
* **Navigasi & Data:** Perpindahan antar Activity menggunakan `Intent` dan pengiriman data objek menggunakan `Parcelable` (lebih efisien).
* **Halaman About:** Menampilkan profil pengembang (Foto, Nama, Email) yang dapat diakses melalui menu toolbar.
* **Splash Screen:** Tampilan pembuka aplikasi kustom dengan logo tema Breaking Bad.
* **Fitur Share:** Tombol share fungsional di halaman detail yang mengirimkan teks informasi karakter ke aplikasi lain.
* **Dukungan Tampilan:**
    * **ScrollView:** Konten halaman detail dapat digulir (aman untuk mode Landscape).
    * **Dark Mode:** Mendukung tema Gelap dan Terang dengan warna yang disesuaikan.
    * **Layout:** Penanganan status bar (`fitsSystemWindows`) agar tampilan tidak tumpang tindih.

## 🛠️ Teknologi & Library

* **Bahasa:** [Kotlin](https://kotlinlang.org/)
* **Minimum SDK:** 21 (Android 5.0)
* **UI Components:**
    * XML Layouts
    * [Material Components for Android](https://github.com/material-components/material-components-android) (Toolbar, CardView, Button)
    * `RecyclerView`
    * `ScrollView`
    * `ConstraintLayout` & `LinearLayout`
* **Library Pihak Ketiga:**
    * [Glide](https://github.com/bumptech/glide) - Untuk memuat dan menampilkan gambar secara efisien.
    * [CircleImageView](https://github.com/hdodenhof/CircleImageView) - Untuk menampilkan foto profil bulat.

## 📷 Screenshots

| Splash Screen | Halaman Utama (List) | Halaman Detail | Halaman About |
|:---:|:---:|:---:|:---:|
| <img src="path/to/screenshot_splash.png" width="180" /> | <img src="path/to/screenshot_home.png" width="180" /> | <img src="path/to/screenshot_detail.png" width="180" /> | <img src="path/to/screenshot_about.png" width="180" /> |


## 📂 Struktur Proyek

* **MainActivity:** Menampilkan daftar karakter menggunakan `RecyclerView`. Mengambil data dari `CharacterData`.
* **DetailActivity:** Menerima data `Character` (via Parcelable) dan menampilkan detail lengkap. Menangani logika tombol Share.
* **AboutActivity:** Menampilkan data diri pengembang.
* **SplashActivity:** Activity pembuka dengan delay 2 detik sebelum masuk ke MainActivity.
* **ListCharacterAdapter:** Adapter untuk menghubungkan data ke `RecyclerView`. Menggunakan `Glide` untuk gambar.
* **Character (Model):** Data class yang mengimplementasikan `Parcelable`. Menyimpan properti: Nama, Deskripsi, Foto, Overview, Link, Pekerjaan, & Afiliasi.
* **CharacterData (Data Source):** Object yang berisi dummy data karakter Breaking Bad.

## 🚀 Cara Menjalankan

1.  Clone atau Download repository ini.
2.  Buka di **Android Studio**.
3.  Biarkan Gradle melakukan sinkronisasi (*Sync Project*).
4.  Jalankan aplikasi pada Emulator atau Perangkat Android fisik.


---
