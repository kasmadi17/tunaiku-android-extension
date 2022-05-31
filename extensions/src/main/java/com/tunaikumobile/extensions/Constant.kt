package com.tunaikumobile.extensions


/**
 *
 * Created by Wahyu Permadi on 30/04/20.
 * Android Engineer
 *
 **/

object Constant {

    // Regex
    val PHONE_NUMBER_VALIDATION = "(\\()?(\\+628|628|08|8)(\\d{2,3})?\\)?[ .-]?\\d{1}[ .-]?\\d{1,2}[ .-]?\\d{4,6}".toRegex()
    val NUMERIC_VALIDATION = "[^0-9 .]+".toRegex()
}