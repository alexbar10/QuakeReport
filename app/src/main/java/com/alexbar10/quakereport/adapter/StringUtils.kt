package com.alexbar10.quakereport.adapter

import android.content.Context
import androidx.core.content.ContextCompat
import com.alexbar10.quakereport.R
import java.sql.Timestamp
import java.text.DecimalFormat
import java.text.SimpleDateFormat
import java.util.*

class StringUtils {
    companion object {
        fun getDateFormatted(timestamp: Double) : Pair<String, String> {
            val date = Date(timestamp.toLong())
            val dateFormatter = SimpleDateFormat("LLL DD, yyyy", Locale.getDefault())
            val timeFormatter = SimpleDateFormat("HH:mm a", Locale.getDefault())

            return Pair(dateFormatter.format(date), timeFormatter.format(date))
        }

        private const val separator = " of "
        fun getLocationMessages(location: String) : Pair<String, String> {
            val cads = location.split(separator)
            return when (cads.size) {
                1 -> {
                    Pair("Near of", cads.first())
                }
                2 -> {
                    Pair(cads.first() + separator, cads[1])
                }
                else -> {
                    Pair("NA","NA")
                }
            }
        }

        fun getMagnitudeFormatted(mag: Double) = DecimalFormat("0.0").format(mag)

        fun getColorForMagnitude(magnitude: Double, context: Context) : Int {
            return when (magnitude) {
                in 0.0..1.0 -> ContextCompat.getColor(context, R.color.magnitude1)
                in 1.0..2.0 -> ContextCompat.getColor(context, R.color.magnitude2)
                in 2.0..3.0 -> ContextCompat.getColor(context, R.color.magnitude3)
                in 3.0..4.0 -> ContextCompat.getColor(context, R.color.magnitude4)
                in 4.0..5.0 -> ContextCompat.getColor(context, R.color.magnitude5)
                in 5.0..6.0 -> ContextCompat.getColor(context, R.color.magnitude6)
                in 6.0..7.0 -> ContextCompat.getColor(context, R.color.magnitude7)
                in 7.0..8.0 -> ContextCompat.getColor(context, R.color.magnitude8)
                in 8.0..9.0 -> ContextCompat.getColor(context, R.color.magnitude9)
                in 9.0..10.0 -> ContextCompat.getColor(context, R.color.magnitude10plus)
                else -> ContextCompat.getColor(context, R.color.magnitude1)
            }
        }
    }
}