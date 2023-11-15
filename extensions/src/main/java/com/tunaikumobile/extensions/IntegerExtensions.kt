package com.tunaikumobile.extensions


/**
 *
 * Created by Suyanwar on 2020-02-26.
 * Android Engineer
 *
 **/

/**
 * Add plus sign on integer value
 */
fun Int.addPlusSign(): String {
    return if (this >= 0) "+${this}" else "$this"
}

internal fun Int.dayOfWeekIDVersion(): String {
    return when (this) {
        1 -> "Senin"
        2 -> "Selasa"
        3 -> "Rabu"
        4 -> "Kamis"
        5 -> "Jum'at"
        6 -> "Sabtu"
        7 -> "Minggu"
        else -> throw IllegalArgumentException("Day of the week must be in the range 1 to 7")
    }
}