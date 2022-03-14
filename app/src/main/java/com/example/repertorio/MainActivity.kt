package com.example.repertorio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.repertorio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root

        setContentView(view)

        binding.buttonAddMusic.setOnClickListener {
            addMusic()
        }
        binding.buttonLibrary.setOnClickListener {
            libraryMusic()
        }
        binding.buttonCreateRepertory.setOnClickListener {
            createRepertory()
        }
        binding.buttonHistoric.setOnClickListener {
            historicMusic()
        }


    }

    private fun addMusic(){
        val intent = Intent(this,AddMusic::class.java)
        startActivity(intent)
    }
    private fun libraryMusic(){
        val intent = Intent(this,LibraryMusic::class.java)
        startActivity(intent)
    }
    private fun createRepertory(){
        val intent = Intent(this,CreateRepertory::class.java)
        startActivity(intent)
    }
    private fun historicMusic(){
        val intent = Intent(this,HistoricMusic::class.java)
        startActivity(intent)
    }


}