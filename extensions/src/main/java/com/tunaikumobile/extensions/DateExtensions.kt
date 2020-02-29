package com.tunaikumobile.extensions

import org.joda.time.DateTime
import org.joda.time.DateTimeZone
import org.joda.time.Days
import org.joda.time.format.DateTimeFormat
import java.util.Date


/**
 *
 * Created by Suyanwar on 2020-02-26.
 * Android Engineer
 *
 **/
var zone: DateTimeZone = DateTimeZone.forID("Asia/Jakarta")
/**
 * Get the diff days of current date to due date
 * Example : currentDate.getDiffDaysFrom(dueDate) => expectations: minusDay -> -5 (H-5 for example)
 * @param targetDate : date that will be compared
 * @author ivanaazuka
 */
fun Date.getDiffDays(targetDate: Date, timeZone : String = "Asia/Jakarta"): Int {
    return Days.daysBetween(this.convertToDateTime(timeZone), targetDate.convertToDateTime(timeZone)).days
}

/**
 * Change date into string
 */
fun Date.convertToString(pattern: String = "yyyy-MM-dd", timeZone : String = "Asia/Jakarta"): String {
    return DateTimeFormat.forPattern(pattern).print(this.convertToDateTime(timeZone))
}

/**
 * Change date format
 */
fun Date.changeDateFormat(newPattern: String = "yyyy-MM-dd", timeZone : String = "Asia/Jakarta"): Date {
    val oldDateTime = this.convertToDateTime()
    val formatter = DateTimeFormat.forPattern(newPattern)
    return formatter.print(oldDateTime).convertToDate(newPattern)
}

/**
 * Convert date to date time
 */
fun Date.convertToDateTime(timeZone: String = "Asia/Jakarta") : DateTime {
    zone = DateTimeZone.forID(timeZone)
    return DateTime(this).withZone(zone)
}