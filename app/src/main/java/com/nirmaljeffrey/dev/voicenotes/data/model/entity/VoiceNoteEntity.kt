package com.nirmaljeffrey.dev.voicenotes.data.model.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "voice_note")
data class VoiceNoteEntity(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "title") val firstName: String,
    @ColumnInfo(name = "body") val lastName: String
)