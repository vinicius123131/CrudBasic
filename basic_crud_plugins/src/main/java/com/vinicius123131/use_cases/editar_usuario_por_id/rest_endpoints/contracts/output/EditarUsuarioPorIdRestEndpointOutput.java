package com.vinicius123131.use_cases.editar_usuario_por_id.rest_endpoints.contracts.output;

import com.vinicius123131.entities.Usuario;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class EditarUsuarioPorIdRestEndpointOutput {

    private final Long idUsuario;
    private final String nameUsuario;

    public static EditarUsuarioPorIdRestEndpointOutput of(Usuario usuario){
        return new EditarUsuarioPorIdRestEndpointOutput(usuario.getId(), usuario.getNome());
    }
}
