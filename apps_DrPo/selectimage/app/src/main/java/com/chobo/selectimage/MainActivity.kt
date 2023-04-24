package com.chobo.selectimage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        settingButton()
    }

    fun settingButton() {
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            //subactivity 로 이동.
            //intent : 의지, 지황, 의도
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }
    }
}