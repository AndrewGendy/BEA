package com.example.BEA;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        TextView tvBEA1,tvBEA2,tvADP;
        Button btnADP;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                tvBEA1 = findViewById(R.id.tvBEA1);
                tvBEA2 = findViewById(R.id.tvBEA2);
                tvADP = findViewById(R.id.tvADP);
                btnADP = findViewById(R.id.btnADP);


                btnADP.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                        }
                });


        }
}