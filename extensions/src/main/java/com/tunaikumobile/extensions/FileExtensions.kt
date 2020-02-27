package com.tunaikumobile.extensions

import android.util.Base64
import java.io.File


/**
 *
 * Created by Suyanwar on 2020-02-26.
 * Android Engineer
 *
 **/


/**
 * Change string into date
 */
fun File.convertIntoBase64(): String {
    return Base64.encodeToString(this.readBytes(), Base64.NO_WRAP)
}