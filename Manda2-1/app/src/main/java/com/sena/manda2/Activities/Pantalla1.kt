package com.sena.manda2.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.sena.manda2.R

class Pantalla1 : AppCompatActivity() {

    var imageViewGoToRegister: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla1)

            imageViewGoToRegister = findViewById(R.id.imageview_go_to_register)
            imageViewGoToRegister?.setOnClickListener { goToRegister() }
        }

        private fun goToRegister() {
            val i = Intent(this, RegisterActivity::class.java)
            startActivity(i)

    }
}