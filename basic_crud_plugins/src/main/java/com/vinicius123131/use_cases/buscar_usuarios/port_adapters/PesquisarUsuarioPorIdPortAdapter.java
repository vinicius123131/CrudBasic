package com.vinicius123131.use_cases.buscar_usuarios.port_adapters;

import com.vinicius123131.data_base_configurations.repositories.UsuarioTableEntityRepository;
import com.vinicius123131.data_base_configurations.table_entities.mappers.UsuarioTableEntityMapper;
import com.vinicius123131.entities.Usuario;
import com.vinicius123131.use_cases.buscar_usuario.implementations.exceptions.UsuarioNaoEncontradoAoBuscarPorIdException;
import com.vinicius123131.use_cases.buscar_usuario.implementations.ports.PesquisaUsuarioPorIdPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PesquisarUsuarioPorIdPortAdapter implements PesquisaUsuarioPorIdPort {

    private final UsuarioTableEntityRepository usuarioTableEntityRepository;
    private final UsuarioTableEntityMapper usuarioTableEntityMapper;
    @Override
    public Usuario execute(Long input) {
        var usuario = this.usuarioTableEntityRepository.findById(input);
        if (usuario.isPresent())
            return this.usuarioTableEntityMapper.mapToBusinessEntity(usuario.get());
        throw new UsuarioNaoEncontradoAoBuscarPorIdException(input);
    }
}
