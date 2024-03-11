package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class User_Onboarding_Screen_02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_onboarding_screen02)

        val uos02_btn_01 = findViewById<Button>(R.id.uos02_btn_01)
        uos02_btn_01.setOnClickListener{
            val Intent = Intent (this,User_Onboarding_Screen_03::class.java)
            startActivity(Intent)
        }

        val uos02_btn_02= findViewById<Button>(R.id.uos02_btn_02)
        uos02_btn_02.setOnClickListener{
            val Intent = Intent (this,User_Onboarding_Screen_01::class.java)
            startActivity(Intent)
        }
    }
}