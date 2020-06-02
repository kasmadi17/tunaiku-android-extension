package com.tunaikumobile.extensions


/**
 *
 * Created by Wahyu Permadi on 30/04/20.
 * Android Engineer
 *
 **/

fun String.isEmailValid(): Boolean {
    return android.util.Patterns.EMAIL_ADDRESS.matcher(this).matches()
}

fun String.isPhoneNumberValid(): Boolean {
    return Constant.PHONE_NUMBER_VALIDATION.matches(this)
}