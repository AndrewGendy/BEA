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

public class UserLogin extends AppCompatActivity {


    TextView tvTempResults, tvTempResults1, tvTempResults2, tvTempResults3;
    EditText etEmpID, etEmpPassword;
    Button btnCreateAccount;

    final int CREATE_ACCOUNT = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmpID = findViewById(R.id.etEmpID);
        etEmpPassword = findViewById(R.id.etEmpPassword);


        btnCreateAccount = findViewById(R.id.btnADP);


        btnCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(UserLogin.this, com.example.BEA.CreateAccount.class);
                startActivityForResult(intent, CREATE_ACCOUNT);

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CREATE_ACCOUNT)
        {
            if (resultCode == RESULT_OK)
            {
                tvTempResults.setText(data.getStringExtra("EmpFirstName"));
                tvTempResults1.setText(data.getStringExtra("EmpLastName"));
                tvTempResults2.setText(data.getStringExtra("EmpID"));
                tvTempResults3.setText(data.getStringExtra("EmpPassword"));

            }
            if (resultCode == RESULT_CANCELED)
            {
                Toast.makeText(this, "Process Canceled!", Toast.LENGTH_SHORT).show();
            }

        }
    }
}
