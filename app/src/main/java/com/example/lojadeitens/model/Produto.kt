package com.example.lojadeitens.model

data class Produto(

    val nome:String,
    val categoria:String,
    val descricao:String,
    var loja:String,
    var preco:Double ,
    var imagem:Int
)
