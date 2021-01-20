package com.example.finalprojectandroid.calculateConsumptionFuel.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.finalprojectandroid.R;
import com.example.finalprojectandroid.calculateConsumptionFuel.calculateFuelPre.CalculateFuelFragments;

public class Fragment1 extends Fragment {

    EditText avaregeFuelConsumption, amountKilometers, litrePriceFuel, amountPerson;
    Button calculateButton;
    float averageFuelConsumption, kilometers, priceFuel, person, amountRequireFuel, costTravel, costPerPerson;
    CalculateFuelFragments calculateFuelFragmentsPre;
    TextView outPutFuelConsumption, costTravelOutput, costPerPersonOutput;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        calculateFuelFragmentsPre = new CalculateFuelFragments();
        init(view);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

        calculateButton.setOnClickListener(v1->{
            if(!fieldsIsEmpty()){
                initFloatValue();
                amountRequireFuel=calculateFuelFragmentsPre.calculateRequiredAmountFuel(averageFuelConsumption, kilometers);
                setOutPutFuelConsumption(amountRequireFuel);
                costTravel = calculateFuelFragmentsPre.calculateCostTravel(amountRequireFuel, priceFuel);
                setCostTravel(costTravel);
                costPerPerson = calculateFuelFragmentsPre.calculateCostPerPerson(costTravel, person);
                setCostTravelPerPerson(costPerPerson);
                Toast.makeText(getContext(), "Było w wymaganiach to jest :D", Toast.LENGTH_LONG).show();
            }
        });
    }

    private boolean fieldsIsEmpty() {
        String inputAverageFuel = avaregeFuelConsumption.getText().toString();
        String inputKilometers = amountKilometers.getText().toString();
        String inputPriceFuel = litrePriceFuel.getText().toString();
        String inputPerson = amountPerson.getText().toString();

        if(inputAverageFuel.isEmpty() || inputKilometers.isEmpty() || inputPriceFuel.isEmpty() || inputPerson.isEmpty()){
            Toast.makeText(getContext(), R.string.youMustEnterFieldsValue, Toast.LENGTH_LONG).show();
            return true;
        }
        else {
            return false;
        }
    }

    private void setCostTravelPerPerson(float costPerPerson) {
        String valueInString = String.valueOf(costPerPerson);
        String result = "Koszt w przeliczeniu na osobe: " + valueInString + " zł";
        costPerPersonOutput.setText(result);
    }

    private void setCostTravel(float costTravel) {
        String valueInString = String.valueOf(costTravel);
        String result = "Koszta podróży wyniosą: " + valueInString + " zł";
        costTravelOutput.setText(result);
    }

    private void setOutPutFuelConsumption(float value){
        String valueInString = String.valueOf(value);
        String result = "Ilosc paliwa potrzebna to: " + valueInString;
        outPutFuelConsumption.setText(result);
    }

    private void initFloatValue() {
        averageFuelConsumption = Float.parseFloat(avaregeFuelConsumption.getText().toString());
        kilometers = Float.parseFloat(amountKilometers.getText().toString());
        priceFuel = Float.parseFloat(litrePriceFuel.getText().toString());
        person = Float.parseFloat(amountPerson.getText().toString());
    }

    private void init(View view1) {
        avaregeFuelConsumption = view1.findViewById(R.id.editTextNumberDecimal1);
        amountKilometers = view1.findViewById(R.id.editTextNumberDecimal2);
        litrePriceFuel = view1.findViewById(R.id.editTextNumberDecimal3);
        amountPerson = view1.findViewById(R.id.editTextNumberDecimal);
        calculateButton = view1.findViewById(R.id.button);
        outPutFuelConsumption = view1.findViewById(R.id.OutputFuelConsumption);
        costPerPersonOutput = view1.findViewById(R.id.costPerPerson);
        costTravelOutput = view1. findViewById(R.id.costTravel);

    }
}
