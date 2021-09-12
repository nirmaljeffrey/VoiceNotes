package com.nirmaljeffrey.dev.voicenotes.viewmodel

import androidx.lifecycle.ViewModel
import com.nirmaljeffrey.dev.voicenotes.repository.VoiceNoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class VoiceNotesViewModel @Inject constructor(private val voiceNoteRepository: VoiceNoteRepository) :
    ViewModel() {


}