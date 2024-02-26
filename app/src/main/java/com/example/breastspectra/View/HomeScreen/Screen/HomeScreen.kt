package com.example.breastspectra.View.HomeScreen.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.breastspectra.R
import com.example.breastspectra.View.HomeScreen.Components.HeadingCard

@Preview(showBackground = true)
@Composable
fun HomeScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(id = R.color.tertiary))
        .padding(10.dp)
    ){
        Spacer(modifier = Modifier.height(30.dp))
        HeadingCard("Breast Cancer", "Detection")
    }
}