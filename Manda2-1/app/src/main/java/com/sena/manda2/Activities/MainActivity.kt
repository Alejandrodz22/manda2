package com.sena.manda2.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.sena.manda2.R

class MainActivity : AppCompatActivity() {

    var buttonViewGoToRegister: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonViewGoToRegister = findViewById(R.id.registrate)
        buttonViewGoToRegister?.setOnClickListener { goToRegister() }

    }
    private fun RegisterActivity() {
        val i = Intent(this, RegisterActivity::class.java)
        startActivity(i)
    }

    private fun goToRegister() {
        val i = Intent(this, RegisterActivity::class.java)
        startActivity(i)
    }

}