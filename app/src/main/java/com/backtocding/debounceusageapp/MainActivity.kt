package com.backtocding.debounceusageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.lifecycle.lifecycleScope
import com.backtocding.debounceusageapp.Utils.Debouncer

class MainActivity : AppCompatActivity() {

    private val debouncer = Debouncer(lifecycleScope)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton: Button = findViewById(R.id.my_button)
        myButton.setOnClickListener {
            debouncer.debounce(300L) {
                Log.d("MainActivity", "onCreate: ")
            }
        }
    }
}