package com.example.registration.viewmodel

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.registration.Login
import com.example.registration.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

val userViewModel: UserViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)

        setContentView(binding.root)
//
        binding.button.setOnClickListener {
            validate()
            val intent=Intent(this, Login::class.java)
            startActivity(intent)
        }


        onResume()
    }


    override fun onResume() {
        super.onResume()
        binding.tvLogin.setOnClickListener{
            val  intent=Intent(this,Login::class.java)
            startActivity(intent)

        }
        userViewModel.regLiveData.observe(this, Observer { RegResponse->
            Toast.makeText(this,RegResponse.message,Toast.LENGTH_LONG).show()
            startActivity(Intent(this,Login::class.java))
        })
        userViewModel.errLiveData.observe(this) { err ->
            Toast.makeText(this, err, Toast.LENGTH_LONG).show()
        }

    }

    fun validate() {
      var number = binding.etphonenumber.text.toString()
        var firstname=binding.firstName.text.toString()
        var lastname=binding.etsecondname.text.toString()
        var phoneNumber=binding.etphonenumber.text.toString()
     var user = binding.firstName.text.toString()
       var email = binding.etemail.text.toString()
     var passwor = binding.etpassword.text.toString()
        var confirmpassword=binding.etconfirmpassword.text.toString()

        var error = false

     if (number.isEmpty()) {
         binding.etphonenumber.error="number required"
           error=true
       }
      if (user.isEmpty()) {
          binding.firstName.error="number required"
          error=true

      }
        if (email.isEmpty()) {
            binding.etemail.error="number required"
            error=true


        }
      if (passwor.isEmpty()) {
            binding.etpassword.error="number required"
          error=true
        }
        if (!error) {
           val registerequest=RegisterRequest(
               firstName = firstname,
               lastName = lastname,
               phoNumber = phoneNumber,
               email =  email,
               password = passwor

           )
            userViewModel.registerUser(registerequest)
        }
   }
}


