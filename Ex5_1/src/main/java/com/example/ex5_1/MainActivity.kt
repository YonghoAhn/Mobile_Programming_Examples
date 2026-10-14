package com.example.ex5_1

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var ivAnswer: ImageView
    lateinit var btn1: ImageButton
    lateinit var btn2: ImageButton
    lateinit var btn3: ImageButton
    lateinit var btn4: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivAnswer = findViewById(R.id.ivAnswer)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)

        val listener = MyListener(ivAnswer)
        btn1.setOnClickListener(listener)
        btn2.setOnClickListener(listener)
        btn3.setOnClickListener(listener)
        btn4.setOnClickListener(listener)
    }
}

class MyListener(private val ivAnswer: ImageView) : View.OnClickListener {
    override fun onClick(p0: View?) {
        val image = when (p0?.id) {
            R.id.btn1 -> R.drawable.answer1
            R.id.btn2 -> R.drawable.answer2
            R.id.btn3 -> R.drawable.answer3
            R.id.btn4 -> R.drawable.answer4
            else -> return
        }
        ivAnswer.setImageResource(image)
        ivAnswer.visibility = View.VISIBLE

        val message = if (p0.id == R.id.btn2) "맞았습니다" else "틀렸습니다"
        Toast.makeText(p0.context, message, Toast.LENGTH_SHORT).show()
    }
}
