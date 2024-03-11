package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Sign_up_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up_screen)

        val signup_img_01= findViewById<ImageView>(R.id.signup_img_01)
        signup_img_01.setOnClickListener{
            val Intent = Intent (this,User_Onboarding_Screen_03::class.java)
            startActivity(Intent)
        }

        val signup_banner_text02 = findViewById<TextView>(R.id.signup_banner_text02)
        signup_banner_text02.setOnClickListener{
            val Intent = Intent (this,signin_screen::class.java)
            startActivity(Intent)
        }

        val signup_btn = findViewById<Button>(R.id.signup_btn)
        signup_btn.setOnClickListener{
            val Intent = Intent (this,home_screen::class.java)
            startActivity(Intent)
        }

    }
}