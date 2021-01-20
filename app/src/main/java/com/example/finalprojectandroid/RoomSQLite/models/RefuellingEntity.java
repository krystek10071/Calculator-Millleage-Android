package com.example.finalprojectandroid.RoomSQLite.models;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Refuelling")
public class RefuellingEntity {

    @PrimaryKey (autoGenerate = true)
    @ColumnInfo (name = "id")
    private Long id;

    private Float amountKilometers;
    private Float AmountFuel;
    private Float CostFuel;

    public Float getAmountKilometers() {
        return amountKilometers;
    }

    public void setAmountKilometers(Float amountKilometers) {
        this.amountKilometers = amountKilometers;
    }

    public Float getAmountFuel() {
        return AmountFuel;
    }

    public void setAmountFuel(Float amountFuel) {
        AmountFuel = amountFuel;
    }

    public Float getCostFuel() {
        return CostFuel;
    }

    public void setCostFuel(Float costFuel) {
        CostFuel = costFuel;
    }

    @NonNull
    public Long getId() {
        return id;
    }

    public void setId(@NonNull Long id) {
        this.id = id;
    }


}
