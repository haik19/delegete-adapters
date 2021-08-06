package com.example.delegateadapters

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_layout)
        var count = 1
        findViewById<Button>(R.id.simple_button).setOnClickListener {
            if (!isNight()) {
                findViewById<TextView>(R.id.simple_text).text =
                    getString(R.string.text_for_hasmik_day)
                return@setOnClickListener
            }
            count++
            if (count == 5) {
                findViewById<TextView>(R.id.simple_text).text = getString(R.string.text_for_hasmik)
                findViewById<Button>(R.id.simple_button).text = "Սեղմիր ինձ"
                count = 1
            } else {
                findViewById<TextView>(R.id.simple_text).text =
                    getString(R.string.text_for_hasmik_again)
            }
        }
    }

    fun isNight(): Boolean {
        val cal: Calendar = Calendar.getInstance()
        val hour: Int = cal.get(Calendar.HOUR_OF_DAY)
        return hour < 6 || hour > 18
    }
}