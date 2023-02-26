package com.vinicius123131.use_cases.editar_usuario_por_id.port_adapters;

import com.vinicius123131.data_base_configurations.repositories.UsuarioTableEntityRepository;
import com.vinicius123131.data_base_configurations.table_entities.mappers.UsuarioTableEntityMapper;
import com.vinicius123131.entities.Usuario;
import com.vinicius123131.use_cases.editar_usuario_por_id.implementations.ports.EdicaoUsuarioPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EdicaoUsuarioPortAdapter implements EdicaoUsuarioPort{
    private final UsuarioTableEntityRepository usuarioTableEntityRepository;
    private final UsuarioTableEntityMapper usuarioTableEntityMapper;

    @Override
    public Usuario execute(Usuario input) {
        var usuario = this.usuarioTableEntityRepository.save(usuarioTableEntityMapper.mapToTableEntity(input));
        return this.usuarioTableEntityMapper.mapToBusinessEntity(usuario);
    }
}
