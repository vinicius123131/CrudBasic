package com.vinicius123131.use_cases.editar_usuario_por_id.rest_endpoints;

import com.vinicius123131.rest_configurations.Resources;
import com.vinicius123131.use_cases.editar_usuario_por_id.EditarUsuarioPorId;
import com.vinicius123131.use_cases.editar_usuario_por_id.rest_endpoints.contracts.input.EditarUsuarioPorIdRestEndpointInput;
import com.vinicius123131.use_cases.editar_usuario_por_id.rest_endpoints.contracts.input.mappers.EditarUsuarioPorIdRestEndpointInputMapper;
import com.vinicius123131.use_cases.editar_usuario_por_id.rest_endpoints.contracts.output.EditarUsuarioPorIdRestEndpointOutput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(Resources.USERS)
@RequiredArgsConstructor
public class EditarUsuarioPorIdRestEndpoint {

    private final EditarUsuarioPorId editarUsuarioPorId;

    private final EditarUsuarioPorIdRestEndpointInputMapper editarUsuarioPorIdRestEndpointInputMapper;

    @PutMapping(Resources.FIND_ID)
    public ResponseEntity<EditarUsuarioPorIdRestEndpointOutput> editarUsuarioPorId(@PathVariable(name = Resources.ID) Long id, @RequestBody EditarUsuarioPorIdRestEndpointInput restEndpointInput){
        var usuarioEditado = this.editarUsuarioPorId.execute(this.editarUsuarioPorIdRestEndpointInputMapper.map(restEndpointInput));
        return ResponseEntity
                .status(204)
                .body(EditarUsuarioPorIdRestEndpointOutput.of(usuarioEditado));
    }
}
