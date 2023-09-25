package com.example.tic_tac_toe

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.tic_tac_toe.ui.theme.TictactoeTheme

@Composable
fun TictactoeScreen(
               modifier: Modifier = Modifier,
               viewModel: GameViewmodel = GameViewmodel()
) {
    val state = viewModel.state.value
    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome to Tic Tac Toe",
            modifier = modifier
                .background(Color.LightGray)
                .padding(16.dp),
            fontSize = 40.sp,
            color = MaterialTheme.colorScheme.onSurface,
            style = MaterialTheme.typography.headlineMedium,

            )


        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier.fillMaxWidth()
        ) {

            Button(onClick = {
                viewModel.setButton(0)

            }) {
                Text(
                    text = state.button[0],
                )
            }
            Button(onClick = {
                viewModel.setButton(1)
            }) {
                Text(
                    text = state.button[1],
                )
            }
            Button(onClick = {
                viewModel.setButton(2)
            }) {
                Text(
                    text = state.button[2],
                )

            }
        }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = modifier.fillMaxWidth()
            ) {
                Button(onClick = {
                    viewModel.setButton(3)
                }) {
                    Text(
                        text = state.button[3]
                    )
                }
                Button(onClick = {
                    viewModel.setButton(4)
                }) {
                    Text(
                        text = state.button[4]
                    )
                }
                Button(onClick = {
                    viewModel.setButton(5)
                }) {
                    Text(
                        text = state.button[5],
                    )
                }
            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = modifier.fillMaxWidth()
            ) {
                Button(onClick = {
                    viewModel.setButton(6)
                }) {
                    Text(
                        text = state.button[6],
                    ) }
                Button(onClick = {
                    viewModel.setButton(7)
                }) {
                    Text(
                        text = state.button[7],
                    )
                }
                Button(onClick = {
                    viewModel.setButton(8)
                }) {
                    Text(
                        text = state.button[8],
                    )
                }
            }
        }
    }







@Preview(showBackground = true)
@Composable
fun TictactoePreview() {
    TictactoeTheme {
        TictactoeScreen()
    }
}