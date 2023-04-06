package com.saiful.practicecleanmvvm.di

import com.saiful.practicecleanmvvm.domain.repository.ClickRepository
import com.saiful.practicecleanmvvm.domain.usecase.AddClick
import com.saiful.practicecleanmvvm.domain.usecase.GetClick
import com.saiful.practicecleanmvvm.domain.usecase.UseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Provides
    @Singleton
    fun provideUseCase(repo: ClickRepository): UseCase {
        return UseCase(
            addClick = AddClick(repo),
            getAllClickUseCase = GetClick(repo)
        )
    }
}