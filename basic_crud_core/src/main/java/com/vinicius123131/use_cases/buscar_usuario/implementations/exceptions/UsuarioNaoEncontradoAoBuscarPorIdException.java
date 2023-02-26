package com.vinicius123131.use_cases.buscar_usuario.implementations.exceptions;

public class UsuarioNaoEncontradoAoBuscarPorIdException extends RuntimeException{

    public UsuarioNaoEncontradoAoBuscarPorIdException(Long id){
        super("Usuario com ID " + id + " não encontrado na base de dados");
    }
}
