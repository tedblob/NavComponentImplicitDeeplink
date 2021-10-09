package com.tedblob.kotlin.navigationcomponentexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)

        Navigation.findNavController(this, R.id.nav_host_fragment).handleDeepLink(intent)
    }
}