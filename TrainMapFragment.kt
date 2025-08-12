package com.example.trainapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Marker
import com.example.trainapp.viewmodel.TrainPositionViewModel

class TrainMapFragment : Fragment() {
    private lateinit var googleMap: GoogleMap
    private var trainMarker: Marker? = null
    private val trainPositionViewModel: TrainPositionViewModel by viewModels()

    override fun onMapReady(map: GoogleMap) {
        googleMap = map
        observeTrainPosition()
        setupRoute()
    }

    private fun observeTrainPosition() {
        trainPositionViewModel.trainPosition.observe(viewLifecycleOwner) { position ->
            updateTrainMarker(position)
        }
    }
}
