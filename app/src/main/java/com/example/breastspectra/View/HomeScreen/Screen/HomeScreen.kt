package com.example.breastspectra.View.HomeScreen.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.breastspectra.R
import com.example.breastspectra.View.HomeScreen.Components.CardHeading

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun HomeScreen(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(id = R.color.tertiary))
        .padding(10.dp)
    ){
        var radius_mean by remember { mutableStateOf("") }
        var texture_mean by remember { mutableStateOf("") }
        var perimeter_mean by remember { mutableStateOf("") }
        var area_mean by remember { mutableStateOf("") }
        var smoothness_mean by remember { mutableStateOf("") }
        var compactness_mean by remember { mutableStateOf("") }
        var concavity_mean by remember { mutableStateOf("") }
        var concave_pts_mean by remember { mutableStateOf("") }
        var symmetry_mean by remember { mutableStateOf("") }
        var fractal_dim_mean by remember { mutableStateOf("") }
        var radius_se by remember { mutableStateOf("") }
        var texture_se by remember { mutableStateOf("") }
        var perimeter_se by remember { mutableStateOf("") }
        var area_se by remember { mutableStateOf("") }
        var smoothness_se by remember { mutableStateOf("") }
        var compactness_se by remember { mutableStateOf("") }
        var concavity_se by remember { mutableStateOf("") }
        var concave_pts_se by remember { mutableStateOf("") }
        var symmetry_se by remember { mutableStateOf("") }
        var fractal_dim_se by remember { mutableStateOf("") }
        var radius_worst by remember { mutableStateOf("") }
        var texture_worst by remember { mutableStateOf("") }
        var perimeter_worst by remember { mutableStateOf("") }
        var area_worst by remember { mutableStateOf("") }
        var smoothness_worst by remember { mutableStateOf("") }
        var compactness_worst by remember { mutableStateOf("") }
        var concavity_worst by remember { mutableStateOf("") }
        var concave_pts_worst by remember { mutableStateOf("") }
        var symmetry_worst by remember { mutableStateOf("") }
        var fractal_dim_worst by remember { mutableStateOf("") }


        Spacer(modifier = Modifier.height(30.dp))
        CardHeading(text1 = "Breast Cancer", text2 = "Detection")
        Spacer(modifier = Modifier.height(20.dp))
        LazyColumn(){
            item {

                // 1. Radius Mean
                Text("Radius Mean", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = radius_mean, onValueChange = { radius_mean = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 2. Radius Mean
                Text("Texture Mean", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = texture_mean, onValueChange = {texture_mean = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 3. Perimeter Mean
                Text("Perimeter Mean", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = perimeter_mean, onValueChange = {perimeter_mean = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 4 Area Mean
                Text("Area Mean", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = area_mean, onValueChange = {area_mean = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 5. Smoothness Mean
                Text("Smoothness Mean", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = smoothness_mean, onValueChange = {smoothness_mean = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 6. Compactness Mean
                Text("Compactness Mean", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = compactness_mean, onValueChange = {compactness_mean = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 7. Concavity Mean:
                Text("Concavity Mean", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = concavity_mean, onValueChange = {concavity_mean = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 8. Concave Portions:
                Text("Concave Portions", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = concave_pts_mean, onValueChange = {concave_pts_mean = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 9. Symmetry Mean:
                Text("Symmetry mean", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = symmetry_mean, onValueChange = {symmetry_mean = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 10. Fractal Dimensions Mean:
                Text("Fractal Dimension", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = fractal_dim_mean, onValueChange = {fractal_dim_mean = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 11. standard error of the mean radius(Radius SE):
                Text("Radius SE", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = radius_se, onValueChange = {radius_se = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 12. Texture SE:
                Text("Texture SE", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = texture_se, onValueChange = {texture_se = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 13. Perimeter SE:
                Text("Perimeter SE", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = perimeter_se, onValueChange = {perimeter_se = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 14. Area SE:
                Text("Area SE", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = area_se, onValueChange = {area_se = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 15. Smoothness SE:
                Text("Smoothness SE", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = smoothness_se, onValueChange = {smoothness_se = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 16. Compactness SE:
                Text("Compactness SE", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = compactness_se, onValueChange = {compactness_se = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 17. Concavity SE:
                Text("Concavity SE", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = concavity_se, onValueChange = {concavity_se = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 18. Concave Portions SE:
                Text("Concave Portions SE", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = concave_pts_se, onValueChange = {concave_pts_se = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 19. Symmetry SE:
                Text("Symmetry SE", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = symmetry_se, onValueChange = {symmetry_se = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 20. Fractal Dimensions SE:
                Text("Fractal Dimensions SE", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = fractal_dim_se, onValueChange = {fractal_dim_se = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 21. Radius Worst:
                Text("Radius Worst", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = radius_worst, onValueChange = {radius_worst = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 22. Texture Worst:
                Text("Texture Worst", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = texture_worst, onValueChange = {texture_worst = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 23. Perimeter Worst:
                Text(" Perimeter Worst", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = perimeter_worst, onValueChange = {perimeter_worst = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 24. Area Worst:
                Text("Area Worst", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = area_worst, onValueChange = {area_worst = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 25. Smoothness Worst:
                Text(" Smoothness Worst", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = smoothness_worst, onValueChange = {smoothness_worst = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 26. Compactness Worst:
                Text("Compactness Worst", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = compactness_worst, onValueChange = {compactness_worst = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 27. Concavity Worst:
                Text("Concave Portions", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = concavity_worst, onValueChange = {concavity_worst = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 28. Concave Portions Worst:
                Text("Concave Portions Worst", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = concave_pts_worst, onValueChange = {concave_pts_worst = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 29. Symmetry Worst:
                Text("Symmetry Worst", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = symmetry_worst, onValueChange = {symmetry_worst = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))

                // 30. Fractal Dimensions Worst:
                Text("Fractal Dimensions Worst", fontSize = 20.sp, color = Color.Black,
                    fontWeight = FontWeight.SemiBold)
                TextField(value = fractal_dim_worst, onValueChange = {fractal_dim_worst = it }, shape = RoundedCornerShape(20.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.White,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    ),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Number
                    ),
                    modifier = Modifier.fillMaxWidth().border(2.dp, Color(0xFFED5AB3), shape =  RoundedCornerShape(20.dp))
                )
                Spacer(modifier = Modifier.height(20.dp))
            }
        }

    }
}


