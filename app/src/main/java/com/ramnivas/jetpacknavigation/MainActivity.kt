package com.ramnivas.jetpacknavigation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun launchSecondActivity(view: View) {
        NavHostFragment.findNavController(supportFragmentManager.findFragmentById(R.id.main_container))
                .navigate(R.id.main2Activity2)
    }
}
