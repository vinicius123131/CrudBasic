package com.vinicius123131.use_cases.buscar_usuarios.rest_endpoints.contracts.output;

import com.vinicius123131.entities.Usuario;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Component
public class BuscarTodosOsUsuariosRestEndpointOutput {

    private List<String> usuarios;


    public static BuscarTodosOsUsuariosRestEndpointOutput of(List<Usuario> usuariosEncontrados) {
        List<String> usuarios = new ArrayList<>();
        for (Usuario usuario : usuariosEncontrados) {
            usuarios.add(usuario.getNome());
        }
        return new BuscarTodosOsUsuariosRestEndpointOutput(usuarios);
    }
}
