package com.example.ex6_4

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val	editText: EditText = findViewById(R.id.editText)
        val	button:	Button = findViewById(R.id.button);
        button.setOnClickListener {
            val	url = editText.text.toString().trim() // EditText에 입력된 텍스트 가져오기
            if (url.isEmpty()) return@setOnClickListener
            val webUrl = if (url.startsWith("http://", ignoreCase = true) ||
                url.startsWith("https://", ignoreCase = true)) url else "http://$url"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(webUrl))
            startActivity(intent) // 웹 브라우저를 열고 지정된 URL을 표시하도록 인텐트를 실행
        }
    }
}