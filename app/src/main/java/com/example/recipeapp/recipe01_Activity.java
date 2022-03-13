package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class recipe01_Activity extends AppCompatActivity {

    Button inc, dec;
    TextView bowls;
    int count;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe01);

        inc = findViewById(R.id.increment);
        dec = findViewById(R.id.decrement);

        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count ++;
                bowls.setText(count);
            }
        });

        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count --;
                bowls.setText(count);
            }
        });
    }



}