package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user_text,pass_text;
    Button sign_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user_text=(EditText) findViewById(R.id.usrname_text);
        pass_text=(EditText)  findViewById(R.id.pass_text);
        sign_button=(Button) findViewById(R.id.the_button);
        sign_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=user_text.getText().toString();
                String password=pass_text.getText().toString();
                if(username.equals("user") && password.equals("password")){
                    Toast.makeText(MainActivity.this,"successfull",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"invalid",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
