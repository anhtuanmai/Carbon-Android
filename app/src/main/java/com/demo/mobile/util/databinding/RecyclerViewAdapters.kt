package com.demo.mobile.util.databinding

import android.databinding.BindingAdapter
import android.support.v7.widget.RecyclerView

import com.demo.mobile.util.recyclerview.ArrayAdapter

object RecyclerViewAdapters {
    /**
     * This adapter will fail if the RecyclerView isn't using our ArrayAdapter adapter or if
     * the type of the items passed in doesn't match what the adapter expects. But it does make
     * wiring up a RecyclerView with Data Binding very easy!
     */
    @JvmStatic
    @BindingAdapter("items")
    fun setItems(view: RecyclerView, items: List<Any>) {
        @Suppress("UNCHECKED_CAST")
        val arrayAdapter = view.adapter as ArrayAdapter<Any, RecyclerView.ViewHolder>
        arrayAdapter.setItems(items)
    }
}
