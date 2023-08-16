package com.example.registration.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import com.example.registration.repositiry.UserREpository
import kotlinx.coroutines.launch

class UserViewModel :ViewModel() {
    val userReop=UserREpository()
    val regLiveData=MutableLiveData<RegisterResponse>()
    var errLiveData=MutableLiveData<String>()

    fun registerUser(registerequest: RegisterRequest) {
        viewModelScope.launch {
            val response=userReop.register(registerequest)
            if (response.isSuccessful) {
                regLiveData.postValue(response.body())
            } else {
                errLiveData.postValue(response.errorBody()?.string())
            }
        }
    }
}