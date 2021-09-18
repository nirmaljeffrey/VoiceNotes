package com.nirmaljeffrey.dev.voicenotes.di.intiliazers

import android.content.Context
import androidx.startup.Initializer
import com.nirmaljeffrey.dev.voicenotes.di.InitializerEntryPoint
import com.nirmaljeffrey.dev.voicenotes.di.TimberService
import javax.inject.Inject

class TimberInitializer : Initializer<TimberService> {
    @Inject
    lateinit var timberService: TimberService

    override fun create(context: Context): TimberService {
        InitializerEntryPoint.resolve(context).inject(this)
        timberService.initialize()
        return timberService
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf(DependencyGraphInitializer::class.java)
    }
}