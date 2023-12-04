package com.example.projetolistatelefonica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projetolistatelefonica.databinding.ActivitySingUpBinding

class SingUpActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySingUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySingUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSignup.setOnClickListener {
            //validar o signup
            finish()
        }
    }
}