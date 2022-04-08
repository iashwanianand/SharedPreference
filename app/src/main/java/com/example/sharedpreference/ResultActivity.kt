package com.example.sharedpreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpreference.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val name = binding.tvName
//        val email = binding.tvEmail

        val sharedPreferences = getSharedPreferences("myKey", MODE_PRIVATE)
//        val fullName = sharedPreferences.getString("name", "")
//        val mail = sharedPreferences.getString("email", "")
//        name.text = fullName
//        email.text = mail

        binding.tvName.text = sharedPreferences.getString("name", "")
        binding.tvEmail.text = sharedPreferences.getString("email", "")
    }
}