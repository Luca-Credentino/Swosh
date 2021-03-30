package com.example.swosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class leagueactiviy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leagueactiviy)
    }

    fun nextpage2(view: View) {
        val intent2=Intent(this,whoareuactivity2::class.java)
        startActivity(intent2)
    }
}