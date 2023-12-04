package com.example.projetolistatelefonica.ui

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

        binding.buttonLogin.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))

        }
        binding.textSignup.setOnClickListener {
            startActivity(Intent(this, SingUpActivity::class.java))
        }
        binding.textRecoverPassword.setOnClickListener {  }
    }
}