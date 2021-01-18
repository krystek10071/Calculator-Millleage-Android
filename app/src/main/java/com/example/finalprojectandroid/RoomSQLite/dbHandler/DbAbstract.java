package com.example.finalprojectandroid.RoomSQLite.dbHandler;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.finalprojectandroid.RoomSQLite.dao.RefuellingDAO;
import com.example.finalprojectandroid.RoomSQLite.models.RefuellingEntity;

@Database(entities = {RefuellingEntity.class}, version = 1, exportSchema = false)
public abstract class DbAbstract extends RoomDatabase {
    public abstract RefuellingDAO refuellingDAO();
}
