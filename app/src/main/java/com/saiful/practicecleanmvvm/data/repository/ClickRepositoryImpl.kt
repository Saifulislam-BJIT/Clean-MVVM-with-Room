package com.saiful.practicecleanmvvm.data.repository

import com.saiful.practicecleanmvvm.data.db.Click
import com.saiful.practicecleanmvvm.data.db.ClickDao
import com.saiful.practicecleanmvvm.domain.repository.ClickRepository
import kotlinx.coroutines.flow.Flow

class ClickRepositoryImpl(private val dao: ClickDao):ClickRepository {
    override suspend fun insertClick(click: Click) {
        dao.insertClick(click)
    }

    override suspend fun getAllClick(): Flow<List<Click>> {
        return dao.getAllClick()
    }
}