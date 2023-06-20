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
        binding.button.setOnClickListener {
            val intent = Intent(this, ActivityLoginBinding::class.java)
            startActivity(intent)
        }
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
           print("number required")
       }
      if (user.isEmpty()) {
            print("number required")
      }
        if (email.isEmpty()) {
           print("number required")
        }
      if (passwor.isEmpty()) {
            print("number required")
        }
        if (!error) {
            Toast.makeText(this, "$number,$user,$email,$passwor", Toast.LENGTH_LONG).show()
        }
   }
}
