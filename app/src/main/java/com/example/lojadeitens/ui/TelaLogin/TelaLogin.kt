package com.example.lojadeitens.ui.TelaLogin

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lojadeitens.R

@Composable
fun TelaLogin(
    espacoDasBarras: PaddingValues,
    controleNavegacao: NavController
) {
    var nome by remember { mutableStateOf("") }
    var login by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }
    var cadastrar by remember { mutableStateOf(false) }
    var confimarSenha by remember { mutableStateOf("") }
    var logarErro by remember { mutableStateOf(false) }

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(espacoDasBarras)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioNoBouncy,
                        stiffness = Spring.StiffnessVeryLow
                    )
                )
        ) {

            if (cadastrar) {
                CampoDeTexto(
                    value = nome,
                    onValueChance = { nome = it },
                    idTexto = R.string.nome,
                    isError = false
                )
                Spacer(modifier = Modifier.size(20.dp))
            }
            CampoDeTexto(
                value = login,
                onValueChance = { login = it },
                idTexto = if (logarErro)
                    R.string.login_erro
                else
                    R.string.login,
                isError = logarErro
            )
            Spacer(modifier = Modifier.size(20.dp))
            CampoDeTexto(
                value = senha,
                onValueChance = { senha = it },
                idTexto = if (logarErro)
                    R.string.senha_erro
                else
                    R.string.senha,
                isError = logarErro
            )
            if (cadastrar) {
                Spacer(modifier = Modifier.size(20.dp))
                CampoDeTexto(
                    value = confimarSenha,
                    onValueChance = { confimarSenha = it },
                    idTexto = R.string.confirmarSenha,
                    isError = logarErro
                )
            }
            if (!cadastrar) {
                Text(
                    text = "Cadastrar conta",
                    modifier = Modifier.clickable {
                        cadastrar = true
                    }
                )
            }
            Spacer(modifier = Modifier.size(10.dp))

            Button(
                onClick = {
                    controleNavegacao.navigate("TelaLojaDeItens")
                if (senha == "9876" && login == "m") {
                    cadastrar = false
                    logarErro = false
                    controleNavegacao.navigate("TelaLojaDeItens")
                } else {
                    logarErro = true
                }
            }
            ) {
                Text(
                    text = if (cadastrar)
                        "Cadastrar"
                    else
                        "Entrar"
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CampoDeTexto(
    value:
    String,
    onValueChance: (String) -> Unit,
    idTexto: Int,
    isError: Boolean
) {
    TextField(
        value = value,
        onValueChange = onValueChance,
        label = {
            Text(
                text = stringResource(idTexto)
            )
        },
        isError = isError
    )
}