package com.example.mynit32132b3.UI

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.mynit32132b3.R
import com.example.mynit32132b3.viewModels.MainActivityViewModel
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavBar: BottomNavigationView
    private lateinit var navController: NavController

    val viewmodel= MainActivityViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Log.d("MyApplication", "hello from main activity")
        viewmodel.loadData()

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController
        bottomNavBar = findViewById(R.id.buttomnavbar)

        bottomNavBar.setOnApplyWindowInsetsListener(null)
        bottomNavBar.setupWithNavController(navController)
        setupnavigation()
    }

    fun setupnavigation(){
        bottomNavBar.setOnItemSelectedListener { item ->
            if (item.itemId != bottomNavBar.selectedItemId) {
                navController.popBackStack(item.itemId, inclusive = false)
                val fragmentId = when (item.itemId) {
                    R.id.LoginItemMenu -> R.id.loginFragment
                    R.id.DashboardItemMenu -> R.id.dashboardFragment
                    R.id.DetailsItemMenu -> R.id.detailsFragment
                    else -> R.id.loginFragment
                }
                navController.navigate(fragmentId)
            }
                true
            }

            }

        }
