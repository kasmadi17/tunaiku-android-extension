package com.tunaikumobile.extensions

import android.os.Build
import java.text.DateFormatSymbols
import java.util.Date
import java.util.Calendar
import java.util.Locale

/**
 * @author Kasmadi
 * @date 14/11/23
 */

fun Calendar.getDay(): Int {
    return get(Calendar.DAY_OF_MONTH)
}

fun Calendar.getMonth(): String {
    return DateFormatSymbols.getInstance().shortMonths[this.get(Calendar.MONTH)]
}

fun Calendar.getDayOfWeek(): String {
    return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        DateFormatSymbols.getInstance(Locale.forLanguageTag("ID")).weekdays[this.get(Calendar.DAY_OF_WEEK)]
    } else {
        get(Calendar.DAY_OF_WEEK).dayOfWeek()
    }
}

fun Calendar.isWeekend(date: Date): Boolean {
    time = date
    val day = get(Calendar.DAY_OF_WEEK)
    return day == Calendar.SATURDAY || day == Calendar.SUNDAY
}