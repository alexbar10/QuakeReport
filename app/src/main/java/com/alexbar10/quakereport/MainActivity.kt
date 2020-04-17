package com.alexbar10.quakereport

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countries: MutableList<String> = ArrayList()
        countries.add("San Francisco")
        countries.add("London")
        countries.add("Tokyo")
        countries.add("Mexico City")
        countries.add("Moscow")
        countries.add("Rio de Janeiro")
        countries.add("Paris")

        list_view.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, countries)
    }
}
