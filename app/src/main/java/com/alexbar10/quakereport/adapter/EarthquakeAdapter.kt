package com.alexbar10.quakereport.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.annotation.LayoutRes
import com.alexbar10.quakereport.R
import com.alexbar10.quakereport.data.Earthquake

class EarthquakeAdapter(context: Context, @LayoutRes itemResource: Int, data: List<Earthquake>)
    : ArrayAdapter<Earthquake>(context, itemResource, data){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView

        // Check if there's available
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.list_view_item, parent, false)
        }

        // Get the data model for that position
        val earthquake = getItem(position)

        // Assign values to view
        val magView = itemView?.findViewById<TextView>(R.id.mag_text_view)
        magView?.text = earthquake?.mag.toString()

        val locationView = itemView?.findViewById<TextView>(R.id.location_text_view)
        locationView?.text = earthquake?.location

        val dateView = itemView?.findViewById<TextView>(R.id.date_text_view)
        dateView?.text = earthquake?.date

        return itemView!!
    }
}