package com.example.syrnikiproject

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val tvTitle = findViewById<TextView>(R.id.tvTitle)
        val ivPlace = findViewById<ImageView>(R.id.ivPlace)
        findViewById<TextView>(R.id.tvAddress)
        findViewById<TextView>(R.id.tvPhone)
    }
}