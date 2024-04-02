package com.example.breastspectra.View.HomeScreen.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.breastspectra.R
import com.example.breastspectra.View.HomeScreen.Components.CardHeading
import com.example.breastspectra.View.HomeScreen.Components.InputField


@Composable
fun HomeScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(id = R.color.tertiary))
        .padding(10.dp)
    ){
        Spacer(modifier = Modifier.height(30.dp))
        CardHeading(text1 = "Breast Cancer", text2 = "Detection")
        Spacer(modifier = Modifier.height(20.dp))
        LazyColumn(){
            item {
                Spacer(modifier = Modifier.height(20.dp))
                InputField(heading = "Radius mean", 20, FontWeight.SemiBold)

                Spacer(modifier = Modifier.height(20.dp))
                InputField(heading = "Texture mean", 20, FontWeight.SemiBold)

                Spacer(modifier = Modifier.height(20.dp))
                InputField(heading = "Perimeter mean", 20, FontWeight.SemiBold)

                Spacer(modifier = Modifier.height(20.dp))
                InputField(heading = "Area mean", 20, FontWeight.SemiBold)

                Spacer(modifier = Modifier.height(20.dp))
                InputField(heading = "Smoothness mean", 20, FontWeight.SemiBold)

                Spacer(modifier = Modifier.height(20.dp))
                InputField(heading = "Compactness mean ", 20, FontWeight.SemiBold)

                Spacer(modifier = Modifier.height(20.dp))
                InputField(heading = "Concavity Mean ", 20, FontWeight.SemiBold)

                Spacer(modifier = Modifier.height(20.dp))
                InputField(heading = "Concave points Mean ", 20, FontWeight.SemiBold)

                Spacer(modifier = Modifier.height(20.dp))
                InputField(heading = "Concave points Mean ", 20, FontWeight.SemiBold)

                Spacer(modifier = Modifier.height(20.dp))
                InputField(heading = "Symmetry Mean ", 20, FontWeight.SemiBold)

                Spacer(modifier = Modifier.height(20.dp))
                InputField(heading = "Fractal Dimension Mean ", 20, FontWeight.SemiBold)

                Spacer(modifier = Modifier.height(20.dp))
                InputField(heading = "Concave points Mean ", 20, FontWeight.SemiBold)

                Spacer(modifier = Modifier.height(20.dp))
                InputField(heading = "Concave points Mean ", 20, FontWeight.SemiBold)
            }
        }

    }
}


