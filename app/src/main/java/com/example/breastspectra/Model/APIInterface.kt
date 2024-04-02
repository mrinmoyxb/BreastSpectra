package com.example.breastspectra.Model

import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface APIInterface {
    @FormUrlEncoded
    @POST("predict")
    suspend fun predictDisease(
        @Field("radius_mean") radius_mean: Float,
        @Field("texture_mean") texture_mean: Float,
        @Field("perimeter_mean") perimeter_mean: Float,
        @Field("area_mean") area_mean: Float,
        @Field("smoothness_mean") smoothness_mean: Float,
        @Field("compactness_mean") compactness_mean: Float,
        @Field("concavity_mean") concavity_mean: Float,
        @Field("concave_pts_mean") concave_pts_mean: Float,
        @Field("symmetry_mean") symmetry_mean: Float,
        @Field("fractal_dim_mean") fractal_dim_mean: Float,
        @Field("radius_se") radius_se: Float,
        @Field("texture_se") texture_se: Float,
        @Field("perimeter_se") perimeter_se: Float,
        @Field("area_se") area_se: Float,
        @Field("smoothness_se") smoothness_se: Float,
        @Field("compactness_se") compactness_se: Float,
        @Field("concavity_se") concavity_se: Float,
        @Field("concave_pts_se") concave_pts_se: Float,
        @Field("symmetry_se") symmetry_se: Float,
        @Field("fractal_dim_se") fractal_dim_se: Float,
        @Field("radius_worst") radius_worst: Float,
        @Field("texture_worst") texture_worst: Float,
        @Field("perimeter_worst") perimeter_worst: Float,
        @Field("area_worst") area_worst: Float,
        @Field("smoothness_worst") smoothness_worst: Float,
        @Field("compactness_worst") compactness_worst: Float,
        @Field("concavity_worst") concavity_worst: Float,
        @Field("concave_pts_worst") concave_pts_worst: Float,
        @Field("symmetry_worst") symmetry_worst:Float,
        @Field("fractal_dim_worst") fractal_dim_worst: Float,




    ): Response<ResponseDataClass>

}

data class ResponseDataClass(
    @SerializedName("target value")
    val targetValue: String
)