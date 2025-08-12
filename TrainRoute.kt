package com.example.trainapp.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "train_routes")
data class TrainRoute(
    @PrimaryKey val id: Int,
    val trainId: String,
    val stationCode: String,
    val sequenceNumber: Int,
    val arrivalTime: String?,
    val departureTime: String?,
    val distance: Double
)
