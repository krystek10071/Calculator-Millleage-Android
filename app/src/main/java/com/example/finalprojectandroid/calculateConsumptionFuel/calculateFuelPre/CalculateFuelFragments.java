package com.example.finalprojectandroid.calculateConsumptionFuel.calculateFuelPre;

public class CalculateFuelFragments {

    public float calculateRequiredAmountFuel(float averageFuelConsumption, float kilometers) {
        float requiredFuel;
        requiredFuel = (averageFuelConsumption * kilometers) /100;
        return  requiredFuel;
    }
}
