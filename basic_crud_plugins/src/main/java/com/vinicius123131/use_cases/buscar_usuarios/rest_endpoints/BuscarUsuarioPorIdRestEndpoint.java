package com.vinicius123131.use_cases.buscar_usuarios.rest_endpoints;

import com.vinicius123131.rest_configurations.Resources;
import com.vinicius123131.use_cases.buscar_usuario.BuscarUsuarioPorId;
import com.vinicius123131.use_cases.buscar_usuarios.rest_endpoints.contracts.output.BuscarUsuarioPorIdRestEndpointOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Resources.USERS)
@RequiredArgsConstructor
public class BuscarUsuarioPorIdRestEndpoint {

    private final BuscarUsuarioPorId buscarUsuarioPorId;

    @GetMapping(Resources.FIND_ID)
    public ResponseEntity<BuscarUsuarioPorIdRestEndpointOutput> buscarUsuarioPorId(@PathVariable(name = Resources.ID) Long idUsuario){
        var usuarioBuscado = this.buscarUsuarioPorId.execute(idUsuario);
        return ResponseEntity
                .status(200)
                .body(BuscarUsuarioPorIdRestEndpointOutput.of(usuarioBuscado));
    }
}
