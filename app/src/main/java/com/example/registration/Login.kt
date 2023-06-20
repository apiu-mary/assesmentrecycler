package com.example.registration

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.registration.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityLoginBinding.inflate(layoutInflater)


        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}