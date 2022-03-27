package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.TextView;

public class recipe01_Activity extends AppCompatActivity {

    private Button return_bt;

    Button inc, dec;
    TextView bowls;
    int count;
    CheckedTextView C1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe01);

        return_bt = (Button) findViewById(R.id.return_button);
        return_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });

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

        CheckBox ingred_cb01 = (CheckBox) findViewById(R.id.ingred_cb01);
    }

    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}