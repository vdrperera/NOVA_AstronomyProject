package com.example.novaapp

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


            val NEXT: Button = findViewById(R.id.button14)
            NEXT.setOnClickListener {
                val intent = Intent(this, onboardActivity::class.java)
                startActivity(intent)
            }



        }
    }
