package com.tunaikumobile.extensions

import android.util.Base64

/**
 * Created by Suyanwar on 29/12/21.
 */


/**
 * Change byte array into base 64
 */
fun ByteArray.convertIntoBase64(): String {
    return Base64.encodeToString(this, Base64.NO_WRAP)
}