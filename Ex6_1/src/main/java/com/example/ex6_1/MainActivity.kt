package com.example.ex6_1

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val handler = Handler(Looper.getMainLooper())
    private val openLogin = Runnable {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        handler.postDelayed(openLogin, 2000)
    }

    override fun onDestroy() {
        handler.removeCallbacks(openLogin)
        super.onDestroy()
    }
}
