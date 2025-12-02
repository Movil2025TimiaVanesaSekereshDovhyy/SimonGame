package net.iessochoa.sergiocontreras.simongame.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

/**
 * Project: SimonGame
 * From: net.iessochoa.sergiocontreras.simongame.ui.components
 * Created by: Contr
 * On: 26/11/2025 at 14:35
 * Creado en Settings -> Editor -> File and Code Templates
 */

@Composable
fun SimonButton(
    color: Color,
    isActive: Boolean = false,
    onClick: ()-> Unit,
    modifier: Modifier = Modifier
) {
    /* Representa a cada uno de los 4 botones que tiene el juego de Simon.
    A veces nos toca rascarnos la cabeza pensando en que propiedades necesitará...
    Una manera es tener el componente NO reutilizable e ir moviendo progresivamente parámetros a la firma.
    Como vamos a necesitar un Toast... ¿Qué información necesitará transmitir? Eso es una pista de la firma del lambda.
    */
    //Si se pulsa se pone blanco
    val botonActivo = if (isActive) Color.White else color

    Box(
        modifier = modifier
            .aspectRatio(1f) //Cuadrado
            .background(botonActivo)
            .clickable { onClick}
    )

}