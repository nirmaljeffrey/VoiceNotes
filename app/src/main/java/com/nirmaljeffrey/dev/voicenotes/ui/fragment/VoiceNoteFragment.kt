package com.nirmaljeffrey.dev.voicenotes.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.nirmaljeffrey.dev.voicenotes.R
import com.nirmaljeffrey.dev.voicenotes.databinding.FragmentVoiceNoteBinding
import com.nirmaljeffrey.dev.voicenotes.utils.autoCleared
import com.nirmaljeffrey.dev.voicenotes.viewmodel.VoiceNotesViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class VoiceNoteFragment : Fragment() {
    private val viewModel: VoiceNotesViewModel by activityViewModels()
    private var binding by autoCleared<FragmentVoiceNoteBinding>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_voice_note, container, false);
        return binding.root
    }
}