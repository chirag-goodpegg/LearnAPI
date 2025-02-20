package com.example.learnnavigation

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
//    val api: Any
    private const val BASE_URL = "https://hub.dummyapis.com/"

    private fun getInstance(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val employeeAPI: InformationAPI = getInstance().create(InformationAPI::class.java)
}