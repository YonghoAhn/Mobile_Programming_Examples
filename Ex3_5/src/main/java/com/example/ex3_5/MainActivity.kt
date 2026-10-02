package com.example.ex3_5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private val images = intArrayOf(
        R.drawable.cat1, R.drawable.cat2, R.drawable.cat3, R.drawable.cat4, R.drawable.cat5
    )
    private var index = 0

    fun nextImage(view: View) {
        index = (index + 1) % images.size
        findViewById<ImageView>(R.id.imageView).setImageResource(images[index])
        findViewById<TextView>(R.id.tvName).text = "cat${index + 1}.png"
    }
}
