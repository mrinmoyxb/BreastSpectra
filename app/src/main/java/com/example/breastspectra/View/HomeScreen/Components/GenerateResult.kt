package com.example.breastspectra.View.HomeScreen.Components

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.breastspectra.R
import com.example.breastspectra.ViewModel.BreastCancerViewModel

@Composable
fun GenerateResult(navController: NavHostController, viewModel: BreastCancerViewModel){
    val context = LocalContext.current
    Card(modifier = Modifier
        .fillMaxWidth(0.75f)
        .height(100.dp)
        .background(Color.Transparent)
        .clickable { viewModel.postResponse()
            Toast.makeText(context, "Done", Toast.LENGTH_SHORT).show()
            navController.navigate("resultScreen")
        },
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(colorResource(id = R.color.secondary))
    ) {
        Box(modifier = Modifier.fillMaxSize().padding(10.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                "Generate Result", fontSize = 29.sp, color = Color.White,
                textAlign = TextAlign.Center, fontWeight = FontWeight.SemiBold
            )
        }
    }
}