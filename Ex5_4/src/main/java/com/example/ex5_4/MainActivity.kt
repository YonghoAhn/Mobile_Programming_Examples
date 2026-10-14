package com.example.ex5_4

import android.os.Bundle
import android.widget.CompoundButton
import android.widget.ImageView
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var tbObj: ToggleButton
    lateinit var ivRoom: ImageView
    lateinit var ivLight1: ImageView
    lateinit var ivLight2: ImageView
    lateinit var ivLight3: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tbObj = findViewById(R.id.toggleButton)
        ivRoom = findViewById(R.id.ivRoom)
        ivLight1 = findViewById(R.id.ivLight1)
        ivLight2 = findViewById(R.id.ivLight2)
        ivLight3 = findViewById(R.id.ivLight3)

        tbObj.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                if (isChecked) {
                    ivRoom.setImageResource(R.drawable.bg2)
                    ivLight1.setImageResource(R.drawable.light21)
                    ivLight2.setImageResource(R.drawable.light22)
                    ivLight3.setImageResource(R.drawable.light23)
                } else {
                    ivRoom.setImageResource(R.drawable.bg1)
                    ivLight1.setImageResource(R.drawable.light11)
                    ivLight2.setImageResource(R.drawable.light12)
                    ivLight3.setImageResource(R.drawable.light13)
                }
            }
        })
    }
}
