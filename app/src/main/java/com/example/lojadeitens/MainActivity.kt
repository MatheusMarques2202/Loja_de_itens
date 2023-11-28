package com.example.lojadeitens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lojadeitens.ui.TelaLogin.TelaLogin
import com.example.lojadeitens.ui.TelaLojaDeItens.TelaLojaDeItens
import com.example.lojadeitens.ui.theme.LojaDeItensTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LojaDeItensTheme {
                AppLojaDeItem()


            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun AppLojaDeItem() {
    val controleNavegacao = rememberNavController()

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color.LightGray
                ),
                title = {
                    Text(
                        text = "PesquisaPreço "
                    )
                },
                navigationIcon = {

                    IconButton(
                        onClick = { }
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = null
                        )
                    }

                },
            )
        }

    ) { espacoDasBarras ->

        NavHost(
            navController = controleNavegacao,
            startDestination = "TelaLogin"
        ) {
            composable(
                route = "TelaLogin"
            ) {
                TelaLogin(
                    espacoDasBarras = espacoDasBarras,
                    controleNavegacao = controleNavegacao
                )

            }
            composable(
                route = "TelaLojaDeItens"
            ) {
                TelaLojaDeItens(
                    espacoDasBarras = espacoDasBarras,
                    controleNavegacao = controleNavegacao
                )

            }
        }

    }
}


