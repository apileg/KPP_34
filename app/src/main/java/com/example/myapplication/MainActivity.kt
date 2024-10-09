package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Зміна кольору тексту після натискання
        binding.textView1.setOnClickListener {
            binding.textView1.setTextColor(Color.CYAN)
        }

        binding.textView2.setOnClickListener {
            binding.textView2.setTextColor(Color.BLUE)
        }

        binding.textView3.setOnClickListener {
            binding.textView3.setTextColor(Color.LTGRAY)
        }

        // Обробка кнопки "Приховати"
        binding.buttonHide.setOnClickListener {
            binding.textView1.visibility = View.GONE
        }

        // Обробка кнопки "Показати"
        binding.buttonShow.setOnClickListener {
            binding.textView1.visibility = View.VISIBLE
        }
    }
}
