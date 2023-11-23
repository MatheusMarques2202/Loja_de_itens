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
import com.example.lojadeitens.R

@Composable
fun TelaLogin(
    espacoDasBarras: PaddingValues

) {
    var nome by remember { mutableStateOf("") }
    var login by remember { mutableStateOf("") }
    var senha by remember { mutableStateOf("") }
    var cadastrar by remember { mutableStateOf(false) }
    var confimarSenha by remember { mutableStateOf("") }

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
                    idTexto = R.string.nome
                )
                Spacer(modifier = Modifier.size(20.dp))
            }
            CampoDeTexto(
                value = login,
                onValueChance = { login = it },
                idTexto = R.string.login
            )
            Spacer(modifier = Modifier.size(20.dp))
            CampoDeTexto(
                value = senha,
                onValueChance = { senha = it },
                idTexto = R.string.senha
            )
            if (cadastrar) {
                Spacer(modifier = Modifier.size(20.dp))
                CampoDeTexto(
                    value = confimarSenha,
                    onValueChance = { confimarSenha = it },
                    idTexto = R.string.confirmarSenha
                )
            }
            if (!cadastrar) {
                Text(text = "Cadastrar conta", modifier = Modifier.clickable {
                    cadastrar = !cadastrar
                })
            }
            Spacer(modifier = Modifier.size(10.dp))

            Button(onClick = { }) {
                Text(text = "Entrar")
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CampoDeTexto(
    value: String, onValueChance: (String) -> Unit, idTexto: Int
) {
    TextField(value = value,
        onValueChange = onValueChance,
        label = {
        Text(text = stringResource(idTexto))
    })


}