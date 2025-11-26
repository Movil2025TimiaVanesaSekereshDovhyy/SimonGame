package net.iessochoa.sergiocontreras.simongame.model

import androidx.compose.ui.graphics.Color

/**
 * Project: SimonGame
 * From: net.iessochoa.sergiocontreras.simongame.model
 * Created by: Contr
 * On: 26/11/2025 at 14:47
 * Creado en Settings -> Editor -> File and Code Templates
 */

enum class SimonColor(val value: Color, val label: String) {
    Red(Color(0xFFFF0000), "Rojo"),
    Green(Color(0xFF00FF00), "Verde"),
    Yellow(Color(0xFF0000FF), "Azul"),
    Blue(Color(0xFFFFFF00), "Amarillo");
}