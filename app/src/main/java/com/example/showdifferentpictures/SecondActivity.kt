package com.example.showdifferentpictures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.showdifferentpictures.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {



    companion object {
        const val NUMBER_SHAPE = "number_shape"
    }

    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        showPict()
        binding.imageView2.setOnClickListener{
            val rIntent = Intent(this, MainActivity::class.java)
            startActivity(rIntent)
        }
    }
fun showPict() {
    var n = intent.getIntExtra(NUMBER_SHAPE, 0)

         when (n) {
            0 -> binding.imageView2.setImageDrawable(getResources().getDrawable(R.drawable.circle2))
            1 -> binding.imageView2.setImageDrawable(getResources().getDrawable(R.drawable.qsuare2))
            2 -> binding.imageView2.setImageDrawable(getResources().getDrawable(R.drawable.triangle2))
         }


}


}
