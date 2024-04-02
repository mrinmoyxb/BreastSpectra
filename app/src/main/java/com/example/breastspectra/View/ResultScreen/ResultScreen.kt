package com.example.breastspectra.View.ResultScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.breastspectra.R

@Composable
fun ResultScreen(/*viewModel: HeartDiseaseViewModel*/){

//    val result by viewModel.responseValue.collectAsState("")
//    val server by viewModel.serverCode.collectAsState("")

    Column(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(id = R.color.white))
        .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        //ResultCard(result = result)
        Spacer(modifier = Modifier.height(10.dp))
        //ServerCard(server = server)
    }
}