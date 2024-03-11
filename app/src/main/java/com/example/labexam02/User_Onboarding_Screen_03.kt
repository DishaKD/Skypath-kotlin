package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class User_Onboarding_Screen_03 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_onboarding_screen03)

        val uos03_img_01 = findViewById<ImageView>(R.id.uos3_img_01)
        uos03_img_01.setOnClickListener{
            val Intent = Intent (this,User_Onboarding_Screen_02::class.java)
            startActivity(Intent)
        }

        val uos03_btn_01 = findViewById<ImageView>(R.id.uos03_btn_01)
        uos03_btn_01.setOnClickListener{
            val Intent = Intent (this,Sign_up_screen::class.java)
            startActivity(Intent)
        }


    }
}