package com.example.lojadeitens

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.lojadeitens.model.Usuario
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow


    class ViewModelCompartilhado() : ViewModel() {

        private var auth by mutableStateOf(Firebase.auth)

        private val _usuarioAutenticado = MutableStateFlow<Usuario?>(null)
        val usuarioAutenticado: StateFlow<Usuario?> = _usuarioAutenticado

 fun logarUsuario(
        usuario: Usuario,
        localContext: Context
    ){
        auth.signInWithEmailAndPassword(usuario.email!!, usuario.senha)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val user = auth.currentUser
                    user?.let {
                        val usuarioLogado = Usuario(
                            id = user.uid,
                            nome = user.displayName ?: "",
                            email = user.email ?: "",
                            fotoPerfilUrl = user.photoUrl.toString() ?: "",
                            autenticado = true
                        )
                        _usuarioAutenticado.value = usuarioLogado
                        mensagemToast(localContext, "Autenticado com sucesso!!")
                    }
                } else {
                    mensagemToast(localContext, "Erro ao Autenticar")
                }
            }
    }
fun mensagemToast(
    localContext: Context,
    mensagem: String
    ) {
        Toast.makeText(
            localContext,
            mensagem,
            Toast.LENGTH_SHORT
        ).show()
    }
}