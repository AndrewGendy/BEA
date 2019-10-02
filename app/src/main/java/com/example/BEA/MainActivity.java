package com.example.BEA;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

        TextView tvBEA1,tvBEA2,tvADP;
        Button btnADP, btnMaps, btnISOTrain;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                tvBEA1 = findViewById(R.id.tvBEA1);
                tvBEA2 = findViewById(R.id.tvBEA2);
                tvADP = findViewById(R.id.tvADP);
                btnADP = findViewById(R.id.btnADP);
                btnMaps = findViewById(R.id.btnMaps);
                btnISOTrain = findViewById(R.id.btnISOTrain);


                btnADP.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://my.adp.com"));
                                startActivity(intent);
                        }
                });

                btnMaps.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=901 Marcon Blvd, Allentown, PA 18109"));
                                startActivity(intent);
                        }
                });

                btnISOTrain.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bbraun.isotrain.com/ISOtrain"));
                                startActivity(intent);
                        }
                });

        }
}