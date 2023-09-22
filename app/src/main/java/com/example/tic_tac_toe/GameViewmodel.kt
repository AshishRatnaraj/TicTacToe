package com.example.tic_tac_toe

import android.widget.Button
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class GameViewmodel: ViewModel() {
    private val _state = mutableStateOf(GameState())
    val state: State<GameState> = _state

    fun setButton(value:Int, buttonId:Int ){
            val buttonText = when (value){
        0 -> " "
        1 -> "X"
        2 -> "O"
        else -> " "
    }22
        button.text = buttonText
}

}




















