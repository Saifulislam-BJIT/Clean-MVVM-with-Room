package com.saiful.practicecleanmvvm.presentation.Composable

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.saiful.practicecleanmvvm.data.db.Click

@Composable
fun ClickList(click: Click) {
    Column() {
        Text(text = "${click.id}")
    }
}

//@Preview
//@Composable
//fun PracticeCleanMvvmPreview() {
//    List(Click(2, true))
//}