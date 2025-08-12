package com.example.trainapp.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "stations")
data class Station(
    @PrimaryKey val stationCode: String,
    val stationName: String,
    val latitude: Double,
    val longitude: Double
)
