package com.tunaikumobile.extensions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 *
 * Created by Suyanwar on 2020-02-26.
 * Android Engineer
 *
 **/

infix fun ViewGroup.inflate(layoutResId: Int): View = LayoutInflater.from(context).inflate(layoutResId, this, false)