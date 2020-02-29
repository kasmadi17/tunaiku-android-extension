package com.tunaikumobile.extensions

import android.content.Context
import net.danlew.android.joda.JodaTimeAndroid


/**
 *
 * Created by Suyanwar on 29/02/20.
 * Android Engineer
 *
 **/
class JodaInitialization {
    companion object {
        fun init(context: Context) {
            JodaTimeAndroid.init(context)
        }
    }
}