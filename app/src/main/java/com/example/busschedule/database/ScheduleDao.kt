package com.example.busschedule.database

import androidx.room.Dao
import androidx.room.Query

@Dao
interface ScheduleDao {
    @Query("SELECT * FROM schedule WHERE stop_name = :stopName ORDER BY arrival_time ASC")
    fun getByStopName(stopName: String): List<Schedule>
}