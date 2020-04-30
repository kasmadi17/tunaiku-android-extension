package com.tunaikumobile.extensions

import android.content.Context
import android.graphics.Rect
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup


/**
 *
 * Created by Wahyu Permadi on 30/04/20.
 * Android Engineer
 *
 **/

fun Context.dpToPx(number: Int): Int {
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, number.toFloat(), resources.displayMetrics).toInt()
}

fun View.isViewVisibleInScreen(): Boolean {
    val rect = Rect()
    return (this.getGlobalVisibleRect(rect)!!
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
        leftMarginDp?.run { params.leftMargin = context.dpToPx(this) }
        topMarginDp?.run { params.topMargin = context.dpToPx(this) }
        rightMarginDp?.run { params.rightMargin = context.dpToPx(this) }
        bottomMarginDp?.run { params.bottomMargin = context.dpToPx(this) }
        requestLayout()
    }
}