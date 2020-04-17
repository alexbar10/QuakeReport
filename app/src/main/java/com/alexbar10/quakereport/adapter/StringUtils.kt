package com.alexbar10.quakereport.adapter

import java.sql.Timestamp
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
    }
}