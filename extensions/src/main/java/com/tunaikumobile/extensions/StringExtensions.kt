package com.tunaikumobile.extensions

import android.text.Spanned
import androidx.core.text.HtmlCompat
import org.joda.time.DateTimeZone
import org.joda.time.format.DateTimeFormat
import java.util.Date


/**
 *
 * Created by Suyanwar on 2020-02-26.
 * Android Engineer
 *
 **/

private val classMap = mutableMapOf<String, Class<*>>()
fun <T> String.loadClassOrNull(): Class<out T>? =
    classMap.getOrPut(this) {
        try {
            Class.forName(this)
        } catch (e: ClassNotFoundException) {
            return null
        }
    }.castOrNull()

/**
 * Reformat phone number
 */
fun String.reformatPhoneNumber(): String {
    return when {
        this.startsWith("+62") -> this.substring(3)
        this.startsWith("08") -> this.substring(1)
        else -> this
    }
}

/**
 * Render HTML string
 */
fun String.convertIntoSpanned(): Spanned {
    return HtmlCompat.fromHtml(this, HtmlCompat.FROM_HTML_MODE_COMPACT)
}

/**
 * Convert string date to millis
 */
fun String.convertToMillis(pattern: String = "dd MMM yyyy"): Long {
    val dateTime = DateTimeFormat.forPattern(pattern)
    val dateTimeParse = dateTime.parseDateTime(this)
    return dateTimeParse.millis
}

/**
 * Validate that string only contain numbers
 */
fun String.containsOnlyNumber(): Boolean {
    return this.contains("\\d".toRegex())
}

/**
 * Remove all spaces in a string
 */
fun String.removeSpaces(): String {
    return this.replace("\\s".toRegex(), "")
}

/**
 * Change string into date
 */
fun String.convertToDate(pattern: String = "yyyy-MM-dd", timeZone: String = "Asia/Jakarta") : Date {
    val zone = DateTimeZone.forID(timeZone)
    return DateTimeFormat.forPattern(pattern).parseDateTime(this).withZone(zone).toDate()
}
