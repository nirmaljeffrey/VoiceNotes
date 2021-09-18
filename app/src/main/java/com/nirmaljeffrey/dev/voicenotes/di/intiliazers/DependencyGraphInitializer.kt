package com.nirmaljeffrey.dev.voicenotes.di.intiliazers

import android.content.Context
import androidx.startup.Initializer
import com.nirmaljeffrey.dev.voicenotes.di.InitializerEntryPoint

class DependencyGraphInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        InitializerEntryPoint.resolve(context)
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }
}