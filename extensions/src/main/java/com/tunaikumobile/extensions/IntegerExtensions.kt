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

internal fun Int.dayOfWeek(): String {
    return when (this) {
        1 -> "Minggu"
        2 -> "Senin"
        3 -> "Selasa"
        4 -> "Rabu"
        5 -> "Kamis"
        6 -> "Jum'at"
        7 -> "Sabtu"
        else -> throw IllegalArgumentException("Day of the week must be in the range 1 to 7")
    }
}