package com.saiful.practicecleanmvvm.domain.repository

import com.saiful.practicecleanmvvm.data.db.Click
import kotlinx.coroutines.flow.Flow

interface ClickRepository {
    suspend fun insertClick(click: Click)

    suspend fun getAllClick(): Flow<List<Click>>
}