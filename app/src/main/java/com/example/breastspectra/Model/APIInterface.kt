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
        @Field("radius_mean") radius_mean: Any,
        @Field("texture_mean") texture_mean: Any,
        @Field("perimeter_mean") perimeter_mean: Any,
        @Field("area_mean") area_mean: Any,
        @Field("smoothness_mean") smoothness_mean: Any,
        @Field("compactness_mean") compactness_mean: Any,
        @Field("concavity_mean") concavity_mean: Any,
        @Field("concave_pts_mean") concave_pts_mean: Any,
        @Field("symmetry_mean") symmetry_mean: Any,
        @Field("fractal_dim_mean") fractal_dim_mean: Any,
        @Field("radius_se") radius_se: Any,
        @Field("texture_se") texture_se: Any,
        @Field("perimeter_se") perimeter_se: Any,
        @Field("area_se") area_se: Any,
        @Field("smoothness_se") smoothness_se: Any,
        @Field("compactness_se") compactness_se: Any,
        @Field("concavity_se") concavity_se: Any,
        @Field("concave_pts_se") concave_pts_se: Any,
        @Field("symmetry_se") symmetry_se: Any,
        @Field("fractal_dim_se") fractal_dim_se: Any,
        @Field("radius_worst") radius_worst: Any,
        @Field("texture_worst") texture_worst: Any,
        @Field("perimeter_worst") perimeter_worst: Any,
        @Field("area_worst") area_worst: Any,
        @Field("smoothness_worst") smoothness_worst: Any,
        @Field("compactness_worst") compactness_worst: Any,
        @Field("concavity_worst") concavity_worst: Any,
        @Field("concave_pts_worst") concave_pts_worst: Any,
        @Field("symmetry_worst") symmetry_worst:Any,
        @Field("fractal_dim_worst") fractal_dim_worst: Any,
    ): Response<ResponseDataClass>

}

data class ResponseDataClass(
    @SerializedName("target value")
    val targetValue: String
)