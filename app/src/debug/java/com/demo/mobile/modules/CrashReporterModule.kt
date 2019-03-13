package com.demo.mobile.modules

import com.demo.mobile.monitoring.LoggingOnlyCrashReporter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CrashReporterModule {
    @Singleton
    @Provides
    fun crashReporter() = LoggingOnlyCrashReporter()
}
