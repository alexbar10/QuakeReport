package com.alexbar10.quakereport.adapter

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
    }
}