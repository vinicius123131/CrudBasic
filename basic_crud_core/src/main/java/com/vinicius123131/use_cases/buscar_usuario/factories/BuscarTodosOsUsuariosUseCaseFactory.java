package com.vinicius123131.use_cases.buscar_usuario.factories;

import com.vinicius123131.use_cases.buscar_usuario.BuscarTodosOsUsuarios;
import com.vinicius123131.use_cases.buscar_usuario.implementations.BuscarTodosOsUsuariosImplementation;
import com.vinicius123131.use_cases.buscar_usuario.implementations.ports.PesquisarTodosOsUsuariosPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BuscarTodosOsUsuariosUseCaseFactory {

    private final PesquisarTodosOsUsuariosPort pesquisarTodosOsUsuariosPort;

    public BuscarTodosOsUsuarios makeInstance(){
        return new BuscarTodosOsUsuariosImplementation(this.pesquisarTodosOsUsuariosPort);
    }
}
