package com.example.registration

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isEmpty
import com.example.registration.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityLoginBinding.inflate(layoutInflater)
        binding.btnbutton.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
            binding.btnprevious.setOnClickListener {
                val intent=Intent(this,MainActivity::class.java)
            }
        }





        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        onResume()
        validateLogin()
    }
    fun validateLogin(){
        var name:EditText=binding.etfirstname
        var number:EditText=binding.etnumber
        var error =false
        if (name.text.isEmpty()){
            binding.etfirstname.error="name required"
            error=true

        }
        if (number.text.isEmpty()) {
            binding.etnumber.error="number required"
            error = true
        }
    }

}
