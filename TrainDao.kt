package com.example.trainapp.data.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.trainapp.data.entities.Train
import com.example.trainapp.data.entities.TrainRoute
import com.example.trainapp.data.entities.Station

@Dao
interface TrainDao {
    @Query("SELECT * FROM trains WHERE trainId = :trainId")
    suspend fun getTrainById(trainId: String): Train?

    @Query("SELECT * FROM train_routes WHERE trainId = :trainId ORDER BY sequenceNumber")
    suspend fun getTrainRoute(trainId: String): List<TrainRoute>

    @Query("SELECT * FROM stations WHERE stationCode IN (:stationCodes)")
    suspend fun getStationsByCode(stationCodes: List<String>): List<Station>
}
