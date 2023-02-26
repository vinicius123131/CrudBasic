package com.vinicius123131.use_cases.apagar_usuario_por_id.implementations.exceptions;

public class UsuarioNaoEncontradoAoTentarApagarException extends RuntimeException {

    public UsuarioNaoEncontradoAoTentarApagarException(Long input){
        super("Usuario de ID " + input + " não encontrado ao tentar busca-lo na base de dados para exclusão");
    }
}
