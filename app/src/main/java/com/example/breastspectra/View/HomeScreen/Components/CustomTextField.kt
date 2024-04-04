package com.example.breastspectra.View.HomeScreen.Components

import android.annotation.SuppressLint
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.breastspectra.R
import com.example.breastspectra.ViewModel.BreastCancerViewModel

//@SuppressLint("StateFlowValueCalledInComposition")
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun CustomTextFieldAge(placeholder: String, viewModel: BreastCancerViewModel){
//    var textFieldValue by remember{ mutableStateOf("0") }
//
//    val intValue = textFieldValue.toIntOrNull()?:0
//    //viewModel.age.value = intValue
//
//    TextField(value = textFieldValue, onValueChange = {textFieldValue=it},
//        colors = TextFieldDefaults.textFieldColors(
//            containerColor = Color.White,
//            focusedIndicatorColor = Color.Transparent,
//            unfocusedIndicatorColor = Color.Transparent
//        ),
//        textStyle = TextStyle(
//            fontSize = 18.sp,
//            fontWeight = FontWeight.Medium,
//            color = Color.Black
//        ),
//        singleLine = true,
//        maxLines = 1,
//        placeholder = { Text(placeholder, fontSize = 15.sp) },
//        shape = RoundedCornerShape(10.dp),
//        modifier = Modifier
//            .border(
//                width = 2.dp, color = if (textFieldValue == "0") Color.Black else colorResource(
//                    id = R.color.pink
//                ),
//                shape = RoundedCornerShape(10.dp)
//            )
//            .fillMaxWidth()
//            .shadow(10.dp, shape = RoundedCornerShape(10.dp))
//    )
//
//}