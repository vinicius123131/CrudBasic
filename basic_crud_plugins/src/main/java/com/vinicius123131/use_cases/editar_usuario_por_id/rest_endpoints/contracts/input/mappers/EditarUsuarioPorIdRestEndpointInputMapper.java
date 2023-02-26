package com.vinicius123131.use_cases.editar_usuario_por_id.rest_endpoints.contracts.input.mappers;

import com.vinicius123131.data_base_configurations.repositories.UsuarioTableEntityRepository;
import com.vinicius123131.data_base_configurations.table_entities.mappers.UsuarioTableEntityMapper;
import com.vinicius123131.entities.Usuario;
import com.vinicius123131.use_cases.editar_usuario_por_id.rest_endpoints.contracts.input.EditarUsuarioPorIdRestEndpointInput;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class EditarUsuarioPorIdRestEndpointInputMapper {

    private final UsuarioTableEntityRepository usuarioTableEntityRepository;
    private final UsuarioTableEntityMapper usuarioTableEntityMapper;

    public Usuario map(EditarUsuarioPorIdRestEndpointInput restEndpointInput){
        var usuarioBusca = usuarioTableEntityRepository.findById(restEndpointInput.getId());
        var usuario = this.usuarioTableEntityMapper.mapToBusinessEntity(usuarioBusca.get());
        usuario.setNome(restEndpointInput.getNome());
        return usuario;
    }
}
