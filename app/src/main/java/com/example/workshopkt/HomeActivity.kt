package com.example.workshopkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnSair: Button = findViewById(R.id.btn_sair)
        btnSair.setOnClickListener() {
            finishAffinity()

        }
    }
}