package com.example.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpack.ui.theme.JetPackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackTheme {
                // Affichez MainScreen dans l'application
                MainScreen()
            }
        }
    }
}

/**
 * Exercice 1: Créez une fonction composable principale appelée MainScreen.
 */
@Composable
fun MainScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Box(
            modifier = Modifier.padding(innerPadding).fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            WelcomeMessage()
        }
    }
}

/**
 * Exercice 1: Créez une fonction composable nommée WelcomeMessage qui affiche un texte simple.
 */
@Composable
fun WelcomeMessage(modifier: Modifier = Modifier) {
    Text(
        text = "Bounjour",
        modifier = modifier
    )
}

/**
 * Exercice 2: Ajoutez une prévisualisation pour une fonction composable en utilisant
 * des valeurs d'exemple pour les réglages.
 */
@Preview(
    name = "LightBluePreview",
    showBackground = true,
    backgroundColor = 0xFFADD8E6, // Bleu clair
    widthDp = 200,
    heightDp = 100,
    showSystemUi = true // Pour mettre en évidence les contours
)
@Composable
fun WelcomeMessagePreview() {
    JetPackTheme {
        // Centre le message de bienvenue pour un meilleur aperçu
        Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
            WelcomeMessage()
        }
    }
}
