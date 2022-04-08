package com.example.sharedpreference

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sharedpreference.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSave.setOnClickListener {

//            val name = binding.etName.text.toString()
//            val email = binding.etEmail.text.toString()

            val sharedPreferences = getSharedPreferences("myKey", MODE_PRIVATE)
            val editor = sharedPreferences.edit()
            editor.putString("name", binding.etName.text.toString()).apply()
            editor.putString("email", binding.etEmail.text.toString()).apply()
//            editor.apply()
            startActivity(Intent(this, ResultActivity::class.java))
        }
    }
}