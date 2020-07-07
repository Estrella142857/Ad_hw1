package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn = findViewById(R.id.btn_start);
        final TextView tv = findViewById(R.id.tv_wel);
        final Switch sw = findViewById(R.id.sw_cc);

        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setTextColor(Color.RED);
                Log.i("MainActivity", "On Click: change color");
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv.setText("Enter your name:");
                Log.i("MainActivity","On Click: START");
            }
        });
    }
}