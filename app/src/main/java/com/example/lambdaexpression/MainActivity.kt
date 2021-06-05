package com.example.lambdaexpression

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

@SuppressWarnings("SameParameterValue")

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        higherOrderFunction("thanh", 10) {
            name, age -> Student(1,name,age)
        }

    }

    private fun higherOrderFunction(name: String, age: Int, callback: (String, Int) -> Student): Student {
        return callback(name, age)
    }

}