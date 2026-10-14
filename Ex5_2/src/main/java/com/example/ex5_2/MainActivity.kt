package com.example.ex5_2

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var cbObj1: CheckBox
    lateinit var cbObj2: CheckBox
    lateinit var cbObj3: CheckBox
    lateinit var cbObj4: CheckBox
    lateinit var btnResult: Button
    lateinit var tvResult: TextView

    private var showingResult = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cbObj1 = findViewById(R.id.checkBox1)
        cbObj2 = findViewById(R.id.checkBox2)
        cbObj3 = findViewById(R.id.checkBox3)
        cbObj4 = findViewById(R.id.checkBox4)
        btnResult = findViewById(R.id.btnResult)
        tvResult = findViewById(R.id.tvResult)

        btnResult.setOnClickListener {
            if (showingResult) restart() else showResult()
        }
    }

    private fun showResult() {
        val selected = mutableListOf<String>()
        if (cbObj1.isChecked) selected.add("소방차")
        if (cbObj2.isChecked) selected.add("핸드믹서")
        if (cbObj3.isChecked) selected.add("청진기")
        if (cbObj4.isChecked) selected.add("장갑")

        if (selected.isEmpty()) {
            Toast.makeText(applicationContext, "선택한 물건이 없습니다.", Toast.LENGTH_SHORT).show()
            return
        }
        Toast.makeText(
            applicationContext,
            "${selected.joinToString(", ")}을(를) 선택했습니다.",
            Toast.LENGTH_SHORT
        ).show()

        val correct = cbObj1.isChecked && !cbObj2.isChecked && !cbObj3.isChecked && cbObj4.isChecked
        tvResult.text = if (correct) "맞았습니다" else "틀렸습니다"
        btnResult.text = "재시작하기"
        showingResult = true
    }

    private fun restart() {
        cbObj1.isChecked = false
        cbObj2.isChecked = false
        cbObj3.isChecked = false
        cbObj4.isChecked = false
        tvResult.text = "소방관의 용품을 선택해주세요"
        btnResult.text = "결과보기"
        showingResult = false
    }
}
