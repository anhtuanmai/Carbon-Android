package com.demo.mobile.monitoring

interface CrashReporter {
    fun logMessage(message: String)
    fun logException(message: String, ex: Exception)
}
