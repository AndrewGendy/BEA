package com.example.BEA

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.MonthDisplayHelper
import kotlinx.android.synthetic.main.activity_calendar.*


class Calendar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)





        // Back Button
        btnBack.setOnClickListener {startActivity(Intent(this@Calendar, MainActivity::class.java))}
    }
}