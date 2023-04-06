package com.saiful.practicecleanmvvm.di

import android.app.Application
import com.saiful.practicecleanmvvm.data.db.ClickDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabase(app: Application) : ClickDatabase {
        return ClickDatabase.getDatabase(app)
    }
}