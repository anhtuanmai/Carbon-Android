package com.demo.mobile

import com.demo.mobile.TestUtils.getAppUnderTest
import com.demo.mobile.app.AndroidModule
import com.demo.mobile.app.AppModule
import com.demo.mobile.app.ApplicationComponent
import com.demo.mobile.app.VariantModule
import com.demo.mobile.data.DataModule
import com.demo.mobile.modules.CrashReporterModule
import com.demo.mobile.monitoring.LoggerModule
import it.cosenonjaviste.daggermock.DaggerMockRule

class MainApplicationDaggerMockRule : DaggerMockRule<ApplicationComponent>(
        ApplicationComponent::class.java,
        VariantModule(),
        AndroidModule(getAppUnderTest()),
        AppModule(0),
        LoggerModule(),
        CrashReporterModule(),
        DataModule()) {
    init {
        set { component -> getAppUnderTest().component = component }
    }
}
