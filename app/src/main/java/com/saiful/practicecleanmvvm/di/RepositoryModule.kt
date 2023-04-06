package com.saiful.practicecleanmvvm.di

import com.saiful.practicecleanmvvm.data.db.ClickDatabase
import com.saiful.practicecleanmvvm.data.repository.ClickRepositoryImpl
import com.saiful.practicecleanmvvm.domain.repository.ClickRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideRepository(db: ClickDatabase): ClickRepository {
        return ClickRepositoryImpl(db.clickDao)
    }
}