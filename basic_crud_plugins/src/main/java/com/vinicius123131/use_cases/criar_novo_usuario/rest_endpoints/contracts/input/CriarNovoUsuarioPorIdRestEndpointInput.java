package com.vinicius123131.use_cases.criar_novo_usuario.rest_endpoints.contracts.input;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CriarNovoUsuarioPorIdRestEndpointInput {

    protected String nome;
    protected String email;
    protected String senha;
    protected String telefone;
}
