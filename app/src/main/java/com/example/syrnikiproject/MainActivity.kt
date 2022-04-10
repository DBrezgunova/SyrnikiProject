package com.example.syrnikiproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Html
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val information = "<ul>" +
                "<li>Доставка: Wolt, Glowo, Chocofood, Яндекс</li>" +
                "<li>Меню: с шоколадом, с малиной, с ананасом, кокосовые</li>" +
                "<li> Парковка: Есть, платная</li>" +
                "<li> Акции: Скидка 30% с 20:00</li>" +
                "</ul>"
        val tvInformation = findViewById<TextView>(R.id.tvInformation)
        tvInformation.text = Html.fromHtml(information)

        val tvPhone:TextView = findViewById(R.id.tvPhone)
        tvPhone.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + getString(R.string.phone)))
            startActivity(intent)
        }
    }
}
