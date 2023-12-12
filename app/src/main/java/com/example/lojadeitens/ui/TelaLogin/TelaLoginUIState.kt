package com.example.lojadeitens.ui.TelaLogin

import com.example.lojadeitens.R
import com.example.lojadeitens.model.Usuario

data class TelaLoginUIState(
    val cadastrarAtivo:Boolean = false,
    val idtextoBotaoEntrarCadastrar:Int = R.string.entrar,
    val idTextoCampoEmail:Int = R.string.email,
    val idTextoCampoSenha:Int = R.string.senha,
    val idTextoCampoConfirmarSenha:Int = R.string.confirmarSenha,
    val erroAoLogar:Boolean = false,
    val usuarioPreenchido: Usuario? = null,
    val habilitarBotao:Boolean = false,
)
