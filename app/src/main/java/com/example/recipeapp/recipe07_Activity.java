package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class recipe07_Activity extends AppCompatActivity {

    private Button return_bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe07);

        return_bt = (Button) findViewById(R.id.return_button);
        return_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });

        CheckBox ingred_cb01 = (CheckBox) findViewById(R.id.ingred_cb01);
        boolean checked = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("eggs2CheckBox", false);
        ingred_cb01.setChecked(checked);

        CheckBox ingred_cb02 = (CheckBox) findViewById(R.id.ingred_cb02);
        boolean checked2 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("mayonnaiseCheckBox", false);
        ingred_cb02.setChecked(checked2);

        CheckBox ingred_cb03 = (CheckBox) findViewById(R.id.ingred_cb03);
        boolean checked3 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("salt4CheckBox", false);
        ingred_cb03.setChecked(checked3);

        CheckBox ingred_cb04 = (CheckBox) findViewById(R.id.ingred_cb04);
        boolean checked4 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("pepper3CheckBox", false);
        ingred_cb04.setChecked(checked4);

        CheckBox ingred_cb05 = (CheckBox) findViewById(R.id.ingred_cb05);
        boolean checked5 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("mustardCheckBox", false);
        ingred_cb05.setChecked(checked5);

        CheckBox ingred_cb06 = (CheckBox) findViewById(R.id.ingred_cb06);
        boolean checked6 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("relishCheckBox", false);
        ingred_cb06.setChecked(checked6);

        CheckBox receipe01_rec_cb01 = (CheckBox) findViewById(R.id.receipe01_rec_cb01);
        boolean checked7 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("recipe7CheckBox", false);
        receipe01_rec_cb01.setChecked(checked7);
    }

    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onCheckboxClicked(View view) {
        switch(view.getId()) {
            case R.id.ingred_cb01:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("eggs2CheckBox", ((CheckBox) findViewById(R.id.ingred_cb01)).isChecked()).commit();
                break;

            case R.id.ingred_cb02:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("mayonnaiseCheckBox", ((CheckBox) findViewById(R.id.ingred_cb02)).isChecked()).commit();
                break;

            case R.id.ingred_cb03:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("salt4CheckBox", ((CheckBox) findViewById(R.id.ingred_cb03)).isChecked()).commit();
                break;

            case R.id.ingred_cb04:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("pepper3CheckBox", ((CheckBox) findViewById(R.id.ingred_cb04)).isChecked()).commit();
                break;

            case R.id.ingred_cb05:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("mustardCheckBox", ((CheckBox) findViewById(R.id.ingred_cb05)).isChecked()).commit();
                break;

            case R.id.ingred_cb06:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("relishCheckBox", ((CheckBox) findViewById(R.id.ingred_cb06)).isChecked()).commit();
                break;

            case R.id.receipe01_rec_cb01:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("recipe7CheckBox", ((CheckBox) findViewById(R.id.receipe01_rec_cb01)).isChecked()).commit();
                break;
        }
    }
}