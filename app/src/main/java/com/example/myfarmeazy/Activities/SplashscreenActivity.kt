package com.example.myfarmeazy.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.myfarmeazy.R

class SplashscreenActivity : AppCompatActivity() {
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)


        handler= Handler()
        handler.postDelayed({
            val intent= Intent(this,SignUpActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
    }
