package com.tunaikumobile.extensions


/**
 *
 * Created by Suyanwar on 2020-02-27.
 * Android Engineer
 *
 **/

inline fun <reified T : Any> Any.castOrNull() = this as? T