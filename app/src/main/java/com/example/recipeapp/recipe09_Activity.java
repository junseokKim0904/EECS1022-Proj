package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class recipe09_Activity extends AppCompatActivity {

    private Button return_bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe09);

        return_bt = (Button) findViewById(R.id.return_button);
        return_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });

        CheckBox ingred_cb01 = (CheckBox) findViewById(R.id.ingred_cb01);
        boolean checked = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("broccoliCheckBox", false);
        ingred_cb01.setChecked(checked);

        CheckBox ingred_cb02 = (CheckBox) findViewById(R.id.ingred_cb02);
        boolean checked2 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("chickenCheckBox", false);
        ingred_cb02.setChecked(checked2);

        CheckBox ingred_cb03 = (CheckBox) findViewById(R.id.ingred_cb03);
        boolean checked3 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("broccoliSoupCheckBox", false);
        ingred_cb03.setChecked(checked3);

        CheckBox ingred_cb04 = (CheckBox) findViewById(R.id.ingred_cb04);
        boolean checked4 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("milk6CheckBox", false);
        ingred_cb04.setChecked(checked4);

        CheckBox ingred_cb05 = (CheckBox) findViewById(R.id.ingred_cb05);
        boolean checked5 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("cheddarCheese2CheckBox", false);
        ingred_cb05.setChecked(checked5);

        CheckBox ingred_cb06 = (CheckBox) findViewById(R.id.ingred_cb06);
        boolean checked6 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("butter6CheckBox", false);
        ingred_cb06.setChecked(checked6);

        CheckBox ingred_cb07 = (CheckBox) findViewById(R.id.ingred_cb07);
        boolean checked7 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("breadCrumbsCheckBox", false);
        ingred_cb07.setChecked(checked7);

        CheckBox receipe01_rec_cb01 = (CheckBox) findViewById(R.id.receipe01_rec_cb01);
        boolean checked8 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("recipe9CheckBox", false);
        receipe01_rec_cb01.setChecked(checked8);
    }

    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onCheckboxClicked(View view) {
        switch(view.getId()) {
            case R.id.ingred_cb01:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("broccoliCheckBox", ((CheckBox) findViewById(R.id.ingred_cb01)).isChecked()).commit();
                break;

            case R.id.ingred_cb02:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("chickenCheckBox", ((CheckBox) findViewById(R.id.ingred_cb02)).isChecked()).commit();
                break;

            case R.id.ingred_cb03:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("broccoliSoupCheckBox", ((CheckBox) findViewById(R.id.ingred_cb03)).isChecked()).commit();
                break;

            case R.id.ingred_cb04:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("milk6CheckBox", ((CheckBox) findViewById(R.id.ingred_cb04)).isChecked()).commit();
                break;

            case R.id.ingred_cb05:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("cheddarCheese2CheckBox", ((CheckBox) findViewById(R.id.ingred_cb05)).isChecked()).commit();
                break;

            case R.id.ingred_cb06:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("butter6CheckBox", ((CheckBox) findViewById(R.id.ingred_cb06)).isChecked()).commit();
                break;

            case R.id.ingred_cb07:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("breadCrumbsCheckBox", ((CheckBox) findViewById(R.id.ingred_cb07)).isChecked()).commit();
                break;

            case R.id.receipe01_rec_cb01:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("recipe9CheckBox", ((CheckBox) findViewById(R.id.receipe01_rec_cb01)).isChecked()).commit();
                break;
        }
    }
}