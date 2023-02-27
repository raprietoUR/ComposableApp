package com.example.composableapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composableapp.ui.theme.ComposableAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposableAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposableApp()
                }
            }
        }
    }
}

@Composable
fun ComposableApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            Celda(
                titulo = stringResource(R.string.titulo11),
                descripcion = stringResource(R.string.descripcion11),
                backgroundColor = Color.Green,
                modifier = Modifier.weight(1f)
            )
            Celda(
                titulo = stringResource(R.string.titulo12),
                descripcion = stringResource(R.string.descripcion12),
                backgroundColor = Color.Yellow,
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            Celda(
                titulo = stringResource(R.string.titulo21),
                descripcion = stringResource(R.string.descripcion21),
                backgroundColor = Color.Cyan,
                modifier = Modifier.weight(1f)
            )
            Celda(
                titulo = stringResource(R.string.titulo22),
                descripcion = stringResource(R.string.descripcion22),
                backgroundColor = Color.LightGray,
                modifier = Modifier.weight(1f)
            )
        }

    }
}

@Composable
private fun Celda(
    titulo: String,
    descripcion: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
){
    Column (
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = titulo,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = descripcion,
            textAlign = TextAlign.Justify
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposableAppTheme {
        ComposableApp()
    }
}