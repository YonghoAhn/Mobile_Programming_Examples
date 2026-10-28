package com.example.ex6_1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin: Button = findViewById(R.id.button)
        val etUsername: EditText = findViewById(R.id.editText01)
        val etPassword: EditText = findViewById(R.id.editText02)
        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()
            Toast.makeText(
                applicationContext,
                "아이디 : $username\n비밀번호 : $password",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}
