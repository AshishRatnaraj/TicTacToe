package com.example.tic_tac_toe

data class GameState(
    val button1: String = "X",
    val button2: String = "O",
    val button3: String = "Blank",
    val isXTurn : Boolean = true
    )