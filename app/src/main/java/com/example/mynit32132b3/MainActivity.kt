package com.example.mynit32132b3

import android.content.Intent
import android.net.Uri
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
            val myintent = Intent(this, Login::class.java)

            myintent.putExtra("studentid","s123456")
            myintent.putExtra("studentname","jason")
            myintent.putExtra("studentmark",65)

            var myproduct=Product("laptop",1000.00)
            myintent.putExtra("passedproduct",myproduct)
            startActivity(myintent)

        }

    }



}