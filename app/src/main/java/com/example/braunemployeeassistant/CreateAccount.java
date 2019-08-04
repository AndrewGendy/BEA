package com.example.braunemployeeassistant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateAccount extends AppCompatActivity {

    EditText etEmpFirstName, etEmpLastName, etEmpID, etEmpPassword;
    Button btn8Hours, btn12Hours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        etEmpFirstName = findViewById(R.id.etEmpFirstName);
        etEmpLastName = findViewById(R.id.etEmpLastName);
        etEmpID = findViewById(R.id.etEmpID);
        etEmpPassword = findViewById(R.id.etEmpPassword);
        btn8Hours = findViewById(R.id.btn8H);
        btn12Hours = findViewById(R.id.btn12Hours);

        btn8Hours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (etEmpFirstName.getText().toString().isEmpty())
                {
                    Toast.makeText(CreateAccount.this, "Please Enter Your First Name", Toast.LENGTH_SHORT).show();
                }
                else if (etEmpLastName.getText().toString().isEmpty())
                {
                    Toast.makeText(CreateAccount.this, "Please Enter Your Last Name", Toast.LENGTH_SHORT).show();
                }
                else if (etEmpID.getText().toString().isEmpty())
                {
                    Toast.makeText(CreateAccount.this, "Please Enter Your Employee Number", Toast.LENGTH_SHORT).show();
                }
                else if (etEmpPassword.getText().toString().isEmpty())
                {
                    Toast.makeText(CreateAccount.this, "Please Enter a Valid Password", Toast.LENGTH_SHORT).show();
                }
                else
                {

                    Intent intent = new Intent();
                    intent.putExtra("EmpFirstName", etEmpFirstName.getText().toString().trim());
                    intent.putExtra("EmpLastName", etEmpLastName.getText().toString().trim());
                    intent.putExtra("EmpID", etEmpID.getText().toString().trim());
                    intent.putExtra("EmpPassword", etEmpPassword.getText().toString().trim());

                    setResult(RESULT_OK, intent);
                    CreateAccount.this.finish();

                }

            }
        });

        btn12Hours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (etEmpFirstName.getText().toString().isEmpty())
                {
                    Toast.makeText(CreateAccount.this, "Please Enter Your First Name", Toast.LENGTH_SHORT).show();
                }
                else if (etEmpLastName.getText().toString().isEmpty())
                {
                    Toast.makeText(CreateAccount.this, "Please Enter Your Last Name", Toast.LENGTH_SHORT).show();
                }
                else if (etEmpID.getText().toString().isEmpty())
                {
                    Toast.makeText(CreateAccount.this, "Please Enter Your Employee Number", Toast.LENGTH_SHORT).show();
                }
                else if (etEmpPassword.getText().toString().isEmpty())
                {
                    Toast.makeText(CreateAccount.this, "Please Enter a Valid Password", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    String EmpFirstName = etEmpFirstName.getText().toString().trim();
                    String EmpLastName = etEmpLastName.getText().toString().trim();
                    String EmpID = etEmpID.getText().toString().trim();
                    String EmpPassword = etEmpPassword.getText().toString().trim();

                    Intent intent = new Intent();
                    intent.putExtra("EmpFirstName", EmpFirstName);
                    intent.putExtra("EmpLastName", EmpLastName);
                    intent.putExtra("EmpID", EmpID);
                    intent.putExtra("EmpPassword", EmpPassword);

                    setResult(RESULT_OK, intent);
                    CreateAccount.this.finish();

                }

            }
        });



    }
}
