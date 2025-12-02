package net.iessochoa.sergiocontreras.simongame.ui.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.iessochoa.sergiocontreras.simongame.model.SimonColor
import net.iessochoa.sergiocontreras.simongame.ui.components.SimonButton
import net.iessochoa.sergiocontreras.simongame.ui.theme.SimonGameTheme

/**
 * Project: SimonGame
 * From: net.iessochoa.sergiocontreras.simongame.ui.screens
 * Created by: Contr
 * On: 26/11/2025 at 14:35
 * Creado en Settings -> Editor -> File and Code Templates
 */

@Composable
fun SimonGameScreen(
    modifier: Modifier = Modifier
) {
    /* ENUNCIADO 2: Completa el tablero de juego. Es un grid 2x2 con los colores de Simon
  [Verde, Rojo]
  [Amarillo, Azul]
  De momento que ocupe toda la pantalla
  Los deberás instanciar utilizando los SimonButton
 */
    //Para que me deje mostrar un toast, abrir un activity... (Devuelve el contexto actual)
    val context = LocalContext.current

    //Qué botón está activo
    var colorActivo by remember { mutableStateOf<SimonColor?>(null) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(50.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row {
                SimonButton(
                    SimonColor.Green.value,
                    colorActivo == SimonColor.Green, //Boolean para ver si se ha "activado"
                    {
                        colorActivo = SimonColor.Green //Indicamos que está activo
                        Toast.makeText(context, SimonColor.Green.label, Toast.LENGTH_SHORT).show()
                    },
                    modifier = Modifier
                        .size(120.dp)
                        .padding(8.dp)
                )
                SimonButton(
                    SimonColor.Red.value,
                    colorActivo == SimonColor.Red, //Boolean para ver si se ha "activado"
                    {
                        colorActivo = SimonColor.Red //Indicamos que está activo
                        Toast.makeText(context, SimonColor.Red.label, Toast.LENGTH_SHORT).show()
                    },
                    modifier = Modifier
                        .size(120.dp)
                        .padding(8.dp)
                )

            }
            Row {
                SimonButton(
                    SimonColor.Yellow.value,
                    colorActivo == SimonColor.Yellow, //Boolean para ver si se ha "activado"
                    {
                        colorActivo = SimonColor.Yellow //Indicamos que está activo
                        Toast.makeText(context, SimonColor.Yellow.label, Toast.LENGTH_SHORT).show()
                    },
                    modifier = Modifier
                        .size(120.dp)
                        .padding(8.dp)
                )
                SimonButton(
                    SimonColor.Blue.value,
                    colorActivo == SimonColor.Blue, //Boolean para ver si se ha "activado"
                    {
                        colorActivo = SimonColor.Blue //Indicamos que está activo
                        Toast.makeText(context, SimonColor.Blue.label, Toast.LENGTH_SHORT).show()
                    },
                    modifier = Modifier
                        .size(120.dp)
                        .padding(8.dp)
                )
            }
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun SimonGameScreenPreview() {
//    SimonGameTheme {
//        SimonGameScreen(modifier = Modifier)
//    }
//}