package com.example.finalprojectandroid.statisticComsumptionFuel.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.finalprojectandroid.R;
import com.example.finalprojectandroid.statisticComsumptionFuel.FrafmentStatisticPre.StatisticGeneralPre;
import com.example.finalprojectandroid.statisticComsumptionFuel.forms.AddFuelFormsActivity;

public class StatisticGeneralFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    private static final String TAG="STATISTIC_GENERAL_STATIC";
    private TextView amountOfFuel, amountOfKilometers, spendMoney;
    private Button addFuelButton;
    private StatisticGeneralPre statisticGeneralPre;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.general_statistic_fragment, container, false);
        init(view);


        //addFuelButton
        addFuelButton.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(), AddFuelFormsActivity.class);
            startActivity(intent);
        });




        return view;
    }

    private void init(View view) {
        amountOfFuel = view.findViewById(R.id.textView6);
        amountOfKilometers = view.findViewById(R.id.textView7);
        spendMoney = view.findViewById(R.id.textView8);
        addFuelButton = view.findViewById(R.id.addFuelButton);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
