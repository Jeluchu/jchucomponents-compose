package com.jeluchu.jchucomponentscompose.core.platform

import android.content.Context

class ContextHandler
    (private val context: Context) {
    val appContext: Context get() = context.applicationContext
}