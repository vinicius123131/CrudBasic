package com.vinicius123131.use_cases.criar_novo_usuario.rest_endpoints;

import com.vinicius123131.rest_configurations.Resources;
import com.vinicius123131.use_cases.criar_novo_usuario.CriarNovoUsuario;
import com.vinicius123131.use_cases.criar_novo_usuario.rest_endpoints.contracts.input.CriarNovoUsuarioPorIdRestEndpointInput;
import com.vinicius123131.use_cases.criar_novo_usuario.rest_endpoints.contracts.input.mappers.CriarNovoUsuarioPorIdRestEndpointInputMapper;
import com.vinicius123131.use_cases.criar_novo_usuario.rest_endpoints.contracts.output.CriarNovoUsuarioPorIdRestEndpointOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Resources.USERS)
@RequiredArgsConstructor
public class CriarNovoUsuarioPorIdRestEndpoint {
    private final CriarNovoUsuario criarNovoUsuario;
    private final CriarNovoUsuarioPorIdRestEndpointInputMapper criarNovoUsuarioPorIdRestEndpointInputMapper;

    @PostMapping
    public ResponseEntity<CriarNovoUsuarioPorIdRestEndpointOutput> criarNovoUsuario(@RequestBody CriarNovoUsuarioPorIdRestEndpointInput input){
        var usuarioRecemCriado = this.criarNovoUsuario.execute(this.criarNovoUsuarioPorIdRestEndpointInputMapper.map(input));
        return ResponseEntity
                .status(201)
                .body(CriarNovoUsuarioPorIdRestEndpointOutput.of(usuarioRecemCriado));
    }
}
