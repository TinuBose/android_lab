package com.example.pgm_3_login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usname,pass;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usname=(EditText)  findViewById(R.id.user);
        pass=(EditText) findViewById(R.id.pass);
        btn=(Button) findViewById(R.id.the_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=usname.getText().toString();
                String password=pass.getText().toString();
                if(username.equals("tinubose") && password.equals("123")){
                    Toast.makeText(MainActivity.this, "logged in...", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "invalid credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}