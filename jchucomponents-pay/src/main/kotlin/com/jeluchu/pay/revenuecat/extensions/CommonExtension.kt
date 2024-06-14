package com.jeluchu.pay.revenuecat.extensions

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import java.math.RoundingMode

internal fun String.Companion.empty() = ""
internal fun Float.roundTo(n: Int): Float = toBigDecimal().setScale(n, RoundingMode.UP).toFloat()
internal fun Double.roundTo(n: Int): Double = toBigDecimal().setScale(n, RoundingMode.UP).toDouble()

internal fun Context.findActivity(): Activity? = when (this) {
    is Activity -> this
    is ContextWrapper -> baseContext.findActivity()
    else -> null
}