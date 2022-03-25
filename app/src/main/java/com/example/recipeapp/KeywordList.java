package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class KeywordList extends AppCompatActivity {

    private Button key_bt;
    private Button recipe0101_bt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyword_list);

        key_bt = (Button) findViewById(R.id.key_return_bt);
        key_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });

        recipe0101_bt = (Button) findViewById(R.id.kw_recipe_01_01_bt);
        recipe0101_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRecipe0101();
            }
        });
    }

    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openRecipe0101(){
        Intent intent = new Intent(this, recipe01_Activity.class);
        startActivity(intent);
    }
}