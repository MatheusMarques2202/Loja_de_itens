package com.example.lojadeitens.data

import com.example.lojadeitens.R
import com.example.lojadeitens.model.Produto

class BDProdutos {
    fun carregaListaProdutos():List<Produto>{
        return listOf<Produto>(
            Produto(
                "Arroz",
                "branco",
                "O Arroz Prato Fino Tipo 1 5kg ",
                "assaí",
                25.00,
                imagem = R.drawable.arroz
            ),
            Produto(
                "Feijão",
                "Carioca",
                " 1kg do feijão carioca da marca camil. ",
                "assaí",
                19.00,
                imagem = R.drawable.feijao
            ),
            Produto(
                "Azeite",
                "Extra virgem",
                " Andorinha Clássicos Vidro 500ml",
                "assaí",
                20.00,
                imagem = R.drawable.azeite
            ),
            Produto(
                "arroz",
                "branco",
                "O Arroz Prato Fino Tipo 1 5kg ",
                "",
                25.00,
                imagem = R.drawable.oleo
            ),
            Produto(
                "arroz",
                "branco",
                "O Arroz Prato Fino Tipo 1 5kg ",
                "",
                25.00,
                imagem = R.drawable.acucar
            ),
            Produto(
                "arroz",
                "branco",
                "O Arroz Prato Fino Tipo 1 5kg ",
                "",
                25.00,
                imagem = R.drawable.vinagre
            ),
            Produto(
                "arroz",
                "branco",
                "O Arroz Prato Fino Tipo 1 5kg ",
                "",
                25.00,
                imagem = R.drawable.arroz
            ),
            Produto(
                "arroz",
                "branco",
                "O Arroz Prato Fino Tipo 1 5kg ",
                "",
                25.00,
                imagem = R.drawable.arroz
            ),
            Produto(
                "arroz",
                "branco",
                "O Arroz Prato Fino Tipo 1 5kg ",
                "",
                25.00,
                imagem = R.drawable.arroz
            ),
            Produto(
                "arroz",
                "branco",
                "O Arroz Prato Fino Tipo 1 5kg ",
                "",
                25.00,
                imagem = R.drawable.arroz
            ),
            Produto(
                "arroz",
                "branco",
                "O Arroz Prato Fino Tipo 1 5kg ",
                "",
                25.00,
                imagem = R.drawable.arroz
            ),
            Produto(
                "arroz",
                "branco",
                "O Arroz Prato Fino Tipo 1 5kg ",
                "",
                25.00,
                imagem = R.drawable.arroz
            ),
        )
    }
}