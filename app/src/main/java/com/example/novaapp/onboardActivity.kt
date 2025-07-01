package com.example.novaapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class onboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_onboard)
        val NEXT: Button = findViewById(R.id.button2)
        NEXT.setOnClickListener {
            val intent = Intent(this, signupActivity::class.java)
            startActivity(intent)
        }
    }
}