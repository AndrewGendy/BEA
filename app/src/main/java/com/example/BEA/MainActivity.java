package com.example.BEA;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

        TextView tvBEA1,tvBEA2,tvADP;
        Button btnADP, btnMaps;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                tvBEA1 = findViewById(R.id.tvBEA1);
                tvBEA2 = findViewById(R.id.tvBEA2);
                tvADP = findViewById(R.id.tvADP);
                btnADP = findViewById(R.id.btnADP);
                btnMaps = findViewById(R.id.btnMaps);


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


        }
}