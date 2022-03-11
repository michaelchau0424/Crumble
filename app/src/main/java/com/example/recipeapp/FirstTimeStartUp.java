package com.example.recipeapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FirstTimeStartUp extends AppCompatActivity {
    Button buttonContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_time_start_up);

        buttonContinue = findViewById(R.id.button);
        buttonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstTimeStartUp.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
