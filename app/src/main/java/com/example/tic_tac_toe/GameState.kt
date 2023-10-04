package com.example.tic_tac_toe



data class GameState(

    val button: Array<String> = arrayOf("-","-","-","-","-","-","-","-","-"),

    val isXTurn: Boolean = true,

    var X wins   = "X Has Won",
    var O wins = "O Has Won"

)



