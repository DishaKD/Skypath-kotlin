package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class selected_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_selected_screen)

        val home_nav= findViewById<ImageButton>(R.id.home_nav)
        home_nav.setOnClickListener{
            val Intent = Intent (this,home_screen::class.java)
            startActivity(Intent)
        }

        val cargo_btn = findViewById<Button>(R.id.cargo_btn)
        cargo_btn.setOnClickListener{
            val Intent = Intent (this,cargo_screen::class.java)
            startActivity(Intent)
        }

    }
}