package com.example.finalprojectandroid.statisticComsumptionFuel.forms;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.finalprojectandroid.R;
import com.example.finalprojectandroid.RoomSQLite.dbHandler.DbAbstract;
import com.example.finalprojectandroid.RoomSQLite.models.RefuellingEntity;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.Objects;

public class AddFuelFormsActivity extends AppCompatActivity {

    Button addToDatabaseButton;
    TextInputLayout amountFuelInput, amount_kilometers_input, costFuel;
    String amountFuel, amount_kilometers, amountCostFuel;
    AddFuelFormsPre addFuelFormsPre;
    DbAbstract databaseHandle;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_add_fuel);
        init();
        addFuelFormsPre = new AddFuelFormsPre();

        //create database
        databaseHandle = addFuelFormsPre.accessToDataBase(this);


        addToDatabaseButton.setOnClickListener(v -> {
            amountFuel = Objects.requireNonNull(amountFuelInput.getEditText()).getText().toString().trim();
            amount_kilometers = Objects.requireNonNull(amount_kilometers_input.getEditText()).getText().toString().trim();
            amountCostFuel = Objects.requireNonNull(costFuel.getEditText()).getText().toString().trim();

            if(amountFuel.isEmpty() || amount_kilometers.isEmpty() || amountCostFuel.isEmpty()){
                Toast.makeText(this, "Musisz uzupełnić wszystkie pola", Toast.LENGTH_SHORT).show();
            }else{
                ArrayList<String>  listData= new ArrayList<>();
                listData.add(amountFuel);
                listData.add(amount_kilometers);
                listData.add(amountCostFuel);

                RefuellingEntity refuellingEntity= addFuelFormsPre.createObjectEntity(amountFuel, amount_kilometers, amountCostFuel);
                addFuelFormsPre.writeToDatabase(databaseHandle, refuellingEntity);

                Intent intent = new Intent(this, ResponseFormsActivity.class);
                intent.putExtra("DataResponse", listData);
                startActivity(intent);
            }



        });


    }
    private void init() {
        addToDatabaseButton = findViewById(R.id.buttonAddToDatabase);
        amountFuelInput = findViewById(R.id.amount_fuel_input);
        amount_kilometers_input = findViewById(R.id.amount_kilometers_input);
        costFuel = findViewById(R.id.cost_fuel);
    }
}
