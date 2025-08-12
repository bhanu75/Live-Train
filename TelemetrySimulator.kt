package com.example.trainapp.utils

import com.google.android.gms.maps.model.LatLng
import kotlinx.coroutines.*
import com.example.trainapp.network.apiService

class TelemetrySimulator {
    private val route = listOf(
        LatLng(28.6139, 77.2090), // Delhi
        LatLng(28.4595, 77.0266), // Gurgaon
        LatLng(27.1767, 78.0081)  // Agra
    )

    fun startSimulation(trainId: String) {
        GlobalScope.launch {
            while (isActive) {
                val position = generateNextPosition()
                apiService.updateTrainPosition(trainId, position)
                delay(5000) // Update every 5 seconds
            }
        }
    }

    private fun generateNextPosition(): LatLng {
        return route.random()
    }
}
