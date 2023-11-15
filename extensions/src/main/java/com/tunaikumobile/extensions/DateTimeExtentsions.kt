package com.tunaikumobile.extensions

import android.os.Build
import org.joda.time.DateTime
import java.util.Locale

/**
 * @author Kasmadi
 * @date 14/11/23
 */

/**
 * @return A [String] representing the short month text (e.g., "Nov").
 */
fun DateTime.getShortMonth(): String {
    return monthOfYear().getAsShortText(Locale.getDefault())
}

/**
 * @return A [String] representing the day of the week text (e.g., "Sabtu" for the "ID" locale).
 */
fun DateTime.getDayAsText(): String {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        dayOfWeek().getAsText(Locale.forLanguageTag(Locale.forLanguageTag("ID").toLanguageTag()))
    } else {
        dayOfWeek.dayOfWeekIDVersion()
    }
}

/**
 * Checks if the current [DateTime] object represents a weekend day in the specified locale.
 *
 * @return `true` if the day is a weekend day (Saturday or Sunday), `false` otherwise.
 */
fun DateTime.isWeekend(): Boolean {
    return dayOfWeek == 6 || dayOfWeek == 7
}