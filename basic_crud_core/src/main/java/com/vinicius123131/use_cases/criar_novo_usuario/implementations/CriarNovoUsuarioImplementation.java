package com.vinicius123131.use_cases.criar_novo_usuario.implementations;

import com.vinicius123131.entities.Usuario;
import com.vinicius123131.use_cases.criar_novo_usuario.CriarNovoUsuario;
import com.vinicius123131.use_cases.criar_novo_usuario.implementations.exceptions.UsuarioComPropriedadesInvalidasException;
import com.vinicius123131.use_cases.criar_novo_usuario.implementations.ports.ArmazenamentoUsuarioPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CriarNovoUsuarioImplementation implements CriarNovoUsuario {
    private final ArmazenamentoUsuarioPort armazenamentoUsuarioPort;

    @Override
    public Usuario execute(Usuario usuario) {
        if(usuario.temPropriedadesValidas())
            return this.armazenamentoUsuarioPort.execute(usuario);
        throw new UsuarioComPropriedadesInvalidasException();
    }
}
