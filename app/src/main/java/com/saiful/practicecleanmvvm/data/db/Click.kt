package com.saiful.practicecleanmvvm.data.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "click")
data class Click(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "isClick") val click: Boolean
)
