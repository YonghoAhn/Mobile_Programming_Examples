package com.example.ex3_3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sum(view: View) {
        val a = findViewById<TextView>(R.id.num1).text.toString().toInt()
        val b = findViewById<TextView>(R.id.num2).text.toString().toInt()
        Toast.makeText(this, "합계: ${a + b}", Toast.LENGTH_SHORT).show()
    }
}
