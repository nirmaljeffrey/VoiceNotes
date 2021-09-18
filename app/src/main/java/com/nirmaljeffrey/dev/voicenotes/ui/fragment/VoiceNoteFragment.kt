package com.nirmaljeffrey.dev.voicenotes.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.nirmaljeffrey.dev.voicenotes.R
import com.nirmaljeffrey.dev.voicenotes.databinding.FragmentVoiceNoteBinding
import com.nirmaljeffrey.dev.voicenotes.utils.autoCleared
import com.nirmaljeffrey.dev.voicenotes.viewmodel.VoiceNotesViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class VoiceNoteFragment : Fragment() {
    private val viewModel: VoiceNotesViewModel by viewModels()
    private lateinit var navController: NavController
    private var binding by autoCleared<FragmentVoiceNoteBinding>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_voice_note, container, false);
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment)
        val appBarConfig = AppBarConfiguration(navController.graph)
        binding.toolbar.setupWithNavController(navController, appBarConfig)
    }
}