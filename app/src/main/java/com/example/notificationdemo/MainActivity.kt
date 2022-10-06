package com.example.notificationdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.notificationdemo.databinding.ActivityMainBinding
import com.onesignal.OneSignal

class MainActivity : AppCompatActivity() {
    val ONESIGNAL_APP_ID = "a24bda2a-7e79-4579-afd7-41b912ce18e7"
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
// Logging set to help debug issues, remove before releasing your app.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }
}