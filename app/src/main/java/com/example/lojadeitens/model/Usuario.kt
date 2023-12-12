package com.example.lojadeitens.model

data class Usuario(
    var nome: String = "",
    var email:String= "",
    var senha: String = "",
    var id: String= "",
    var fotoPerfilUrl: String = "",
    var autenticado: Boolean = false
)
