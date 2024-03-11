package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home_screen)

        val home_card_01= findViewById<ImageButton>(R.id.home_card_01)
        home_card_01.setOnClickListener{
            val Intent = Intent (this,selected_screen::class.java)
            startActivity(Intent)
        }

        val home_nav= findViewById<ImageButton>(R.id.home_nav)
        home_nav.setOnClickListener{
            val Intent = Intent (this,home_screen::class.java)
            startActivity(Intent)
        }


    }
}