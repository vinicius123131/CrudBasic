package com.vinicius123131.use_cases.apagar_usuario_por_id.rest_endpoints;

import com.vinicius123131.rest_configurations.Resources;
import com.vinicius123131.use_cases.apagar_usuario_por_id.ApagarUsuarioPorId;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Resources.USERS)
@RequiredArgsConstructor
public class ApagarUsuarioPorIdRestEndpoint {

    private final ApagarUsuarioPorId apagarUsuarioPorId;

    @DeleteMapping(Resources.FIND_ID)
    public ResponseEntity<Void> apagarUsuarioPorId(@PathVariable(name = Resources.ID) long id){
        this.apagarUsuarioPorId.execute(id);
        return ResponseEntity.noContent().build();
    }
}
