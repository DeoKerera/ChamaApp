package com.example.snapchatsplashscreen

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
        Thread.sleep(300)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var btn1=findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            val intent1=Intent(this,LoginPage::class.java)
            startActivity(intent1)
        }
        var btn2=findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {
            val intent2=Intent(this,RegisterPage::class.java)
            startActivity(intent2)
        }

        }
        }