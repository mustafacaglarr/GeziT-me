package com.caglar.gezitime1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun change(view: View){
        val intent = Intent(applicationContext,Tarih::class.java)
        startActivity(intent)

    }
    fun change2(view: View){
        val intent = Intent(applicationContext,Doga::class.java)
        startActivity(intent)

    }
    fun change3(view: View){
        val intent = Intent(applicationContext,Muze::class.java)
        startActivity(intent)

    }
    fun change4(view: View){
        val intent = Intent(applicationContext,Lezzetler::class.java)
        startActivity(intent)

    }
}