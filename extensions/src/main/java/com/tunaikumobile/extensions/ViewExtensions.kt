package com.tunaikumobile.extensions

import android.graphics.Rect
import android.view.View
import android.view.ViewGroup


/**
 *
 * Created by Wahyu Permadi on 30/04/20.
 * Android Engineer
 *
 **/

fun View.isViewVisibleInScreen(): Boolean {
    val rect = Rect()
    return (this.getGlobalVisibleRect(rect)
            && this.height == rect.height()
            && this.width == rect.width())
}

fun View.setMargins(
    leftMarginDp: Int? = null,
    topMarginDp: Int? = null,
    rightMarginDp: Int? = null,
    bottomMarginDp: Int? = null
) {
    if (layoutParams is ViewGroup.MarginLayoutParams) {
        val params = layoutParams as ViewGroup.MarginLayoutParams
        leftMarginDp?.run { params.leftMargin = this.toFloat().changeIntoDp(context).toInt() }
        topMarginDp?.run { params.topMargin = this.toFloat().changeIntoDp(context).toInt() }
        rightMarginDp?.run { params.rightMargin = this.toFloat().changeIntoDp(context).toInt() }
        bottomMarginDp?.run { params.bottomMargin = this.toFloat().changeIntoDp(context).toInt() }
        requestLayout()
    }
}