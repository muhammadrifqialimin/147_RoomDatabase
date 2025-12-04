# Aplikasi Data Siswa (Room Database) 📱

Aplikasi Android sederhana untuk mengelola data siswa menggunakan **Local Database (Room)**. Project ini dibuat sebagai bagian dari Praktikum Pemrograman Aplikasi Mobile (PAM).

## 📸 Tampilan Aplikasi

Berikut adalah tampilan halaman utama yang menampilkan daftar data siswa dari database:

<p align="center">
  <img width="489" height="926" alt="Screenshot 2025-11-27 194029" src="https://github.com/user-attachments/assets/da4bf4c8-fe9a-42fe-ad10-7eac83e3d181" />
</p>

## 🚀 Fitur Utama

* **Input Data Siswa:** Form untuk memasukkan Nama, Alamat, dan No Telepon.
* **List Data:** Menampilkan daftar siswa yang tersimpan dalam Card.
* **Penyimpanan Lokal:** Data tersimpan permanen di HP menggunakan **Room Database** (SQLite), jadi tidak hilang saat aplikasi ditutup.
* **Navigasi:** Berpindah antar halaman (Home <-> Entry) dengan lancar.

## 🛠️ Teknologi & Arsitektur

Project ini dibangun menggunakan teknologi Android modern:

* **Language:** [Kotlin](https://kotlinlang.org/)
* **UI Framework:** [Jetpack Compose](https://developer.android.com/jetpack/compose) (Material3)
* **Database:** [Room Database](https://developer.android.com/training/data-storage/room)
* **Architecture Pattern:** MVVM (Model-View-ViewModel)
* **Data Flow:** Repository Pattern & Kotlin Coroutines/Flow
* **Dependency Injection:** Manual DI (AppContainer)

## 📂 Struktur Project

* **data/entity**: Struktur tabel database (`Siswa`).
* **data/dao**: Perintah SQL (`SiswaDao`).
* **repositori**: Penghubung antara Database dan ViewModel.
* **viewmodel**: Pengelola Logika & State UI (`HomeViewModel`, `EntryViewModel`).
* **view**: Tampilan UI (`HomeScreen`, `EntrySiswaScreen`).

---
*Dikembangkan oleh Nashrul Fikri (20230140105)*
