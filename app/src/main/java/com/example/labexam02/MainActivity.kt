package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn_01 = findViewById<Button>(R.id.btn_01)
        btn_01.setOnClickListener{
            val Intent = Intent (this,User_Onboarding_Screen_01::class.java)
            startActivity(Intent)
        }
    }
}