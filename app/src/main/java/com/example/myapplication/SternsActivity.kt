package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SternsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sterns)

        val perehod2 = findViewById<Button>(R.id.perehod2)

        perehod2.setOnClickListener {
            startActivity(Intent(this,BasketActivity::class.java))
        }

    }
}