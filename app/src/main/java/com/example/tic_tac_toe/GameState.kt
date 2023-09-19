package com.example.tic_tac_toe

data class GameState(
    val button1: String = "-",
    val button2: String = "-",
    val button3: String = "-",
    val isXTurn : Boolean = true
    )