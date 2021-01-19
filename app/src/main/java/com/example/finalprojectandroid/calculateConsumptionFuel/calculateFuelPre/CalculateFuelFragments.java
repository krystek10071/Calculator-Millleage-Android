package com.example.finalprojectandroid.calculateConsumptionFuel.calculateFuelPre;

public class CalculateFuelFragments {

    public float calculateRequiredAmountFuel(float averageFuelConsumption, float kilometers) {
        float requiredFuel;
        requiredFuel = (averageFuelConsumption * kilometers) /100;
        return  requiredFuel;
    }

    public float calculateCostTravel(float amountRequireFuel, float priceFuel) {
        return amountRequireFuel * priceFuel;
    }

    public float calculateCostPerPerson(float costTravel, float person) {
        return costTravel/person;
    }
}
