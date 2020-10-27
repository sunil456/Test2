package com.sunil.test2application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    val bundle: Bundle? = intent.extras
    var firstValue: Long = 0
    var secondValue: Long = 0
    var result: Long = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        firstValue = intent?.getLongExtra("FIRST_VALUE", 0)!!
//        secondValue = intent?.getLongExtra("SECOND_VALUE", 0)!!

        intent.getLongExtra("FIRST_VALUE", 0)?.let {
            firstValue = it
        }
        intent.getLongExtra("SECOND_VALUE", 0)?.let {
            secondValue = it
        }

        result = multiPlyValue(firstValue, secondValue)
        multiplication_result.text = result.toString()

    }

    fun multiPlyValue(firstValue: Long, secondValue: Long): Long{
        return firstValue*secondValue
    }

}