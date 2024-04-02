package com.example.breastspectra.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.breastspectra.Model.RetrofitInstance
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class BreastCancerViewModel: ViewModel() {

    var radius_mean = MutableStateFlow<Float>(0.0f)
    var _radius_mean: StateFlow<Float> = radius_mean

    var texture_mean = MutableStateFlow<Float>(0.0f)
    var _texture_mean: StateFlow<Float> = texture_mean

    var perimeter_mean = MutableStateFlow<Float>(0.0f)
    var _perimeter_mean: StateFlow<Float> = perimeter_mean

    var area_mean = MutableStateFlow<Float>(0.0f)
    var _area_mean: StateFlow<Float> = area_mean

    var smoothness_mean = MutableStateFlow<Float>(0.0f)
    var _smoothness_mean: StateFlow<Float> = smoothness_mean

    var compactness_mean = MutableStateFlow<Float>(0.0f)
    var _compactness_mean: StateFlow<Float> = compactness_mean

    var concavity_mean = MutableStateFlow<Float>(0.0f)
    var _concavity_mean: StateFlow<Float> = concavity_mean

    var concave_pts_mean = MutableStateFlow<Float>(0.0f)
    var _concave_pts_mean: StateFlow<Float> = concave_pts_mean

    var symmetry_mean = MutableStateFlow<Float>(0.0f)
    var _symmetry_mean: StateFlow<Float> = symmetry_mean

    var fractal_dim_mean = MutableStateFlow<Float>(0.0f)
    var _fractal_dim_mean: StateFlow<Float> = fractal_dim_mean

    var radius_se = MutableStateFlow<Float>(0.0f)
    var _radius_se: StateFlow<Float> = radius_se

    var texture_se = MutableStateFlow<Float>(0.0f)
    var _texture_se: StateFlow<Float> = texture_se

    var perimeter_se = MutableStateFlow<Float>(0.0f)
    var _perimeter_se: StateFlow<Float> = perimeter_se

    var area_se = MutableStateFlow<Float>(0.0f)
    var _area_se: StateFlow<Float> = area_se

    var smoothness_se = MutableStateFlow<Float>(0.0f)
    var _smoothness_se: StateFlow<Float> = smoothness_se

    var compactness_se = MutableStateFlow<Float>(0.0f)
    var _compactness_se: StateFlow<Float> = compactness_se

    var concavity_se = MutableStateFlow<Float>(0.0f)
    var _concavity_se: StateFlow<Float> = concavity_se

    var concave_pts_se = MutableStateFlow<Float>(0.0f)
    var _concave_pts_se: StateFlow<Float> = concave_pts_se

    var symmetry_se = MutableStateFlow<Float>(0.0f)
    var _symmetry_se: StateFlow<Float> = symmetry_se

    var fractal_dim_se = MutableStateFlow<Float>(0.0f)
    var _fractal_dim_se: StateFlow<Float> = fractal_dim_se

    var radius_worst = MutableStateFlow<Float>(0.0f)
    var _radius_worst: StateFlow<Float> = radius_worst

    var texture_worst = MutableStateFlow<Float>(0.0f)
    var _texture_worst: StateFlow<Float> = texture_worst

    var perimeter_worst = MutableStateFlow<Float>(0.0f)
    var _perimeter_worst: StateFlow<Float> = perimeter_worst

    var area_worst = MutableStateFlow<Float>(0.0f)
    var _area_worst: StateFlow<Float> = area_worst

    var smoothness_worst = MutableStateFlow<Float>(0.0f)
    var _smoothness_worst: StateFlow<Float> = smoothness_worst

    var compactness_worst = MutableStateFlow<Float>(0.0f)
    var _compactness_worst: StateFlow<Float> = compactness_worst

    var concavity_worst = MutableStateFlow<Float>(0.0f)
    var _concavity_worst: StateFlow<Float> = concavity_worst

    var concave_pts_worst = MutableStateFlow<Float>(0.0f)
    var _concave_pts_worst: StateFlow<Float> = concave_pts_worst

    var symmetry_worst = MutableStateFlow<Float>(0.0f)
    var _symmetry_worst: StateFlow<Float> = symmetry_worst

    var fractal_dim_worst = MutableStateFlow<Float>(0.0f)
    var _fractal_dim_worst: StateFlow<Float> = fractal_dim_worst

    // result
    var responseValue = MutableStateFlow<String>("Generating Result")
    var _responseValue: StateFlow<String> = responseValue

    var serverCode = MutableStateFlow<String>("Waiting for server response")
    var _servercode: StateFlow<String> = serverCode

    fun postResponse() {
        viewModelScope.launch {
            val response = RetrofitInstance.apiInterface
                .predictDisease(radius_mean.value, texture_mean.value, perimeter_mean.value, area_mean.value, smoothness_mean.value,
                    compactness_mean.value, concavity_mean.value, concave_pts_mean.value, symmetry_mean.value, fractal_dim_mean.value,
                    radius_se.value, texture_se.value, perimeter_se.value, area_se.value, smoothness_se.value, compactness_se.value, concavity_se.value,
                    concave_pts_se.value, symmetry_se.value, fractal_dim_se.value, radius_worst.value, texture_worst.value, perimeter_worst.value, area_worst.value,
                    smoothness_se.value, compactness_worst.value, concavity_worst.value, concave_pts_worst.value, symmetry_worst.value, fractal_dim_worst.value)

            if (response.isSuccessful) {
                responseValue.value = response.body()?.targetValue ?: "No data"
                serverCode.value = response.code().toString()
            } else {
                serverCode.value = response.code().toString()
            }
        }
    }

    fun resetButton(){
        responseValue.value = "Generating Result"
        serverCode.value = "Waiting for server response"
    }

}