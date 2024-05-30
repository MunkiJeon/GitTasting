package com.example.gittasting

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // 김태영이 작성한 코드
        println("안녕하세요. 잘 부탁드립니다!")
        println("Git 한테 찢기고 부서지고 깨져봅시다.")
        println("위하여 🍺")

        // 전문전문 하고 움
        var textV : TextView = findViewById<TextView>(R.id.tv_cnt)
        textV.text = "전문전문 하고 움"
        println("testing")

        val editText = findViewById<EditText>(R.id.et_et1)
        textV.text = editText.text

    }
}