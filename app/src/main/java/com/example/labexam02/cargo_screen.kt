package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class cargo_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cargo_screen)

        val cargo_back_btn = findViewById<Button>(R.id.cargo_back_btn)
        cargo_back_btn.setOnClickListener{
            val Intent = Intent (this,selected_screen::class.java)
            startActivity(Intent)
        }
    }
}