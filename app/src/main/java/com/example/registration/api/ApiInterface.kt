package com.example.registration.api


import com.example.registration.viewmodel.RegisterResponse
import com.example.registration.viewmodel.RegisterRequest
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {
    @POST("/users/login")
    suspend fun registerUser(@Body registerRequest: RegisterRequest):
            Response<RegisterResponse>
}