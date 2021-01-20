package com.example.finalprojectandroid.statisticComsumptionFuel.forms;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.finalprojectandroid.R;

import java.util.ArrayList;

public class ResponseFormsActivity extends AppCompatActivity {


    TextView amountFuel, amountKilometers, costFuel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.response_add_form_fuel);
        init();

        Bundle extras = getIntent().getExtras();

        if(extras!=null){
            ArrayList<String> data = extras.getStringArrayList("DataResponse");
            setTextViews(data);
        }

    }

    private void setTextViews(ArrayList<String> data) {
        String s1 = getString(R.string.inputValueFuelIs) + " " + data.get(0) +" l";
        String s2 = getString(R.string.inputValueKilometersIs) +" "+ data.get(1) + " km";
        String s3 = getString(R.string.inputCostFuelIs) +" "+ data.get(2) + " zł";
        amountFuel.setText(s1);
        amountKilometers.setText(s2);
        costFuel.setText(s3);
    }

    private void init() {
        amountFuel = findViewById(R.id.textView12);
        amountKilometers = findViewById(R.id.textView13);
        costFuel = findViewById(R.id.textView14);
    }
}
