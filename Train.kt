package com.example.trainapp.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "trains")
data class Train(
    @PrimaryKey val trainId: String,
    val trainName: String,
    val fromStation: String,
    val toStation: String,
    val departureTime: String,
    val arrivalTime: String
)
