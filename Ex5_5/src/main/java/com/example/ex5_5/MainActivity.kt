package com.example.ex5_5

import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.ImageView
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), CompoundButton.OnCheckedChangeListener {

    lateinit var swCat: Switch
    lateinit var swLight: Switch
    lateinit var ivWindow: ImageView
    lateinit var ivLight: ImageView
    lateinit var ivCat: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        swCat = findViewById(R.id.switchCat)
        swLight = findViewById(R.id.switchLight)
        ivWindow = findViewById(R.id.ivWindow)
        ivLight = findViewById(R.id.ivLight)
        ivCat = findViewById(R.id.ivCat)

        swCat.setOnCheckedChangeListener(this)
        swLight.setOnCheckedChangeListener(this)
    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        when (buttonView?.id) {
            R.id.switchCat -> ivCat.visibility = if (isChecked) View.VISIBLE else View.INVISIBLE
            R.id.switchLight -> {
                ivLight.setImageResource(if (isChecked) R.drawable.light32 else R.drawable.light31)
                ivWindow.alpha = if (isChecked) 1.0f else 0.4f
            }
        }
    }
}
