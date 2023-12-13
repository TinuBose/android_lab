package com.example.pgm5_simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2,ans;
    Button btn,btn5,btn6,btn7,btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText) findViewById(R.id.editTextText);
        num2=(EditText) findViewById(R.id.editTextText2);
        ans=(EditText) findViewById(R.id.editTextText3);
        btn=(Button) findViewById(R.id.button);
        btn5=(Button) findViewById(R.id.button5);
        btn6=(Button) findViewById(R.id.button6);
        btn7=(Button) findViewById(R.id.button7);
        btn8=(Button) findViewById(R.id.button8);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1=num1.getText().toString();
                String n2=num2.getText().toString();
                int v1=Integer.parseInt(n1);
                int v2=Integer.parseInt(n2);
                int res=v1+v2;
                ans.setText(Integer.toString(res));
            }
        }

        );
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1=num1.getText().toString();
                String n2=num2.getText().toString();
                int v1=Integer.parseInt(n1);
                int v2=Integer.parseInt(n2);
                int res=v1-v2;
                ans.setText(Integer.toString(res));
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1=num1.getText().toString();
                String n2=num2.getText().toString();
                double v1=Double.parseDouble(n1);
                double v2=Double.parseDouble(n2);
                double res=v1*v2;
                ans.setText(Double.toString(res));
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1=num1.getText().toString();
                String n2=num2.getText().toString();
                double v1=Double.parseDouble(n1);
                double v2=Double.parseDouble(n2);
                double res=v1/v2;
                ans.setText(Double.toString(res));
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText("");
                num1.setText("");
                num2.setText("");
            }
        });
    }
}