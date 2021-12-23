package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class HomepageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homepage)

        val perehod = findViewById<Button>(R.id.perehod)

        perehod.setOnClickListener {
            startActivity(Intent(this,SternsActivity::class.java))
        }

    }
}