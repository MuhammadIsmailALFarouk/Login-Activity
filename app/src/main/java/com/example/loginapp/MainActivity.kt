package com.example.loginapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var selanjutnya = findViewById<Button>(R.id.Next)
        selanjutnya.setOnClickListener {
            val input = Intent(this, LoginActivity::class.java)
            startActivity(input)
        }
    }
}