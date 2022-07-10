package com.example.showdifferentpictures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.showdifferentpictures.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    var n = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener{ changePict()  }
        binding.imageView.setOnClickListener{ changePictLong()  }


    }
    fun changePict() {
        n = Random.nextInt(3)
        when (n) {
           0 -> binding.imageView.setImageDrawable(getResources().getDrawable(R.drawable.circle1))
           1 -> binding.imageView.setImageDrawable(getResources().getDrawable(R.drawable.qsuare1))
           2 -> binding.imageView.setImageDrawable(getResources().getDrawable(R.drawable.triangle1))
           3 -> {}
        }
    }
    fun changePictLong() {
        if (n!=3){
        val randomIntent = Intent(this, SecondActivity::class.java)
        randomIntent.putExtra(SecondActivity.NUMBER_SHAPE, n)
        startActivity(randomIntent)}

    }

}