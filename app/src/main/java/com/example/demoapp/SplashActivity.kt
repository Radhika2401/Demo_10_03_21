package com.example.demoapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        supportActionBar!!.hide()
        Handler(mainLooper).postDelayed({
            val mIntent = Intent(this@SplashActivity, DashBoardActivity::class.java)
            startActivity(mIntent)
            finish()
        }, 3000)
    }
}