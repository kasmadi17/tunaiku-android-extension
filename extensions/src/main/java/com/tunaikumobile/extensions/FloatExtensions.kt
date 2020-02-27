package com.tunaikumobile.extensions

import android.content.Context
import android.util.TypedValue


/**
 *
 * Created by Suyanwar on 2020-02-26.
 * Android Engineer
 *
 **/

/**
 * Change float into dp
 */

fun Float.changeIntoDp(context: Context): Float {
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this, context.resources.displayMetrics)
}