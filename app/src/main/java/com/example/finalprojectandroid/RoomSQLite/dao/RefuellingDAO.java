package com.example.finalprojectandroid.RoomSQLite.dao;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.finalprojectandroid.RoomSQLite.models.RefuellingEntity;

import java.util.List;

@Dao
public interface RefuellingDAO {

    @Query("SELECT * FROM Refuelling")
    List<RefuellingEntity> getAll();

    @Insert
    void insertAll(RefuellingEntity ... refuellingEntity);

    @Delete
    void delete(RefuellingEntity refuellingEntity);

}
