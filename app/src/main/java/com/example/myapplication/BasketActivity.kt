package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BasketActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.basket)

        val perehod3 = findViewById<Button>(R.id.perehod3)

        perehod3.setOnClickListener {
            startActivity(Intent(this,SternsActivity::class.java))
        }
    }
}