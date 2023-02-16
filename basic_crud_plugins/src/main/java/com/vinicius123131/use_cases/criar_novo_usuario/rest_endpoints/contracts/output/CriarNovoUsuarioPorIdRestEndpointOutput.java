package com.vinicius123131.use_cases.criar_novo_usuario.rest_endpoints.contracts.output;

import com.vinicius123131.entities.Usuario;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CriarNovoUsuarioPorIdRestEndpointOutput {

    private final Long idUsuarioRecemCriado;

    public static CriarNovoUsuarioPorIdRestEndpointOutput of (Usuario usuarioRecemCriado){
        return new CriarNovoUsuarioPorIdRestEndpointOutput(usuarioRecemCriado.getId());
    }
}
