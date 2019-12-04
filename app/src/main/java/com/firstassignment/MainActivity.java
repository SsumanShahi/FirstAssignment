package com.firstassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnArea, btnPalind,btnReverse, btnSwap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //binding
        btnArea=findViewById(R.id.btnArea);
        btnArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, AreaOfCircleActivity.class);
                startActivity(intent);
            }
        });

        btnPalind=findViewById(R.id.btnPalind);
        btnPalind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pan = new Intent(MainActivity.this, PalindromeActivity.class);
                startActivity(pan);
            }
        });

        btnReverse= findViewById(R.id.btnReverse);
        btnReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rs = new Intent(MainActivity.this, ReverseActivity.class);
                startActivity(rs);
            }
        });

        btnSwap=findViewById(R.id.btnSwap);
        btnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sw = new Intent(MainActivity.this, SwapActivity.class);
                startActivity(sw);
            }
        });
    }
}
