////package com.example.registration
////
////import android.content.Intent
////import android.os.Bundle
////import android.widget.EditText
////import android.widget.Toast
////import androidx.appcompat.app.AppCompatActivity
////import com.example.registration.databinding.ActivityLoginBinding
////import com.example.registration.viewmodel.MainActivity
////
////class Login : AppCompatActivity() {
////    lateinit var binding: ActivityLoginBinding
////    override fun onCreate(savedInstanceState: Bundle?) {
////        binding= ActivityLoginBinding.inflate(layoutInflater)
////        binding.btnbutton.setOnClickListener {
////            val intent=Intent(this, MainActivity::class.java)
////            startActivity(intent)
////            binding.btnbutton.setOnClickListener{
////                validateLogin()
////                val Intent=Intent(this,HomeActivity::class.java)
////            }
////
////
////
////        }
////
////
////
////
////
////        super.onCreate(savedInstanceState)
////        setContentView(binding.root)
////        onResume()
////
////    }
////    fun validateLogin(){
////        var name=binding.etfirstname.text.toString()
////        var number=binding.etnumber.text.toString()
////        var error =false
////        if (name.isBlank()){
////            binding.etfirstname.error="name required"
////            error=true
////
////        }
////        if (number.isBlank()) {
////            binding.etnumber.error="number required"
////            error = true
////        }
////        if (!error){
////            Toast.makeText(this,"registration successful", Toast.LENGTH_LONG).show()
////        }
////    }
////
////}
////
//////
////
//////
//package com.example.registration
//
//import android.content.Intent
//import android.os.Bundle
//import android.widget.Toast
//import androidx.appcompat.app.AppCompatActivity
//import com.example.registration.databinding.ActivityLoginBinding
//import com.example.registration.viewmodel.MainActivity
//
//class Login : AppCompatActivity() {
//    lateinit var binding: ActivityLoginBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityLoginBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        // Set up the button click listener
//        binding.btnbutton.setOnClickListener {
//            // Move the validation code here
//            validateLogin()
//
//            // Continue with other logic
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }
//    }
//
//    // Rest of your class...
//
//    // Move the validateLogin function outside of onCreate
//    fun validateLogin() {
//        val name = binding.etfirstname.text.toString().trim()
//        val number = binding.etnumber.text.toString().trim()
//
//        if (name.isEmpty()) {
//            binding.etfirstname.error = "Name required"
//        }
//        if (number.isEmpty()) {
//            binding.etnumber.error = "Number required"
//        }
//
//        // If both fields are filled, show a toast message
//        if (name.isNotEmpty() && number.isNotEmpty()) {
//            Toast.makeText(this, "Registration successful", Toast.LENGTH_LONG).show()
//        }
//    }
//}

package com.example.registration

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import com.example.registration.databinding.ActivityLoginBinding
import android.content.Intent
import com.example.registration.viewmodel.MainActivity

class Login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnbutton.setOnClickListener {
            validateLogin()
        }
    }

    fun validateLogin() {
        val name = binding.etfirstname.text.toString().trim()
        val number = binding.etnumber.text.toString().trim()

        if (name.isEmpty()) {
            binding.etfirstname.error = "Name required"
        }
        if (number.isEmpty()) {
            binding.etnumber.error = "Number required"
        }

        if (name.isNotEmpty() && number.isNotEmpty()) {
            Toast.makeText(this, "Registration successful", Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
