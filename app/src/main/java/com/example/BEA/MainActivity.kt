package com.example.BEA

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

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //OMG! I can't believe I don't have to di this anymore...!

        //var tvBEA1: TextView = findViewById(R.id.tvBEA1)
        //var tvBEA2: TextView = findViewById(R.id.tvBEA2)
        //var tvADP: TextView = findViewById(R.id.tvADP)
        //val btnADP: Button = findViewById(R.id.btnADP)
        //val btnMaps: Button = findViewById(R.id.btnMaps)
        //val btnISOTrain: Button = findViewById(R.id.btnISOTrain)


        btnADP.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://my.adp.com"))
            startActivity(intent)
        }

        btnMaps.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=901 Marcon Blvd, Allentown, PA 18109"))
            startActivity(intent)
        }

        btnISOTrain.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://bbraun.isotrain.com/ISOtrain"))
            startActivity(intent)
        }
    }
}