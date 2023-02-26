package com.vinicius123131.use_cases.buscar_usuario.implementations;

import com.vinicius123131.entities.Usuario;
import com.vinicius123131.use_cases.buscar_usuario.BuscarTodosOsUsuarios;
import com.vinicius123131.use_cases.buscar_usuario.implementations.ports.PesquisarTodosOsUsuariosPort;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class BuscarTodosOsUsuariosImplementation implements BuscarTodosOsUsuarios {

    private final PesquisarTodosOsUsuariosPort pesquisarTodosOsUsuariosPort;
    @Override
    public List<Usuario> execute() {
        return this.pesquisarTodosOsUsuariosPort.execute();
    }
}
