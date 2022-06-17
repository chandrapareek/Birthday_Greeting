package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class greeting_screen : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting_screen)

        val name = intent.getStringExtra(NAME_EXTRA)

        val texthp = findViewById<TextView>(R.id.textView)
        texthp.text = "Happy Birthday \n$name"
    }
}