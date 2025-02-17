package com.example.audiss

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Pegando os elementos do layout
        val nomeEditText = findViewById<EditText>(R.id.editNome)
        val emailEditText = findViewById<EditText>(R.id.editEmail)
        val senhaEditText = findViewById<EditText>(R.id.editSenha)
        val confirmarSenhaEditText = findViewById<EditText>(R.id.editConfirmarSenha)
        val btnConfirmar = findViewById<Button>(R.id.btnConfirmar)

        btnConfirmar.setOnClickListener {
            val nome = nomeEditText.text.toString()
            val email = emailEditText.text.toString()
            val senha = senhaEditText.text.toString()
            val confirmarSenha = confirmarSenhaEditText.text.toString()

            // Validação simples
            if (nome.isEmpty() || email.isEmpty() || senha.isEmpty() || confirmarSenha.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (senha != confirmarSenha) {
                Toast.makeText(this, "As senhas não coincidem!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Aqui você pode adicionar lógica para salvar os dados (ex: Firebase, Banco de Dados local, etc.)
            Toast.makeText(this, "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show()
            btnConfirmar.setOnClickListener {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish() // Finaliza a RegisterActivity para não voltar ao pressionar "Voltar"
            }
        }
    }
}
