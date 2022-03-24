package com.tunaikumobile.extensions

import android.annotation.SuppressLint
import android.content.Context
import android.net.ConnectivityManager
import android.os.Build
import android.provider.Settings
import java.io.File


/**
 *
 * Created by Suyanwar on 2020-02-26.
 * Android Engineer
 *
 **/


/**
 * Check if device is emulator or not
 * @Return boolean
 */
@SuppressLint("HardwareIds")
fun Context.isEmulator(): Boolean {
    val androidId = Settings.Secure.getString(this.contentResolver, "android_id")

    return Build.MODEL.contains("sdk") || Build.PRODUCT.contains("sdk") || androidId == null
}

/**
 * Check if device is rooted or not
 * @Return boolean
 */

fun Context.isRooted(): Boolean {
    val buildTags = Build.TAGS

    return if (buildTags != null && buildTags.contains("text-keys")) {
        true
    } else {
        var file = File("/system/app/Superuser.apk")
        if (file.exists()) {
            true
        } else {
            file = File("/system/xbin/su")
            file.exists()
        }
    }
}


/**
 * Checking internet connection
 * @Return boolean
 */

fun Context.isNetworkConnected(): Boolean {
    val connectivityManager =
        this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val activeNetworkInfo = connectivityManager.activeNetworkInfo
    return activeNetworkInfo != null && activeNetworkInfo.isConnected
}