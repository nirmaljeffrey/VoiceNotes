package com.nirmaljeffrey.dev.voicenotes.di

import android.content.Context
import androidx.room.Room
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.nirmaljeffrey.dev.voicenotes.data.persistance.AppDatabase
import com.nirmaljeffrey.dev.voicenotes.data.persistance.dao.VoiceNoteDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {
    companion object {
        @Provides
        @Singleton
        fun providesFirebaseCrashlytics(): FirebaseCrashlytics = FirebaseCrashlytics.getInstance()

        @Provides
        @Singleton
        fun providesFirebaseAnalytics(@ApplicationContext context: Context): FirebaseAnalytics =
            FirebaseAnalytics.getInstance(context)

        @Provides
        @Singleton
        fun providesAppDatabase(@ApplicationContext context: Context): AppDatabase {
            return Room.databaseBuilder(
                context,
                AppDatabase::class.java, "app-database"
            ).build()
        }

        @Provides
        @Singleton
        fun providesVoiceNoteDao(appDatabase: AppDatabase): VoiceNoteDao =
            appDatabase.voiceNoteDao()
    }
}