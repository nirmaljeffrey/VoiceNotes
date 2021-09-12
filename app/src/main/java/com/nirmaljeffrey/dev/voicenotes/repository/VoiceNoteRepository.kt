package com.nirmaljeffrey.dev.voicenotes.repository

import com.nirmaljeffrey.dev.voicenotes.persistance.dao.VoiceNoteDao
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class VoiceNoteRepository @Inject constructor(private val voiceNoteDao: VoiceNoteDao) {
}