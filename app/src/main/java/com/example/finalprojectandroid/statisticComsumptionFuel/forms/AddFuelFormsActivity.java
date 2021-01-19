package com.example.finalprojectandroid.statisticComsumptionFuel.forms;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.finalprojectandroid.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class AddFuelFormsActivity extends AppCompatActivity {

    Button addToDatabaseButton;
    TextInputLayout amountFuelInput, amount_kilometers_input, costFuel;
    String amountFuel, amount_kilometers, amountCostFuel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_add_fuel);
        init();

        addToDatabaseButton.setOnClickListener(v -> {
            amountFuel = Objects.requireNonNull(amountFuelInput.getEditText()).getText().toString().trim();
            amount_kilometers = Objects.requireNonNull(amount_kilometers_input.getEditText()).getText().toString().trim();
            amountCostFuel = Objects.requireNonNull(costFuel.getEditText()).getText().toString().trim();
            Intent intent = new Intent(this, ResponseFormsActivity.class);
            startActivity(intent);
        });


    }
    private void init() {
        addToDatabaseButton = findViewById(R.id.buttonAddToDatabase);
        amountFuelInput = findViewById(R.id.amount_fuel_input);
        amount_kilometers_input = findViewById(R.id.amount_kilometers_input);
        costFuel = findViewById(R.id.cost_fuel);
    }
}
