package com.example.finalprojectandroid.mainMenu;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalprojectandroid.R;
import com.example.finalprojectandroid.calculateConsumptionFuel.activity.CalculateConsumptionFuelActivity;

public class MainActivity extends AppCompatActivity {

    Button calculateFuel, historyOfRefuelling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


        calculateFuel.setOnClickListener(v -> {
            Intent intent = new Intent(this, CalculateConsumptionFuelActivity.class);
            startActivity(intent);
        });

    }

    private void init() {
        calculateFuel = findViewById(R.id.calculateBurnButton);
        historyOfRefuelling = findViewById(R.id.purchaseHistoryButton);
    }
}