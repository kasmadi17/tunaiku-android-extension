package com.tunaikumobile.extensions

import android.text.Spanned
import androidx.core.text.HtmlCompat
import com.tunaikumobile.extensions.Constant.NUMERIC_VALIDATION
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
    var phoneNumber = when {
        this.startsWith("0") -> this.replaceFirst("^0+(?!$)".toRegex(), "+62")
        this.startsWith("+62") -> this
        this.startsWith("62") -> "+$this"
        else -> "+62$this"
    }
    if (phoneNumber.contains("-")) phoneNumber = phoneNumber.trim().replace("-", "")
    if (phoneNumber.contains(" ")) phoneNumber =
        phoneNumber.trim().replace("\\s+".toRegex(), "").replace(" +", " ")
    return phoneNumber
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
fun String.convertToMillis(pattern: String = "dd MMM yyyy", timeZone: String = "Asia/Jakarta"): Long {
    DateTimeZone.setDefault(DateTimeZone.forID(timeZone))
    val zone = DateTimeZone.forID(timeZone)
    val dateTime = DateTimeFormat.forPattern(pattern).withZone(zone)
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
 * Remove all new line in a string
 */
fun String.removeNewLines(): String {
    return this.replace("\n", "")
}

/**
 * Change string into date
 */
fun String.convertToDate(pattern: String = "yyyy-MM-dd", timeZone: String = "Asia/Jakarta"): Date {
    DateTimeZone.setDefault(DateTimeZone.forID(timeZone))
    val zone = DateTimeZone.forID(timeZone)
    return DateTimeFormat.forPattern(pattern).parseDateTime(this).withZone(zone).toDate()
}

/**
 * Filter tha value into only contains numeric value
 */
fun String.filterIntoNumeric(): String {
    return if (this.isDecimalNumber()) {
        this.split(".")[0].replace(NUMERIC_VALIDATION, "")
    } else {
        this.replace(NUMERIC_VALIDATION, "")
    }
}

/**
 * Filter tha value into only contains numeric value
 */
fun String.isDecimalNumber(): Boolean {
    return this.contains(".")
}

/**
 * Check value is contain with ignored case
 */
fun String.isContainWithIgnoredCase(value: String): Boolean {
    return this.contains(value, true)
}

/**
 * Insert char at string
 */
fun String.insert(index: Int, char: String): String {
    return StringBuilder(this).insert(index, char).toString()
}

/**
 * Get first name
 */
fun String.firstName(): String {
    val splitName = this.trim().split(" ")

    return if (splitName.size > 1) {
        splitName[0]
    } else {
        this.trim()
    }
}

/**
 * Get last name
 */
fun String.lastName(): String {
    val splitName = this.trim().split(" ")
    var lastName = ""
    if (splitName.size > 1) {
        lastName = this.trim().removePrefix("${splitName[0]} ")
    }

    return lastName
}

/**
 * Check if string value is integer or not
 */
fun String.isInteger(): Boolean = this.toIntOrNull() != null

/**
 * Remove number delimiter
 */
fun String.removeNumberDelimiter(): String {
    return this.replace(".", "")
}