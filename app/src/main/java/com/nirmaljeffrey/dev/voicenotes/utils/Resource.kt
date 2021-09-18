package com.nirmaljeffrey.dev.voicenotes.utils

import com.nirmaljeffrey.dev.voicenotes.data.model.state.State

// A generic class that contains data and status about loading this data.
sealed class Resource<T : State>(
    val data: T? = null,
    val message: String? = null
) {
    class Success<T : State>(data: T) : Resource<T>(data)
    class Loading<T : State>(data: T? = null) : Resource<T>(data)
    class Error<T : State>(message: String, data: T? = null) : Resource<T>(data, message)
}