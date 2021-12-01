package com.example.doadandzikir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailArtikelActivity : AppCompatActivity() {

    companion object{
        const val DATA_TITlE = "title"
        const val DATA_DESC = "desc"
        const val DATA_IMG = "image"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_artikel)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = "Artikel Islami"

        val dataTitle = intent.getStringExtra(DATA_TITlE)
        val dataDesc = intent.getStringExtra(DATA_DESC)
        val dataImage = intent.getIntExtra(DATA_IMG,0)

        val tvTitle : TextView = findViewById(R.id.tv_detail_title)
        tvTitle.text = dataTitle

        val tvDesc : TextView = findViewById(R.id.tv_detail_desc)
        tvDesc.text = dataDesc

        val imgArtikel : ImageView = findViewById(R.id.img_detail)
        imgArtikel.setImageResource(dataImage)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}