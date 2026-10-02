package com.example.ex3_4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showResult(view: View) {
        val name = findViewById<EditText>(R.id.etName).text
        val pw = findViewById<EditText>(R.id.etPw).text
        val email = findViewById<EditText>(R.id.etEmail).text
        val birth = findViewById<EditText>(R.id.etBirth).text
        val phone = findViewById<EditText>(R.id.etPhone).text
        findViewById<TextView>(R.id.tvResult).text =
            "성명 - $name\n비밀번호 - $pw\n이메일 - $email\n생년월일 - $birth\n연락처 - $phone"
    }
}
