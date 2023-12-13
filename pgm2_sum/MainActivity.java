package com.example.pgm_2_thesum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText val1,val2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        val1=(EditText) findViewById(R.id.editTextText);
        val2=(EditText) findViewById(R.id.editTextText2);
        btn=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String v1=val1.getText().toString();
                String v2=val2.getText().toString();
                if(v1.length()!=0 && v2.length()!=0) {
                    int n1 = Integer.parseInt(v1);
                    int n2 = Integer.parseInt(v2);
                    int the_sum = n1 + n2;

                    Toast.makeText(getApplicationContext(), String.valueOf(the_sum), Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "check both fileds are not empty!", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}