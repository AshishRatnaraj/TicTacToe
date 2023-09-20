package com.example.tic_tac_toe

data class GameState(
    val button1: String = "-",
    val button2: String = "-",
    val button3: String = "-",
    val button4: String = "-",
    val button5: String = "-",
    val button6: String = "-",
    val button7: String = "-",
    val button8: String = "-",
    val button9: String = "-",
    val isXTurn : Boolean = true
    )