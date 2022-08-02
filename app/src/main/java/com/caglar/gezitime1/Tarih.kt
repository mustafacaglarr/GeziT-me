package com.caglar.gezitime1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Tarih : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tarih)
    }
    fun sehirsec(view: View){
        val intent = Intent(applicationContext,Arama::class.java)
        startActivity(intent)

    }
}