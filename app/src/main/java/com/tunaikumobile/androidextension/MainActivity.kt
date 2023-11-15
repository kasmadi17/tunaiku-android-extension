package com.tunaikumobile.androidextension

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tunaikumobile.androidextension.databinding.ActivityMainBinding
import com.tunaikumobile.extensions.convertToString
import com.tunaikumobile.extensions.isWeekend
import com.tunaikumobile.extensions.plusOrMinusYears
import java.util.Date

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        val date = Date(System.currentTimeMillis())
        binding.tvToday.text = date.convertToString()
        binding.tvDateFormat.text = date.convertToString("dd/MMMM/yyyy")
        binding.tvPlusYear.text = date.plusOrMinusYears(1)
        binding.tvWeekend.text = "Is today a holiday? ${date.isWeekend()}"
        setContentView(view)
    }
}