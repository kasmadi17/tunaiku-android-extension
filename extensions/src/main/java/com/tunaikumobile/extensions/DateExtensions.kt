package com.tunaikumobile.extensions

import android.os.Build
import org.joda.time.DateTime
import org.joda.time.DateTimeZone
import org.joda.time.Days
import org.joda.time.LocalDate
import org.joda.time.Months
import org.joda.time.Years
import org.joda.time.format.DateTimeFormat
import java.util.*


/**
 *
 * Created by Suyanwar on 2020-02-26.
 * Android Engineer
 *
 **/
var zone: DateTimeZone = DateTimeZone.forID("Asia/Jakarta")

/**
 * Get the diff days
 */
fun Date.getDiffDays(targetDate: Date = Date(), timeZone: String = "Asia/Jakarta"): Int {
    DateTimeZone.setDefault(DateTimeZone.forID(timeZone))
    return Days.daysBetween(
        this.convertToDateTime(timeZone),
        targetDate.convertToDateTime(timeZone)
    ).days
}

/**
 * Get diff months
 */
fun Date.getDiffMonths(targetDate: Date = Date(), timeZone: String = "Asia/Jakarta"): Int {
    DateTimeZone.setDefault(DateTimeZone.forID(timeZone))
    return Months.monthsBetween(
        this.convertToDateTime(timeZone),
        targetDate.convertToDateTime(timeZone)
    ).months
}

/**
 * Get diff years
 */
fun Date.getDiffYears(targetDate: Date = Date(), timeZone: String = "Asia/Jakarta"): Int {
    DateTimeZone.setDefault(DateTimeZone.forID(timeZone))
    return Years.yearsBetween(
        this.convertToDateTime(timeZone),
        targetDate.convertToDateTime(timeZone)
    ).years
}

/**
 * Add or minus days
 */
fun Date.plusOrMinusDays(range: Int, pattern: String = "yyyy-MM-dd"): String {
    val formatter = DateTimeFormat.forPattern(pattern)
    return formatter.print(this.convertToDateTime().plusDays(range))
}

/**
 * Add or minus months
 */
fun Date.plusOrMinusMonths(range: Int, pattern: String = "yyyy-MM-dd"): String {
    val formatter = DateTimeFormat.forPattern(pattern)
    return formatter.print(this.convertToDateTime().plusMonths(range))
}

/**
 * Add or minus years
 */
fun Date.plusOrMinusYears(range: Int, pattern: String = "yyyy-MM-dd"): String {
    val formatter = DateTimeFormat.forPattern(pattern)
    return formatter.print(this.convertToDateTime().plusYears(range))
}

/**
 * Change date into string
 */
fun Date.convertToString(
    pattern: String = "yyyy-MM-dd",
    timeZone: String = "Asia/Jakarta"
): String {
    DateTimeZone.setDefault(DateTimeZone.forID(timeZone))
    return DateTimeFormat.forPattern(pattern).print(this.convertToDateTime(timeZone))
}

/**
 * Change date format
 */
fun Date.changeDateFormat(
    newPattern: String = "yyyy-MM-dd",
    timeZone: String = "Asia/Jakarta"
): Date {
    DateTimeZone.setDefault(DateTimeZone.forID(timeZone))
    val oldDateTime = this.convertToDateTime(timeZone)
    val formatter = DateTimeFormat.forPattern(newPattern)
    return formatter.print(oldDateTime).convertToDate(newPattern)
}

/**
 * Convert date to date time
 */
fun Date.convertToDateTime(timeZone: String = "Asia/Jakarta"): DateTime {
    DateTimeZone.setDefault(DateTimeZone.forID(timeZone))
    zone = DateTimeZone.forID(timeZone)
    return DateTime(this).withZone(zone)
}

/**
 * @return A [String] representing the short month text (e.g., "Nov").
 */
fun Date.getShortMonth(): String {
    val dateTime = DateTime(this)
    return dateTime.monthOfYear().getAsShortText(Locale.getDefault())
}

/**
 * @return A [String] representing the day of the week text (e.g., "Sabtu" for the "ID" locale).
 */
fun Date.getDayAsText(): String {
    val dateTime = DateTime(this)
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        dateTime.dayOfWeek()
            .getAsText(Locale.forLanguageTag(Locale.forLanguageTag("ID").toLanguageTag()))
    } else {
        dateTime.dayOfWeek.dayOfWeekIDVersion()
    }
}

/**
 *
 * @return The day of the week as an integer.
 */
fun Date.getDayOfWeek(): Int {
    return DateTime(this).dayOfWeek
}

fun Date.getDayOfMonth(): Int {
    return DateTime(this).dayOfMonth
}

fun Date.getYearOfDate():Int{
    return DateTime(this).year
}

/**
 *
 * @return `true` if the date is today, `false` otherwise.
 */
fun Date.isToday(): Boolean {
    return LocalDate() == LocalDate(this)
}

/**
 *
 * @return `true` if the day is a weekend day (Saturday or Sunday), `false` otherwise.
 */
fun Date.isWeekend(): Boolean {
    val dateTime = DateTime(this)
    return dateTime.dayOfWeek == 6 || dateTime.dayOfWeek == 7
}