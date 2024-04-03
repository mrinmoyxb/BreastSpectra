package com.example.breastspectra.View.HomeScreen.Components

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.breastspectra.R
import com.example.breastspectra.ViewModel.BreastCancerViewModel

@Composable
fun ResetButton(viewModel: BreastCancerViewModel){
    val context = LocalContext.current
    Card(modifier = Modifier
        .height(100.dp)
        .width(100.dp)
        .background(Color.Transparent)
        .clickable { viewModel.resetButton()
            Toast.makeText(context, "All values set to default", Toast.LENGTH_SHORT).show()},
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(colorResource(id = R.color.pink))
    ){
        Box(modifier = Modifier.fillMaxSize()){
            Icon(imageVector = Icons.Filled.Refresh, contentDescription = "Reset Button",
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp),
                tint = Color.White
            )
        }
    }
}