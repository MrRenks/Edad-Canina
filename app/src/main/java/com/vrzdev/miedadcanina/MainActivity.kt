package com.vrzdev.miedadcanina

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.vrzdev.miedadcanina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener {
            val ageString = binding.ageEdit.text.toString()
            if (ageString.isNotEmpty()) {
                val ageInt = ageString.toInt()
                val result = ageInt * 7
                binding.resultText.text = getString(R.string.result1, result)
            } else {
                Toast.makeText(this, R.string.error_age, Toast.LENGTH_SHORT).show()
            }
        }
    }




}