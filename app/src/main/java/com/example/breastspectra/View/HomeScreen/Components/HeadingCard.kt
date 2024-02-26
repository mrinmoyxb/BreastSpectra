package com.example.breastspectra.View.HomeScreen.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.breastspectra.R

@Composable
fun HeadingCard(text1: String, text2: String){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(Color.Transparent)
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(colorResource(id = R.color.secondary), RoundedCornerShape(20.dp))
                .padding(12.dp)
        ){
            Row(){
            Column(
                modifier = Modifier.fillMaxWidth(0.6f),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start
            ) {
                Text(text1, fontSize = 30.sp, color = Color.White, fontWeight = FontWeight.Bold)
                Text(text2, fontSize = 30.sp, color = Color.White, fontWeight = FontWeight.Medium, modifier = Modifier.offset(y=-10.dp))
                Text("This is a machine learning model with 95% accuracy, consult your doctor",
                    fontSize = 11.sp, color = Color.White, modifier = Modifier.offset(y=-8.dp))
            }
                Column(){
                    Image(painter = painterResource(id = R.drawable.breast_icon), contentDescription = "breast logo",
                        modifier = Modifier.size(1200.dp))
                }
            }
        }
    }
}
