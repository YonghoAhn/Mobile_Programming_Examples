package com.example.ex3_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.graphics.Color
import android.graphics.Typeface
import android.widget.TextView
import androidx.core.graphics.toColorInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv = findViewById<TextView>(R.id.textView)
        tv.text = "Hello World!"
        tv.setTextColor("#03A9F4".toColorInt())
        tv.typeface = Typeface.SERIF
        tv.textSize = 50f
    }
}
