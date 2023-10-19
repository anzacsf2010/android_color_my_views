package com.training.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {

        val clickableViews: List<View> = listOf(findViewById(R.id.box_one_text),
            findViewById(R.id.box_two_text),
            findViewById(R.id.box_three_text),
            findViewById(R.id.box_four_text),
            findViewById(R.id.box_five_text),
            findViewById(R.id.constraint_layout),
            findViewById(R.id.red_button),
            findViewById(R.id.yellow_button),
            findViewById(R.id.green_button)
        )

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_blue_light)

            R.id.red_button -> findViewById<View>(R.id.box_three_text).setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> findViewById<View>(R.id.box_four_text).setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> findViewById<View>(R.id.box_five_text).setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}