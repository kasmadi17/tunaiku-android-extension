package com.tunaikumobile.extensions

import org.joda.time.DateTime
import org.joda.time.Days
import org.joda.time.LocalDateTime
import org.joda.time.format.DateTimeFormat
import java.text.SimpleDateFormat
import java.util.*


/**
 *
 * Created by Suyanwar on 2020-02-26.
 * Android Engineer
 *
 **/

/**
 * Get the diff days of current date to due date
 * Example : currentDate.getDiffDaysFrom(dueDate) => expectations: minusDay -> -5 (H-5 for example)
 * @param targetDate : date that will be compared
 * @author ivanaazuka
 */
//fun Date.getDiffDays(targetDate: Date): Int {
//    return Days.daysBetween(DateTime(LocalDateTime(this)), DateTime(LocalDateTime(targetDate))).days
//}
//
///**
// * Change date into string
// */
//fun Date.convertToString(pattern: String = "yyyy-MM-dd"): String {
//    return DateTimeFormat.forPattern(pattern).print(LocalDateTime(this))
//}
//
///**
// * Change date format
// */
//fun Date.changeDateFormat(pattern: String = "yyyy-MM-dd"): Date {
//    val sdf = SimpleDateFormat(pattern, Locale.US)
//    return sdf.parse(sdf.format(this))!!
//}
//
//fun Date.changeDateFormat1(pattern: String = "yyyy-MM-dd"): Date {
//    val formatter = DateTimeFormat.forPattern(pattern)
//    return formatter.parseDateTime(formatter.print(DateTime(LocalDateTime(this)))).toDate()
//}