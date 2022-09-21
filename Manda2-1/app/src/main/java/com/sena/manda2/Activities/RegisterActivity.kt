package com.sena.manda2.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.sena.manda2.R

var datos: Button? = null

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        datos= findViewById(R.id.formulario)
        datos?.setOnClickListener {Pantalla1()}

    }

    private fun Pantalla1() {
        val i = Intent(this, Pantalla1::class.java)
        startActivity(i)
    }
}