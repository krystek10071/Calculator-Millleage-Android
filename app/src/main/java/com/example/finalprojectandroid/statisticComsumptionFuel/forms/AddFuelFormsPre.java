package com.example.finalprojectandroid.statisticComsumptionFuel.forms;

import android.content.Context;
import android.util.Log;

import androidx.room.Room;

import com.example.finalprojectandroid.RoomSQLite.dbHandler.DbAbstract;
import com.example.finalprojectandroid.RoomSQLite.models.RefuellingEntity;

public class AddFuelFormsPre {
    private static final String TAG= "ADD FUEL FORMS";

    public DbAbstract accessToDataBase(Context context){
        return Room.databaseBuilder(context, DbAbstract.class, "myDatabase").
                allowMainThreadQueries().build();
    }

    public RefuellingEntity createObjectEntity(String amountFuel, String amount_kilometers, String amountCostFuel) {
        RefuellingEntity refuellingEntity = new RefuellingEntity();
        refuellingEntity.setAmountFuel(Float.valueOf(amountFuel));
        refuellingEntity.setAmountKilometers(Float.valueOf(amount_kilometers));
        refuellingEntity.setCostFuel(Float.valueOf(amountCostFuel));
        return refuellingEntity;
    }

    public void writeToDatabase(DbAbstract databaseHandle, RefuellingEntity refuellingEntity) {
        databaseHandle.refuellingDAO().insertAll(refuellingEntity);
        Log.i(TAG, "Create Entity in Database");

    }
}
