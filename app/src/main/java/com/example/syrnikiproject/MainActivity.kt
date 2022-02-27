package com.example.syrnikiproject

import android.os.Bundle
import android.text.Html
import android.widget.TextView
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
    }
}
