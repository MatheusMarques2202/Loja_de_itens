package com.example.lojadeitens.ui.TelaLojaDeItens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lojadeitens.R
import com.example.lojadeitens.data.BDProdutos
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
    }
}


@Composable
fun listaDeProduto(listaDeProduto:List <Produto>){

    LazyColumn{
       items(listaDeProduto){
        Produto->
           CardProduto(Produto)
       }

    }

}


@Composable
fun CardProduto(
    produto: Produto

) {
    Card {
        Column {
            Row {
                Image(
                    painter = painterResource(id = produto.imagem),
                    contentDescription = null,
                    modifier = Modifier.run {
                        size(200.dp)


                    }
                )
                Column {
                    Text(
                        text = produto.nome,
                        fontSize = 40.sp

                    )
                    Text(
                        text = produto.categoria,
                        fontSize = 38.sp
                    )

                    Text(
                        text = produto.descricao,
                        fontSize = 20.sp
                    )
                }
                Icon(
                    imageVector = Icons.Filled.KeyboardArrowDown,
                    contentDescription = null
                )

            }
            Column {
                Text(
                    text = produto.loja,
                    fontSize = 25.sp
                )
                Text(text = "${produto.preco}",
                fontSize = 23.sp
                )
            }

        }

    }

}
@Preview(showSystemUi = true)
@Composable
fun PreviewListaProdutos() {
    listaDeProduto(listaDeProduto = BDProdutos().carregaListaProdutos()
    )
}