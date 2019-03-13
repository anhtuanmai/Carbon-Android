package com.demo.mobile.app

import android.content.Context
import com.demo.mobile.R

open class VariantSettings(private val context: Context) {
    val baseUrl: String = context.getString(R.string.default_base_url)
}
