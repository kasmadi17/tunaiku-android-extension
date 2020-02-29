package com.tunaikumobile.androidextension

import android.app.Application
import com.tunaikumobile.extensions.JodaInitialization


/**
 *
 * Created by Suyanwar on 29/02/20.
 * Android Engineer
 *
 **/
class MainApp : Application() {

    override fun onCreate() {
        super.onCreate()
        JodaInitialization.init(this)
    }
}