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