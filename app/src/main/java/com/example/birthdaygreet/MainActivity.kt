package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }



    fun createBirthdayGreeting(view: android.view.View) {
        val name = findViewById<EditText>(R.id.editTextTextPersonName).editableText.toString()
        val intent = Intent(this, greeting_screen::class.java)
        intent.putExtra(greeting_screen.NAME_EXTRA, name)
        startActivity(intent)
    }

}