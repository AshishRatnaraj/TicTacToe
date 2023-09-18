package com.example.tic_tac_toe

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class GameViewmodel: ViewModel() {
    private val _state = mutableStateOf(GameState())
    val state: State<GameState> = _state

    fun setButton(){
        _state.value = when (state.value.isXTurn) {
            true -> _state.value.copy(button1 = " X")
            false -> _state.value.copy(button2 = "O/ Blank")


        }
    }
}



















