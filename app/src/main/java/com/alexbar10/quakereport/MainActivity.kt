package com.alexbar10.quakereport

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.alexbar10.quakereport.adapter.EarthquakeAdapter
import com.alexbar10.quakereport.data.Earthquake
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countries: MutableList<Earthquake> = ArrayList()
        countries.add(Earthquake(7.2f, "San Francisco", "Feb 2, 2016"))
        countries.add(Earthquake(7.2f, "London", "Feb 2, 2016") )
        countries.add(Earthquake(7.2f, "Tokyo", "Feb 2, 2016"))
        countries.add(Earthquake(7.2f, "Mexico City", "Feb 2, 2016"))
        countries.add(Earthquake(7.2f, "Moscow", "Feb 2, 2016"))
        countries.add(Earthquake(7.2f, "Rio de Janeiro", "Feb 2, 2016"))
        countries.add(Earthquake(7.2f, "Paris", "Feb 2, 2016"))

        list_view.adapter = EarthquakeAdapter(this, R.layout.list_view_item, countries)
    }
}
