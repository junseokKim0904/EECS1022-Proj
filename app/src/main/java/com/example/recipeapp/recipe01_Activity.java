package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.nio.charset.CharacterCodingException;
import java.util.prefs.Preferences;

public class recipe01_Activity extends AppCompatActivity {

    private Button button;

    Button inc, dec;
    TextView bowls;
    int count;
    CheckedTextView C1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe01);

        button = (Button) findViewById(R.id.return_button);
        button.setOnClickListener(new View.OnClickListener() {
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