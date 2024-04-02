package com.example.breastspectra.Model

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val client = OkHttpClient.Builder().build()
    private const val BASE_URL = "https://breastcancerdetection-419106.el.r.appspot.com/"
    val gson = GsonBuilder().create()

    private val retrofit by lazy{
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
    }
    val apiInterface by lazy{
        retrofit.create(APIInterface::class.java)
    }
}