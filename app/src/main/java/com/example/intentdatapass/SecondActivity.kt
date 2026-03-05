package com.example.intentdatapass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvResult = findViewById<TextView>(R.id.tvResult)

        val name = intent.getStringExtra("username")

        tvResult.text = "Welcome $name"
    }
}
