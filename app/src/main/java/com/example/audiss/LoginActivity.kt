package com.example.audiss

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnEntrar = findViewById<Button>(R.id.btnEntrar)
        val btnCriarConta = findViewById<Button>(R.id.btnCriarConta)

        // Quando clicar em "Criar conta", vai para a tela de cadastro
        btnCriarConta.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        // Quando clicar em "Entrar agora", podemos futuramente fazer autenticação
        btnEntrar.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // Finaliza a LoginActivity para não voltar ao pressionar "Voltar"
        }
    }
}
