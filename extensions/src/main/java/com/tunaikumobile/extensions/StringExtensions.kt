package com.tunaikumobile.extensions

import android.os.Build
import android.text.Html
import android.text.Spanned
import org.joda.time.format.DateTimeFormat
import java.text.SimpleDateFormat
import java.util.*


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
fun String.getSpannedText(): Spanned {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
        Html.fromHtml(this, Html.FROM_HTML_MODE_COMPACT)
    } else {
        Html.fromHtml(this)
    }
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
//fun String.convertToDate(pattern: String = "yyyy-MM-dd"): Date {
//    val sdf = SimpleDateFormat(pattern, Locale.getDefault())
//    return sdf.parse(this)!!
//}
