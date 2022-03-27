package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button main_kw_bt; // to active the main keyword button

    private Button main_hummus_bt; // to active the recipe01 button
    private Button main_mp_bt; // to active the recipe02 button
    private Button main_vo_bt; // to active the recipe03 button
    private Button main_04_bt; // to active the recipe04 button
    private Button main_05_bt; // to active the recipe05 button
    private Button main_agp_bt; // to active the recipe06 button
    private Button main_es_bt; // to active the recipe07 button
    private Button main_becb_bt; // to active the recipe08 button
    private Button main_09_bt; // to active the recipe09 button
    private Button main_10_bt; // to active the recipe10 button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_kw_bt = (Button) findViewById(R.id.main_kw_bt);
        main_kw_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // once button clicked
                openRecipe00Activity(); // open to KEYWORD layout
            }
        });

        main_hummus_bt = (Button) findViewById(R.id.main_hummus_bt);
        main_hummus_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // once button clicked
                openRecipe01Activity(); // by calling the method it goes to the activity
            }
        });

        main_mp_bt = (Button) findViewById(R.id.main_mp_bt);
        main_mp_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // once button clicked, it goes to the activity
                openRecipe02Activity(); // by calling the method it goes to the activity
            }
        });

        main_vo_bt = (Button) findViewById(R.id.main_vo_bt);
        main_vo_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // once button clicked, it goes to the activity
                openRecipe03Activity(); // by calling the method it goes to the activity
            }
        });

//        main_04_bt = (Button) findViewById(R.id.main_04_bt);
//        main_04_bt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) { // once button clicked, it goes to the activity
//                openRecipe04Activity(); // by calling the method it goes to the activity
//            }
//        });

//        main_05_bt = (Button) findViewById(R.id.main_05_bt);
//        main_05_bt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) { // once button clicked, it goes to the activity
//                openRecipe5Activity(); // by calling the method it goes to the activity
//            }
//        });

        main_agp_bt = (Button) findViewById(R.id.main_agp_bt);
        main_agp_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // once button clicked, it goes to the activity
                openRecipe06Activity(); // by calling the method it goes to the activity
            }
        });

        main_es_bt = (Button) findViewById(R.id.main_es_bt);
        main_es_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // once button clicked, it goes to the activity
                openRecipe07Activity(); // by calling the method it goes to the activity
            }
        });

        main_becb_bt = (Button) findViewById(R.id.main_becb_bt);
        main_becb_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // once button clicked, it goes to the activity
                openRecipe08Activity(); // by calling the method it goes to the activity
            }
        });

//        main_09_bt = (Button) findViewById(R.id.main_09_bt);
//        main_09_bt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) { // once button clicked, it goes to the activity
//                openRecipe08Activity(); // by calling the method it goes to the activity
//            }
//        });
//
//        main_10_bt = (Button) findViewById(R.id.main_10_bt);
//        main_10_bt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) { // once button clicked, it goes to the activity
//                openRecipe08Activity(); // by calling the method it goes to the activity
//            }
//        });
    }

    public void openRecipe00Activity(){ // it goes to keyword_list once it runs
        Intent intent = new Intent(this, KeywordList.class);
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

    public void openRecipe04Activity(){ // direct to recipe04_Activity once it runs
        Intent intent = new Intent(this, recipe04_Activity.class);
        startActivity(intent);
    }

    public void openRecipe05Activity(){ // direct to recipe05_Activity once it runs
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

    public void openRecipe09Activity(){ // direct to recipe09_Activity once it runs
        Intent intent = new Intent(this, recipe09_Activity.class);
        startActivity(intent);
    }

    public void openRecipe10Activity(){ // direct to recipe10_Activity once it runs
        Intent intent = new Intent(this, recipe10_Activity.class);
        startActivity(intent);
    }
}