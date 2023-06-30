package com.example.myfarmeazy.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.GravityCompat
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import com.example.myfarmeazy.R
import com.example.myfarmeazy.databinding.ActivityMainBinding

class DashboardActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    private val navController by lazy {
        Navigation.findNavController(this, R.id.navHostFragmentContainer)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpDrawerLayout()


    }
    private fun setUpDrawerLayout()
    {
        binding.navView.setUpWithNavController(navController)
        NavigationUI.setupActionBarWithNavController(this,navController,binding.drawerLayout)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, binding.drawerLayout)

    }

    override fun onBackPressed() {
       if(binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
           binding.drawerLayout.closeDrawer(GravityCompat.START)
       }
       else{
               super.onBackPressed()
           }
       }
    }


