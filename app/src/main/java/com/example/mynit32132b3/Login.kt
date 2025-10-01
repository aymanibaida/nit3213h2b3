package com.example.mynit32132b3

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        var myintent=intent

        var localstudentid=myintent.getStringExtra("studentid")

        var myproduct=myintent.getParcelableExtra<Product>("passedproduct")
        Log.d("MyApplication","the local student id is $localstudentid and the product name is ${myproduct?.name}")
    }
}