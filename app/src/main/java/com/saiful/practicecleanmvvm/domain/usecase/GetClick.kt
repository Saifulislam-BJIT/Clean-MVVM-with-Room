package com.saiful.practicecleanmvvm.domain.usecase

import com.saiful.practicecleanmvvm.data.db.Click
import com.saiful.practicecleanmvvm.domain.repository.ClickRepository
import kotlinx.coroutines.flow.Flow

class GetClick(private val repo: ClickRepository) {
    suspend operator fun invoke(): Flow<List<Click>> {
        return repo.getAllClick()
    }
}