package com.vinicius123131.use_cases.buscar_usuario.factories;

import com.vinicius123131.use_cases.buscar_usuario.BuscarUsuarioPorId;
import com.vinicius123131.use_cases.buscar_usuario.implementations.BuscarUsuarioPorIdImplementation;
import com.vinicius123131.use_cases.buscar_usuario.implementations.ports.PesquisaUsuarioPorIdPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BuscarUsuarioPorIdUseCaseFactory {

    private final PesquisaUsuarioPorIdPort pesquisaUsuarioPorIdPort;

    public BuscarUsuarioPorId makeInstance(){
        return new BuscarUsuarioPorIdImplementation(this.pesquisaUsuarioPorIdPort);
    }

}
