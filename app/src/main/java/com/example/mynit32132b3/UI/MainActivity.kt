package com.example.mynit32132b3.UI

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.mynit32132b3.R
import com.example.mynit32132b3.viewModels.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    val viewmodel= MainActivityViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Log.d("MyApplication", "hello from main activity")
        viewmodel.loadData()

        findViewById<TextView>(R.id.textView2).text=viewmodel.greetingtext

        supportFragmentManager.beginTransaction()
            .setReorderingAllowed(true)
            .add(R.id.fragmentContainerView2,LoginFragment::class.java,null,"LoginFragment")
            .commit()
    }



}