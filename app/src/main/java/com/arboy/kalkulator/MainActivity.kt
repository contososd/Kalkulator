package com.arboy.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.arboy.kalkulator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.Expression

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var lastNumeric = false
    var stateError = false
    var lastDot = false

    private lateinit var expression: Expression

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onAllclearClick(view: View) {}


    fun onEqualClick(view: View) {}


    fun onDigitClick(view: View) {}


    fun onOperatorClick(view: View) {}


    fun onBackClick(view: View) {}

    fun onClearClick(view: View) {}
}