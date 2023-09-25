package com.example.tic_tac_toe

import android.widget.Button
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class GameViewmodel: ViewModel() {
    private val _state = mutableStateOf(GameState())
    val state: State<GameState> = _state

    fun setButton(buttonId:Int){
       var XO = ""
        if (_state.value.isXTurn) {
          XO ="X"
            _state.value = _state.value.copy(
                isXTurn = false
            )
        } else  {
           XO = "O"
         _state.value = _state.value.copy(
              isXTurn = true
             )
        }
        val buttonarray =_state.value.button.copyOf()
        buttonarray[buttonId] = XO
        _state.value =_state.value.copy(
            button = buttonarray,

        )
}
}




















