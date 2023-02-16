package com.vinicius123131.use_cases.criar_novo_usuario.factories;

import com.vinicius123131.use_cases.criar_novo_usuario.CriarNovoUsuario;
import com.vinicius123131.use_cases.criar_novo_usuario.implementations.CriarNovoUsuarioImplementation;
import com.vinicius123131.use_cases.criar_novo_usuario.implementations.ports.ArmazenamentoUsuarioPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CriarNovoUsuarioUseCaseFactory {

    private final ArmazenamentoUsuarioPort armazenamentoUsuarioPort;

    public CriarNovoUsuario makeInstance(){
        return new CriarNovoUsuarioImplementation(this.armazenamentoUsuarioPort);
    }

}
