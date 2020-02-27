package com.tunaikumobile.extensions

import android.app.Application
import net.danlew.android.joda.JodaTimeAndroid


/**
 *
 * Created by Suyanwar on 2020-02-26.
 * Android Engineer
 *
 **/
class TunaikuExtensions: Application() {
    override fun onCreate() {
        super.onCreate()
        JodaTimeAndroid.init(this)
    }
}