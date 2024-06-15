package com.example.repfatecdm

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usuario = findViewById<EditText>(R.id.txtUsuario)
        val senha = findViewById<EditText>(R.id.txtSenha)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val user = usuario.text.toString()
            val pass = senha.text.toString()

            if (user == "admin" && pass == "1234") {
                Toast.makeText(this, "Login realizado", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login falhou", Toast.LENGTH_SHORT).show()
            }
        }
    }
}