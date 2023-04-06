package com.saiful.practicecleanmvvm.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Click::class], version = 1, exportSchema = false)
abstract class ClickDatabase : RoomDatabase() {
    abstract val clickDao: ClickDao

    companion object {
        @Volatile
        private var Instance: ClickDatabase? = null

        fun getDatabase(context: Context): ClickDatabase {
            return Instance ?: synchronized(this) {
                Room.databaseBuilder(context, ClickDatabase::class.java, "click_database")
                    .fallbackToDestructiveMigration()
                    .build()
                    .also { Instance = it }
            }
        }
    }
}