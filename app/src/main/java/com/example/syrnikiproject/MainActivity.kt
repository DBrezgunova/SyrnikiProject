package com.example.syrnikiproject

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val textView = findViewById<TextView>(R.id.textView)
        val imageView = findViewById<ImageView>(R.id.imageView)
        findViewById<TextView>(R.id.Address)
        findViewById<TextView>(R.id.Phone)
    }
}