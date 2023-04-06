package com.saiful.practicecleanmvvm.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ClickDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertClick(click: Click)

    @Query("SELECT * FROM click")
    fun getAllClick(): Flow<List<Click>>
}