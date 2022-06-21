package com.example.widget

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.core.app.ActivityCompat
import com.example.widget.databinding.ActivityImplicitIntentBinding

//Membuat variable binding
private lateinit var binding: ActivityImplicitIntentBinding

class ImplicitIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inisialisasi binding
        binding = ActivityImplicitIntentBinding.inflate(layoutInflater)
        //memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)



        binding.btnCamera.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        binding.btnFile.setOnClickListener{
            val intent = Intent()
            intent.type = "*/*"
            intent.action = Intent.ACTION_GET_CONTENT
            startActivityForResult(Intent.createChooser(intent,"pilih file"),0)
        }

        binding.btnBrowser.setOnClickListener{
            val url = "https://google.com"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(url))
            startActivity(intent)
        }
    }
}