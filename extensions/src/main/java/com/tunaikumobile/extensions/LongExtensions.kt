package com.tunaikumobile.extensions

import org.joda.time.DateTime
import org.joda.time.DateTimeZone
import java.util.*


/**
 *
 * Created by Suyanwar on 2020-02-26.
 * Android Engineer
 *
 **/


/**
 * Change long millis into date
 */
fun Long.convertToDate(pattern: String = "yyyy-MM-dd", timeZone: String = "Asia/Jakarta"): Date {
    val zone = DateTimeZone.forID(timeZone)
    return DateTime(this, zone).toDate()
}