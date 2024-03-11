package com.example.labexam02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class User_Onboarding_Screen_01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_user_onboarding_screen01)

        val uos_btn_01 = findViewById<Button>(R.id.uos_btn_01)
        uos_btn_01.setOnClickListener{
            val Intent = Intent (this,User_Onboarding_Screen_02::class.java)
            startActivity(Intent)
        }

        val uos_btn_02 = findViewById<Button>(R.id.uos_btn_02)
        uos_btn_02.setOnClickListener{
            val Intent = Intent (this,MainActivity::class.java)
            startActivity(Intent)
        }
    }
}