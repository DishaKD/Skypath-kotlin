package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class signin_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signin_screen)

        val signin_img_01= findViewById<ImageButton>(R.id.signin_img_01)
        signin_img_01.setOnClickListener{
            val Intent = Intent (this,Sign_up_screen::class.java)
            startActivity(Intent)
        }

        val signin_btn= findViewById<Button>(R.id.signin_btn)
        signin_btn.setOnClickListener{
            val Intent = Intent (this,home_screen::class.java)
            startActivity(Intent)
        }

        val signin_banner_text_02= findViewById<TextView>(R.id.signin_banner_text_02)
        signin_banner_text_02.setOnClickListener{
            val Intent = Intent (this,Sign_up_screen::class.java)
            startActivity(Intent)
        }



    }
}