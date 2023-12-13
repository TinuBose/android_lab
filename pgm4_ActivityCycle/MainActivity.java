package com.example.pgm4_activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity_Lifecycle","onCreate");
        Toast.makeText(MainActivity.this, "Created", Toast.LENGTH_SHORT).show();
    }

    protected void onStart(){
        super.onStart();
        Log.d("Activity_Lifecycle","onStart");
        Toast.makeText(MainActivity.this, "Start", Toast.LENGTH_SHORT).show();
    }

    protected void onResume(){
        super.onResume();
        Log.d("Activity_Lifecycle","onResume");
        Toast.makeText(MainActivity.this, "Resume", Toast.LENGTH_SHORT).show();
    }

    protected void onPause(){
        super.onPause();
        Log.d("Activity_Lifecycle","onPause");
        Toast.makeText(MainActivity.this, "Pause", Toast.LENGTH_SHORT).show();
    }

    protected void onStop(){
        super.onStop();
        Log.d("Activity_Lifecycle","onStop");
        Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
    }
    protected void onRestart(){
        super.onRestart();
        Log.d("Activity_Lifecycle","onRestart");
        Toast.makeText(MainActivity.this, "Restart", Toast.LENGTH_SHORT).show();
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.d("Activity_Lifecycle","onDestroy");
        Toast.makeText(MainActivity.this, "Destroy", Toast.LENGTH_SHORT).show();
    }
}