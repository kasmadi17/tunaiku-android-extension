package com.tunaikumobile.extensions.inline

import kotlin.reflect.KClass


/**
 *
 * Created by Wahyu Permadi on 02/06/20.
 * Android Engineer
 *
 **/

inline fun <E: Exception> tryCatch(tryBlock: () -> Unit, catchBlock: (E) -> Unit) {
    try {
        tryBlock()
    }catch (e: Exception) {
        e.printStackTrace()
        catchBlock(e as E)
    }
}

inline fun tryCatch(tryBlock: () -> Unit, catchBlock: (Throwable) -> Unit, vararg exceptions: KClass<out Throwable>){
    try {
        tryBlock()
    }catch (e: Exception) {
        val contains = exceptions.find {
            it.isInstance(e)
        }

        if (contains != null) catchBlock(e)
        else throw e
    }
}