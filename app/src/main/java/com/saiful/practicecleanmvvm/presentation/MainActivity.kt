package com.saiful.practicecleanmvvm.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.saiful.practicecleanmvvm.data.db.Click
import com.saiful.practicecleanmvvm.presentation.Composable.ClickList
import com.saiful.practicecleanmvvm.presentation.ui.theme.PracticeCleanMvvmTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticeCleanMvvmTheme {
                PracticeCleanMvvmAPP()
            }
        }
    }
}

@Composable
fun PracticeCleanMvvmAPP(
    modifier: Modifier = Modifier,
    viewModel: ClickViewModel = hiltViewModel()
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        LazyColumn(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            items(viewModel.allClicks) { click ->
                ClickList(click = click)
            }
            item {
                Text(
                    text = "${viewModel.allClicks.size}",
                    modifier = modifier
                        .padding(64.dp)
                        .border(
                            BorderStroke(2.dp, color = Color.Blue),
                            shape = RoundedCornerShape(50)
                        )
                        .padding(16.dp, 8.dp),
                    fontSize = 32.sp
                )
            }
            item {
                Button(
                    onClick = { viewModel.addClick(Click(click = true)) },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(
                        text = "Click",
                        fontSize = 32.sp
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PracticeCleanMvvmPreview() {
    PracticeCleanMvvmTheme {
        PracticeCleanMvvmAPP()
    }
}