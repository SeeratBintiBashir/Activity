package com.example.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity : AppCompatActivity() {
    private lateinit var goToButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goToButton = findViewById(R.id.button_go_to_act)


        goToButton.setOnClickListener {
            val i = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(i)
        }

    }

}