package com.vinicius123131.use_cases.buscar_usuarios.rest_endpoints;

import com.vinicius123131.rest_configurations.Resources;
import com.vinicius123131.use_cases.buscar_usuario.BuscarTodosOsUsuarios;
import com.vinicius123131.use_cases.buscar_usuarios.rest_endpoints.contracts.output.BuscarTodosOsUsuariosRestEndpointOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Resources.USERS)
@RequiredArgsConstructor
public class BuscarTodosOsUsuariosRestEndpoint {

    private final BuscarTodosOsUsuarios buscarTodosOsUsuarios;
    private final BuscarTodosOsUsuariosRestEndpointOutput buscarTodosOsUsuariosRestEndpointOutput;
    @GetMapping()
    public ResponseEntity<BuscarTodosOsUsuariosRestEndpointOutput> buscarTodosOsUsuarios(){
        var usuariosBuscados = this.buscarTodosOsUsuarios.execute();
        return ResponseEntity
                .status(200)
                .body(BuscarTodosOsUsuariosRestEndpointOutput.of(usuariosBuscados));
    }
}
