package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    private Button main_kw_bt; // to active the main keyword button

    private Button main_hummus_bt; // to active the recipe01 button
    private Button main_mp_bt; // to active the recipe02 button
    private Button main_vo_bt; // to active the recipe03 button
    private Button main_cppsoup_bt; // to active the recipe04 button
    private Button main_cctp_bt; // to active the recipe05 button
    private Button main_agp_bt; // to active the recipe06 button
    private Button main_es_bt; // to active the recipe07 button
    private Button main_becb_bt; // to active the recipe08 button
    private Button main_bcd_bt; // to active the recipe09 button
    private Button main_sstt_bt; // to active the recipe10 button

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

        main_cppsoup_bt = (Button) findViewById(R.id.main_cppsoup_bt);
        main_cppsoup_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // once button clicked, it goes to the activity
                openRecipe04Activity(); // by calling the method it goes to the activity
            }
        });

        main_cctp_bt = (Button) findViewById(R.id.main_cctp_bt);
        main_cctp_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // once button clicked, it goes to the activity
                openRecipe05Activity(); // by calling the method it goes to the activity
            }
        });

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

        main_bcd_bt = (Button) findViewById(R.id.main_bcd_bt);
        main_bcd_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // once button clicked, it goes to the activity
                openRecipe09Activity(); // by calling the method it goes to the activity
            }
        });

        main_sstt_bt = (Button) findViewById(R.id.main_sstt_bt);
        main_sstt_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { // once button clicked, it goes to the activity
                openRecipe10Activity(); // by calling the method it goes to the activity
            }
        });

        CheckBox checkBox20 = (CheckBox) findViewById(R.id.checkBox20);
        boolean checked = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("recipe1CheckBox", false);
        checkBox20.setChecked(checked);

        CheckBox checkBox29 = (CheckBox) findViewById(R.id.checkBox29);
        boolean checked2 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("recipe2CheckBox", false);
        checkBox29.setChecked(checked2);

        CheckBox checkBox27 = (CheckBox) findViewById(R.id.checkBox27);
        boolean checked3 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("recipe3CheckBox", false);
        checkBox27.setChecked(checked3);

        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        boolean checked4 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("recipe4CheckBox", false);
        checkBox2.setChecked(checked4);

        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        boolean checked5 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("recipe5CheckBox", false);
        checkBox3.setChecked(checked5);

        CheckBox recipe_a1_cb = (CheckBox) findViewById(R.id.recipe_a1_cb);
        boolean checked6 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("recipe6CheckBox", false);
        recipe_a1_cb.setChecked(checked6);

        CheckBox checkBox23 = (CheckBox) findViewById(R.id.checkBox23);
        boolean checked7 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("recipe7CheckBox", false);
        checkBox23.setChecked(checked7);

        CheckBox recipe_b1_cb = (CheckBox) findViewById(R.id.recipe_b1_cb);
        boolean checked8 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("recipe8CheckBox", false);
        recipe_b1_cb.setChecked(checked8);

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        boolean checked9 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("recipe9CheckBox", false);
        checkBox.setChecked(checked9);

        CheckBox checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        boolean checked10 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("recipe10CheckBox", false);
        checkBox5.setChecked(checked10);
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

    public void onCheckboxClicked(View view) {
        switch(view.getId()) {
            case R.id.checkBox20:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("recipe1CheckBox", ((CheckBox) findViewById(R.id.checkBox20)).isChecked()).commit();
                break;

            case R.id.checkBox29:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("recipe2CheckBox", ((CheckBox) findViewById(R.id.checkBox29)).isChecked()).commit();
                break;

            case R.id.checkBox27:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("recipe3CheckBox", ((CheckBox) findViewById(R.id.checkBox27)).isChecked()).commit();
                break;

            case R.id.checkBox2:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("recipe4CheckBox", ((CheckBox) findViewById(R.id.checkBox2)).isChecked()).commit();
                break;

            case R.id.checkBox3:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("recipe5CheckBox", ((CheckBox) findViewById(R.id.checkBox3)).isChecked()).commit();
                break;

            case R.id.recipe_a1_cb:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("recipe6CheckBox", ((CheckBox) findViewById(R.id.recipe_a1_cb)).isChecked()).commit();
                break;

            case R.id.checkBox23:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("recipe7CheckBox", ((CheckBox) findViewById(R.id.checkBox23)).isChecked()).commit();
                break;

            case R.id.recipe_b1_cb:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("recipe8CheckBox", ((CheckBox) findViewById(R.id.recipe_b1_cb)).isChecked()).commit();
                break;

            case R.id.checkBox:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("recipe9CheckBox", ((CheckBox) findViewById(R.id.checkBox)).isChecked()).commit();
                break;

            case R.id.checkBox5:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("recipe10CheckBox", ((CheckBox) findViewById(R.id.checkBox5)).isChecked()).commit();
                break;
        }
    }
}