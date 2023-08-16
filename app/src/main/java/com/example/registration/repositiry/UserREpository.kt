package com.example.registration.repositiry

import com.example.registration.api.ApiInterface
import com.example.registration.api.Apiclient
import com.example.registration.viewmodel.RegisterRequest
import com.example.registration.viewmodel.RegisterResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class UserREpository {
    val apiClient=Apiclient.buildClient(ApiInterface::class.java)
    suspend fun register(registerequest: RegisterRequest) :Response<RegisterResponse>{
        return withContext(Dispatchers.IO){
        apiClient.registerUser(registerequest)
    }
}
}