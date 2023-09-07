package com.example.loginapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var daftar = findViewById<Button>(R.id.register)
        daftar.setOnClickListener{
            val masukan = Intent(this, RegisterActivity::class.java)
            startActivity(masukan)
        }
    }
}