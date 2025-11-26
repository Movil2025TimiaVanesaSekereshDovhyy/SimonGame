package net.iessochoa.sergiocontreras.simongame.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import net.iessochoa.sergiocontreras.simongame.ui.screens.SimonGameScreen
import net.iessochoa.sergiocontreras.simongame.ui.theme.SimonGameTheme

/**
 * Project: SimonGame
 * From: net.iessochoa.sergiocontreras.simongame.ui.theme
 * Created by: Contr
 * On: 26/11/2025 at 14:33
 * Creado en Settings -> Editor -> File and Code Templates
 */

@Composable
fun SimonGameApp() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        SimonGameScreen(
            modifier =  Modifier.padding(innerPadding)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SimonGameAppPreview() {
    SimonGameTheme() {
        SimonGameScreen()
    }
}

