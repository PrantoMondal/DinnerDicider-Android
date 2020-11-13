package com.prantom.pmondal_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.random
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Chinese", "Hamburger", "Pizza", "McDonalds", "Barros Pizza")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectedFoodText.text = foodList[randomFood]
        }
        addFoodBtn.setOnClickListener {
            val newFood = addFoodTxt.text.toString()
            foodList.add(newFood)
            addFoodTxt.text.clear()
            println(foodList)

        }


    }

}

