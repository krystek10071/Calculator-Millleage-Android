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

    private String TypeFuel;
    private Float AmountFuel;
    private Float ValueFueal;

    @NonNull
    public Long getId() {
        return id;
    }

    public void setId(@NonNull Long id) {
        this.id = id;
    }

    public String getTypeFuel() {
        return TypeFuel;
    }

    public void setTypeFuel(String typeFuel) {
        TypeFuel = typeFuel;
    }

    public Float getAmountFuel() {
        return AmountFuel;
    }

    public void setAmountFuel(Float amountFuel) {
        AmountFuel = amountFuel;
    }

    public Float getValueFueal() {
        return ValueFueal;
    }

    public void setValueFueal(Float valueFueal) {
        ValueFueal = valueFueal;
    }
}
