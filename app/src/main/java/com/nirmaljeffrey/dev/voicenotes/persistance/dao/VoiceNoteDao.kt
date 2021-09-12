package com.nirmaljeffrey.dev.voicenotes.persistance.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.nirmaljeffrey.dev.voicenotes.data.entity.VoiceNoteEntity

@Dao
interface VoiceNoteDao {
    @Query("SELECT * FROM voice_note")
    fun getAll(): List<VoiceNoteEntity>

    @Query("SELECT * FROM voice_note WHERE id IN (:voiceNoteIds)")
    fun loadAllByIds(voiceNoteIds: IntArray): List<VoiceNoteEntity>

    @Query("SELECT * FROM voice_note WHERE title LIKE :title")
    fun findByTitle(title: String): VoiceNoteEntity

    @Insert
    fun insertAll(voiceNotes: List<VoiceNoteEntity>)

    @Delete
    fun delete(voiceNote: VoiceNoteEntity)
}