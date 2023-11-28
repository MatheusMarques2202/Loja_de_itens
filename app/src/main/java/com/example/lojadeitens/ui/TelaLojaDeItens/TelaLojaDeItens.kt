package com.example.lojadeitens.ui.TelaLojaDeItens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lojadeitens.R
import com.example.lojadeitens.model.Produto

@Composable
fun TelaLojaDeItens(
    espacoDasBarras: PaddingValues,
    controleNavegacao: NavController

) {
    Column(
        modifier = Modifier
            .padding(espacoDasBarras)
    ) {
        Text(
            text = "Funcionou!!!"
        )
        Button(
            onClick = {
                controleNavegacao.navigate("TelaLogin")
            }
        ) {
            Text(text = "Voltar")
        }
    }
}


@Composable
fun listaDeProduto(listaDeProduto:List <Produto>){

    LazyColumn{
       items(listaDeProduto)
         CardProduto()
    }

}

@Preview
@Composable
fun CardProduto() {
    Card {
        Column {
            Row {
                Image(
                    painter = painterResource(id = R.drawable.arroz),
                    contentDescription = null,
                    modifier = Modifier.run {
                        size(80.dp)


                    }
                )
                Column {
                    Text(
                        text = "Produto"
                    )
                    Text(
                        text = "Modelo"
                    )
                }
                Icon(
                    imageVector = Icons.Filled.KeyboardArrowDown,
                    contentDescription = null
                )

            }
            Column {
                Text(
                    text = "Preço"
                )
                Text(text = "R$25,00")
            }

        }

    }

}