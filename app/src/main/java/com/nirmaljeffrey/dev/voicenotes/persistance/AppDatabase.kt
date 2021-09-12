package com.nirmaljeffrey.dev.voicenotes.persistance

import androidx.room.Database
import androidx.room.RoomDatabase
import com.nirmaljeffrey.dev.voicenotes.data.entity.VoiceNoteEntity
import com.nirmaljeffrey.dev.voicenotes.persistance.dao.VoiceNoteDao

@Database(entities = [VoiceNoteEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun voiceNoteDao(): VoiceNoteDao
}