package com.vinicius123131.use_cases.buscar_usuarios.port_adapters;

import com.vinicius123131.data_base_configurations.repositories.UsuarioTableEntityRepository;
import com.vinicius123131.data_base_configurations.table_entities.UsuarioTableEntity;
import com.vinicius123131.data_base_configurations.table_entities.mappers.UsuarioTableEntityMapper;
import com.vinicius123131.entities.Usuario;
import com.vinicius123131.use_cases.buscar_usuario.implementations.ports.PesquisarTodosOsUsuariosPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class BuscarTodosOsUsuariosPortAdapter implements PesquisarTodosOsUsuariosPort {

    private final UsuarioTableEntityRepository usuarioTableEntityRepository;
    private final UsuarioTableEntityMapper usuarioTableEntityMapper;
    @Override
    public List<Usuario> execute() {
        var usuarioTableEntities = this.usuarioTableEntityRepository.findAll();
        List<Usuario> usuarios = new ArrayList<>();
        for (UsuarioTableEntity usuarioTableEntity:usuarioTableEntities){
            usuarios.add(this.usuarioTableEntityMapper.mapToBusinessEntity(usuarioTableEntity));
        }
        return usuarios;
    }
}
