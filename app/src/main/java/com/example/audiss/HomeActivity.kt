package com.example.audiss

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnLogout = findViewById<ImageView>(R.id.btnLogout)

        // Clique no botão de logout para voltar à tela de login
        btnLogout.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // Finaliza a HomeActivity para não voltar ao pressionar "Voltar"
        }
    }
}
