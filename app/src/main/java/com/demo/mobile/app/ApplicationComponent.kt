package com.demo.mobile.app

import com.demo.mobile.data.DataModule
import com.demo.mobile.modules.CrashReporterModule
import com.demo.mobile.monitoring.LoggerModule
import com.demo.mobile.ui.ViewModelFactoryModule
import com.demo.mobile.ui.main.MainActivity
// GENERATOR - MORE IMPORTS //
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [
        VariantModule::class,
        AndroidModule::class,
        AppModule::class,
        LoggerModule::class,
        CrashReporterModule::class,
        DataModule::class,
        ViewModelFactoryModule::class])
interface ApplicationComponent : VariantApplicationComponent {
    fun inject(application: MainApplication)

    fun inject(activity: MainActivity)
    // GENERATOR - MORE ACTIVITIES //
}