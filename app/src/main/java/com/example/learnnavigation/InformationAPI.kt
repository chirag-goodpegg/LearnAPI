package com.example.learnnavigation

import retrofit2.Response
import retrofit2.http.GET

interface InformationAPI {
    @GET("employee")
    suspend fun getEmployeeInformation(): Response<List<EmployeeModel>>
}