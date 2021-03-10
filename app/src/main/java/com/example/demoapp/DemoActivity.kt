package com.example.demoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demoapp.fragment.TestFragment1

class DemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)
        supportActionBar!!.hide();
        val mainFragment = TestFragment1()
        supportFragmentManager.beginTransaction().add(R.id.frame_container, mainFragment)
            .commit()
    }
}