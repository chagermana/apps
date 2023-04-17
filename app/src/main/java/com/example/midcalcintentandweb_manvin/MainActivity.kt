package com.example.midcalcintentandweb_manvin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var ButtonCalc:Button
    lateinit var ButtonIntent:Button
    lateinit var ButtonWeb:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ButtonCalc=findViewById(R.id.Btn_Cal)
        ButtonCalc.setOnClickListener {
            val intent= Intent(this,CalculatorActivity::class.java)
            startActivity(intent)
        }

        ButtonIntent=findViewById(R.id.Btn_Intent)
        ButtonIntent.setOnClickListener {
            val intent=Intent(this,IntentActivity::class.java)
            startActivity(intent)
        }

        ButtonWeb=findViewById(R.id.Btn_Web)
        ButtonWeb.setOnClickListener {
            val intent=Intent(this,WebActivity::class.java)
            startActivity(intent)
        }

    }
}


