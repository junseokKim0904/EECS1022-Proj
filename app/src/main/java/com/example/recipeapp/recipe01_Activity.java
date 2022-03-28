package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
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
        boolean checked = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("garlicCheckBox", false);
        ingred_cb01.setChecked(checked);

        CheckBox ingred_cb02 = (CheckBox) findViewById(R.id.ingred_cb02);
        boolean checked2 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("garbanBeanCheckBox", false);
        ingred_cb02.setChecked(checked2);

        CheckBox ingred_cb03 = (CheckBox) findViewById(R.id.ingred_cb03);
        boolean checked3 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("lemonJuiceCheckBox", false);
        ingred_cb03.setChecked(checked3);

        CheckBox ingred_cb04 = (CheckBox) findViewById(R.id.ingred_cb04);
        boolean checked4 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("tahiniCheckBox", false);
        ingred_cb04.setChecked(checked4);

        CheckBox ingred_cb05 = (CheckBox) findViewById(R.id.ingred_cb05);
        boolean checked5 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("saltCheckBox", false);
        ingred_cb05.setChecked(checked5);

        CheckBox ingred_cb06 = (CheckBox) findViewById(R.id.ingred_cb06);
        boolean checked6 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("blackPepperCheckBox", false);
        ingred_cb06.setChecked(checked6);

        CheckBox ingred_cb07 = (CheckBox) findViewById(R.id.ingred_cb07);
        boolean checked7 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("oliveOilCheckBox", false);
        ingred_cb07.setChecked(checked7);

        CheckBox receipe01_rec_cb01 = (CheckBox) findViewById(R.id.receipe01_rec_cb01);
        boolean checked8 = PreferenceManager.getDefaultSharedPreferences(this)
                .getBoolean("recipe1CheckBox", false);
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
                        .putBoolean("garlicCheckBox", ((CheckBox) findViewById(R.id.ingred_cb01)).isChecked()).commit();
                break;

            case R.id.ingred_cb02:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("garbanBeanCheckBox", ((CheckBox) findViewById(R.id.ingred_cb02)).isChecked()).commit();
                break;

            case R.id.ingred_cb03:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("lemonJuiceCheckBox", ((CheckBox) findViewById(R.id.ingred_cb03)).isChecked()).commit();
                break;

            case R.id.ingred_cb04:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("tahiniCheckBox", ((CheckBox) findViewById(R.id.ingred_cb04)).isChecked()).commit();
                break;

            case R.id.ingred_cb05:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("saltCheckBox", ((CheckBox) findViewById(R.id.ingred_cb05)).isChecked()).commit();
                break;

            case R.id.ingred_cb06:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("blackPepperCheckBox", ((CheckBox) findViewById(R.id.ingred_cb06)).isChecked()).commit();
                break;

            case R.id.ingred_cb07:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("oliveOilCheckBox", ((CheckBox) findViewById(R.id.ingred_cb07)).isChecked()).commit();
                break;

            case R.id.receipe01_rec_cb01:
                PreferenceManager.getDefaultSharedPreferences(this).edit()
                        .putBoolean("recipe1CheckBox", ((CheckBox) findViewById(R.id.receipe01_rec_cb01)).isChecked()).commit();
                break;
        }
    }
}