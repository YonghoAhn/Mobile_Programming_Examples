package com.example.ex6_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var rdObj1: RadioButton
    lateinit var rdObj2: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        rdObj1 = findViewById(R.id.radioButton1)
        rdObj2 = findViewById(R.id.radioButton2)
        val	btnObj : Button = findViewById(R.id.button)
        
        btnObj.setOnClickListener	{
            val intent = Intent(this, GameActivity::class.java)
            intent.putExtra("image", if (rdObj1.isChecked) 1 else 2)
            startActivity(intent)
        }
    }
}