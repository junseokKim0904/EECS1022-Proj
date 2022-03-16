package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button key_bt; // to active the recipe01 button

    private Button recipe_a1_bt; // to active the recipe01 button
    private Button recipe_a2_bt; // to active the recipe01 button
    private Button recipe_a3_bt; // to active the recipe01 button
    private Button recipe_b1_bt; // to active the recipe01 button
    private Button recipe_b2_bt; // to active the recipe01 button
    private Button recipe_b3_bt; // to active the recipe01 button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        key_bt = (Button) findViewById(R.id.rec_key_bt);
        key_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // once button clicked, it goes to the activity
                openRecipe00Activity(); // by calling the method it goes to the activity
            }
        });

        recipe_a1_bt = (Button) findViewById(R.id.recipe_a1_bt);
        recipe_a1_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // once button clicked, it goes to the activity
                openRecipe01Activity(); // by calling the method it goes to the activity
            }
        });

        recipe_a2_bt = (Button) findViewById(R.id.recipe_a2_bt);
        recipe_a2_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // once button clicked, it goes to the activity
                openRecipe02Activity(); // by calling the method it goes to the activity
            }
        });

        recipe_a3_bt = (Button) findViewById(R.id.recipe_a3_bt);
        recipe_a3_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // once button clicked, it goes to the activity
                openRecipe03Activity(); // by calling the method it goes to the activity
            }
        });

        recipe_b1_bt = (Button) findViewById(R.id.recipe_b1_bt);
        recipe_b1_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // once button clicked, it goes to the activity
                openRecipe04Activity(); // by calling the method it goes to the activity
            }
        });

        recipe_b2_bt = (Button) findViewById(R.id.recipe_b2_bt);
        recipe_b2_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // once button clicked, it goes to the activity
                openRecipe05Activity(); // by calling the method it goes to the activity
            }
        });

        recipe_b3_bt = (Button) findViewById(R.id.recipe_b3_bt);
        recipe_b3_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // once button clicked, it goes to the activity
//                openRecipe06Activity(); // by calling the method it goes to the activity
            }
        });
    }

    public void openRecipe00Activity(){ // it goes to keyword_list once it runs
        Intent intent = new Intent(this, KeywordList.class);
        startActivity(intent);
    }

    public void openRecipe01Activity(){ // it goes to recipe01_Activity once it runs
        Intent intent = new Intent(this, recipe01_Activity.class);
        startActivity(intent);
    }

    public void openRecipe02Activity(){ // it goes to recipe02_Activity once it runs
        Intent intent = new Intent(this, recipe02_Activity.class);
        startActivity(intent);
    }

    public void openRecipe03Activity(){ // it goes to recipe03_Activity once it runs
        Intent intent = new Intent(this, recipe03_Activity.class);
        startActivity(intent);
    }

    public void openRecipe04Activity(){ // it goes to recipe04_Activity once it runs
        Intent intent = new Intent(this, recipe04_Activity.class);
        startActivity(intent);
    }

    public void openRecipe05Activity(){ // it goes to recipe05_Activity once it runs
        Intent intent = new Intent(this, recipe05_Activity.class);
        startActivity(intent);
    }
}