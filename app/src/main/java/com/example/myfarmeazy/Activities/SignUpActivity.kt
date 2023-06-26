package com.example.myfarmeazy.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myfarmeazy.R

class SignUpActivity : AppCompatActivity() {
    var buttonSignUp: Button?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        buttonSignUp = findViewById(R.id.BtnSignUp)

        buttonSignUp!!.setOnClickListener {
            val intent= Intent(this,DashboardActivity ::class.java)
            startActivity(intent)
            finish()
        }
    }
}