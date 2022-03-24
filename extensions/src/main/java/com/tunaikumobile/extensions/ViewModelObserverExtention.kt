package com.tunaikumobile.extensions

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData


/**
 *
 * Created by Wahyu Permadi on 30/04/20.
 * Android Engineer
 *
 **/

fun <T> LifecycleOwner.observe(liveData: LiveData<T>, action: (t: T) -> Unit) {
    liveData.observe(this) { it?.let { t -> action(t) } }
}