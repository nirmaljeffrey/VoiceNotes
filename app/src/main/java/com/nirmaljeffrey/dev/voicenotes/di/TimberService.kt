package com.nirmaljeffrey.dev.voicenotes.di

import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TimberService @Inject constructor(private val tree: Timber.Tree) {
    fun initialize() {
        Timber.plant(tree)
    }
}