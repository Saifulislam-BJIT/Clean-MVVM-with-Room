package com.saiful.practicecleanmvvm.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.saiful.practicecleanmvvm.data.db.Click
import com.saiful.practicecleanmvvm.domain.usecase.UseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ClickViewModel @Inject constructor(private val useCase: UseCase) : ViewModel() {
    var allClicks by mutableStateOf(emptyList<Click>())

    init {
        getAllClick()
    }

    private fun getAllClick() {
        viewModelScope.launch {
            useCase.getAllClickUseCase().collect {
                allClicks = it
            }
        }
    }

    fun addClick(click: Click) = viewModelScope.launch {
        useCase.addClick.invoke(click)
    }
}