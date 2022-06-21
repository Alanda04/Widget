package com.example.widget

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.widget.databinding.ActivityMainBinding

//membuat variable binding
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inisialisasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        //memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)

        //Explcit intent memanggil Activity di project yang sama
        binding.btnWidget.setOnClickListener {
            val intent = Intent(this,Widget::class.java)
            startActivity(intent)
        }

        binding.btnIntentExplicit.setOnClickListener{
            val intent = Intent(this,ImplicitIntent::class.java)
            startActivity(intent)
        }

    }

}