package com.example.finalprojectandroid.statisticComsumptionFuel.FrafmentStatisticPre;

import android.content.Context;

import com.example.finalprojectandroid.RoomSQLite.dbHandler.DbAbstract;

public interface IStatisticsGeneralPre {
    DbAbstract createDatabase(Context context);
}
