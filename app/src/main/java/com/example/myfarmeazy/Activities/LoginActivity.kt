package com.example.myfarmeazy.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myfarmeazy.DashboardActivity
import com.example.myfarmeazy.R

class LoginActivity : AppCompatActivity() {
    var buttonLogin: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        buttonLogin = findViewById(R.id.BtnLogin)

        buttonLogin!!.setOnClickListener {
            val intent= Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}