package com.example.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.registration.databinding.ActivityLoginBinding
import com.example.registration.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)

        setContentView(binding.root)
//
        binding.button.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }


        onResume()
    }




    override fun onResume() {
        super.onResume()
        validate()
    }

    fun validate() {
      var number = binding.etphonenumber.text.toString()
     var user = binding.etusername.text.toString()
       var email = binding.etemail.text.toString()
     var passwor = binding.etpassword.text.toString()

       var error = false

     if (number.isEmpty()) {
         binding.etphonenumber.error="number required"
           error=true
       }
      if (user.isEmpty()) {
          binding.etusername.error="number required"
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
            Toast.makeText(this, "$number,$user,$email,$passwor", Toast.LENGTH_LONG).show()
        }
   }
}
