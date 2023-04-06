package com.saiful.practicecleanmvvm.domain.usecase

import com.saiful.practicecleanmvvm.data.db.Click
import com.saiful.practicecleanmvvm.domain.repository.ClickRepository

class AddClick(private val repo: ClickRepository) {
    suspend operator fun invoke(click: Click) {
        repo.insertClick(click)
    }
}