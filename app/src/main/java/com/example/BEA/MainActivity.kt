package com.example.BEA

import android.content.Context
import androidx.appcompat.app.AppCompatActivity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

import java.net.URL
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // checking if app running for the First time
        val isFirstRun = getSharedPreferences("PREFERENCE", Context.MODE_PRIVATE).getBoolean("isFirstRun", true)

        if (isFirstRun) {
            //show Welcome activity

            startActivity(Intent(this@MainActivity, WelcomeActivity::class.java))
            //Toast.makeText(this@MainActivity, "First Run", Toast.LENGTH_LONG).show()
        }

        getSharedPreferences("PREFERENCE", Context.MODE_PRIVATE).edit()
                .putBoolean("isFirstRun", false).apply()


        //OMG! I can't believe I don't have to do this anymore...!

        //var tvBEA1: TextView = findViewById(R.id.tvBEA1)
        //var tvBEA2: TextView = findViewById(R.id.tvBEA2)
        //var tvADP: TextView = findViewById(R.id.tvADP)
        //val btnADP: Button = findViewById(R.id.btnADP)
        //val btnMaps: Button = findViewById(R.id.btnMaps)
        //val btnISOTrain: Button = findViewById(R.id.btnISOTrain)


        btnADP.setOnClickListener {startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://my.adp.com")))}

        btnMaps.setOnClickListener {startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=901 Marcon Blvd, Allentown, PA 18109")))}

        btnISOTrain.setOnClickListener {startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("https://bbraun.isotrain.com/ISOtrain")))}

        btnCalendar.setOnClickListener {startActivity(Intent(this@MainActivity, Calendar::class.java))}
    }

}