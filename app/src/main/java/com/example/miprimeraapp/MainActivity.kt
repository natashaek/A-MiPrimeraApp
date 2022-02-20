package com.example.miprimeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bSaludar = findViewById<Button>(R.id.bSaludar)
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val cbDev = findViewById<CheckBox>(R.id.cbDeveloper)

        bSaludar.setOnClickListener(View.OnClickListener {
            if (validaDat()) {
                if (cbDev.isChecked) {
                    Toast.makeText(
                        this,
                        "Bienvenido, " + etNombre.text + ", sé que eres un desarrollador.",
                        Toast.LENGTH_LONG
                    ).show()
                } else {
                    Toast.makeText(this, "Bienvenido, " + etNombre.text, Toast.LENGTH_LONG).show()
                }
            } else {
                    Toast.makeText(this, "Escribe tu nombre para saludarte :/ ", Toast.LENGTH_SHORT).show()
                }


        })
    }

    fun validaDat():Boolean {
        val etNombre = findViewById<EditText>(
         R.id.etNombre
        )
        val nombreUsuario = etNombre.text
        if (nombreUsuario.isNullOrEmpty()) {
            return false;
        }

        return true;
    }
}