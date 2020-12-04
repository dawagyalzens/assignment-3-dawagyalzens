package com.gyalzay.greatersmaller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text
import java.util.*
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {

    private lateinit var btnFirst: Button
    private lateinit var btnSecond: Button
    private lateinit var btnRestart: Button
    private lateinit var tvDisplay: TextView
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Binding
        btnFirst = findViewById(R.id.btnFirst)
        btnSecond = findViewById(R.id.btnSecond)
        btnRestart = findViewById(R.id.btnRestart)
        tvDisplay = findViewById(R.id.tvDisplay)
        tvResult = findViewById(R.id.tvResult)

    btnFirst.setOnClickListener{
        tvDisplay.text = generateNumbers().toString()
        println(generateNumbers())
    }

    }

    private fun generateNumbers() {
        val myRandomInt = (0..100).random()
        }
}