package com.example.projetolistatelefonica

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetolistatelefonica.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {  }
        binding.textSignup.setOnClickListener {
            startActivity(Intent(this, SingUpActivity::class.java))
        }
        binding.textRecoverPassword.setOnClickListener {  }
    }
}