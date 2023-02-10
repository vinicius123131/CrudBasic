package com.vinicius123131.use_cases.buscar_usuario.implementations;

import com.vinicius123131.entities.Usuario;
import com.vinicius123131.use_cases.buscar_usuario.BuscarUsuarioPorId;
import com.vinicius123131.use_cases.buscar_usuario.implementations.exceptions.UsuarioNaoEncontradoAoBuscarPorIdException;
import com.vinicius123131.use_cases.buscar_usuario.implementations.ports.PesquisaUsuarioPorIdPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BuscarUsuarioPorIdImplementation implements BuscarUsuarioPorId {

    private final PesquisaUsuarioPorIdPort pesquisaUsuarioPorIdPort;
    @Override
    public Usuario execute(Long input) {
        try{
            return this.pesquisaUsuarioPorIdPort.execute(input);
        }catch (RuntimeException e){
            throw new UsuarioNaoEncontradoAoBuscarPorIdException(input);
        }
    }
}
