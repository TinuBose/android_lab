package com.example.pgm6_validations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText fname,sname,email,password;
    Button proceed,clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname=(EditText) findViewById(R.id.editTextText);
        sname=(EditText) findViewById(R.id.editTextText2);
        email=(EditText) findViewById(R.id.editTextText3);
        password=(EditText) findViewById(R.id.editTextText4);

        proceed=(Button) findViewById(R.id.button2);
        clear=(Button) findViewById(R.id.button);

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nam=fname.getText().toString();
                String snam=sname.getText().toString();
                String mail=email.getText().toString();
                String pass=password.getText().toString();
                if(nam.length()==0 && snam.length()==0 && mail.length()==0 && pass.length()==0){
                    Toast.makeText(getApplicationContext(), "All fields are required...", Toast.LENGTH_SHORT).show();
                }else if(nam.length()==0){
                    fname.setError("This field is required");
                }else if(snam.length()==0){
                    sname.setError("This field is required");
                }else if(mail.length()==0){
                    email.setError("Email is required");
                }else if(pass.length()==0){
                    password.setError("Password is required");
                }else if(pass.length()<8){
                    password.setError("min 8 characters");
                }else{
                    Toast.makeText(MainActivity.this, "done", Toast.LENGTH_SHORT).show();
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fname.setText("");
                sname.setText("");
                email.setText("");
                password.setText("");
            }
        });
    }
}