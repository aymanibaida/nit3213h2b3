package com.example.mynit32132b3

import android.os.Bundle
import android.util.Log
import android.widget.Button
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

        Log.d("MyApplication", "hello from main activity")

        var mytextview=findViewById<TextView>(R.id.textViewmain)
        var mybutton=findViewById<Button>(R.id.buttonMain)

        mybutton.setOnClickListener {

            mytextview.text= "Button Clicked"
        }

    }
}