package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KeywordList extends AppCompatActivity {

    private Button kw_return_bt;
    private Button kw_mp_bt;
    private Button kw_agp_bt;

    private Button kw_es_bt;
    private Button kw_vo_bt;

    private Button kw_bcd_bt;
    private Button kw_cctp_bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keyword_list);

        kw_return_bt = (Button) findViewById(R.id.kw_return_bt);
        kw_return_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });

        kw_mp_bt = (Button) findViewById(R.id.kw_mp_bt);
        kw_mp_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRecipe02Activity();
            }
        });

        kw_agp_bt = (Button) findViewById(R.id.kw_agp_bt);
        kw_agp_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRecipe06Activity();
            }
        });

        kw_es_bt = (Button) findViewById(R.id.kw_es_bt);
        kw_es_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRecipe07Activity();
            }
        });

        kw_vo_bt = (Button) findViewById(R.id.kw_vo_bt);
        kw_vo_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRecipe03Activity();
            }
        });

        kw_bcd_bt = (Button) findViewById(R.id.kw_bcd_bt);
        kw_bcd_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRecipe09Activity();
            }
        });

        kw_cctp_bt = (Button) findViewById(R.id.kw_cctp_bt);
        kw_cctp_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRecipe05Activity();
            }
        });
    }

    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openRecipe01Activity(){ // direct to Hummus Recipe (recipe01_Activity)
        Intent intent = new Intent(this, recipe01_Activity.class);
        startActivity(intent);
    }

    public void openRecipe02Activity(){ // direct to Mashed Potatoes Recipe (recipe02_Activity)
        Intent intent = new Intent(this, recipe02_Activity.class);
        startActivity(intent);
    }

    public void openRecipe03Activity(){ // direct to Vegetarian Omelet Recipe (recipe03_Activity)
        Intent intent = new Intent(this, recipe03_Activity.class);
        startActivity(intent);
    }

    public void openRecipe04Activity(){ // direct to Courgette, pea and pesto Soup (recipe04_Activity)
        Intent intent = new Intent(this, recipe04_Activity.class);
        startActivity(intent);
    }

    public void openRecipe05Activity(){ // direct to Chipotle chicken tacos with pineapple salsa (recipe05_Activity)
        Intent intent = new Intent(this, recipe05_Activity.class);
        startActivity(intent);
    }

    public void openRecipe06Activity(){ // direct to Au Gratin Potatoes Recipe (recipe06_Activity)
        Intent intent = new Intent(this, recipe06_Activity.class);
        startActivity(intent);
    }

    public void openRecipe07Activity(){ // direct to Egg Salad Recipe (recipe07_Activity)
        Intent intent = new Intent(this, recipe07_Activity.class);
        startActivity(intent);
    }

    public void openRecipe08Activity(){ // direct to Bacon Egg Cheese Bagel Recipe (recipe08_Activity)
        Intent intent = new Intent(this, recipe08_Activity.class);
        startActivity(intent);
    }

    public void openRecipe09Activity(){ // direct to Broccoli Chicken Divan (recipe09_Activity)
        Intent intent = new Intent(this, recipe09_Activity.class);
        startActivity(intent);
    }

    public void openRecipe10Activity(){ // direct to Spiced salmon &\ntomato traybake (recipe10_Activity)
        Intent intent = new Intent(this, recipe10_Activity.class);
        startActivity(intent);
    }
}