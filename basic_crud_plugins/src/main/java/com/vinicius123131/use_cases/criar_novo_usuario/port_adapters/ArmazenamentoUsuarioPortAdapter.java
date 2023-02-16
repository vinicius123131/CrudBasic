package com.vinicius123131.use_cases.criar_novo_usuario.port_adapters;

import com.vinicius123131.data_base_configurations.repositories.SaltTableEntityRepository;
import com.vinicius123131.data_base_configurations.repositories.SecretTableEntityRepository;
import com.vinicius123131.data_base_configurations.repositories.UsuarioTableEntityRepository;
import com.vinicius123131.data_base_configurations.table_entities.mappers.SaltTableEntityMapper;
import com.vinicius123131.data_base_configurations.table_entities.mappers.SecretTableEntityMapper;
import com.vinicius123131.data_base_configurations.table_entities.mappers.UsuarioTableEntityMapper;
import com.vinicius123131.entities.Usuario;
import com.vinicius123131.use_cases.contracts.FunctionPort;
import com.vinicius123131.use_cases.criar_novo_usuario.implementations.ports.ArmazenamentoUsuarioPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ArmazenamentoUsuarioPortAdapter implements ArmazenamentoUsuarioPort {
    private final UsuarioTableEntityMapper usuarioTableEntityMapper;
    private final UsuarioTableEntityRepository usuarioTableEntityRepository;
    private final SecretTableEntityMapper secretTableEntityMapper;
    private final SecretTableEntityRepository secretTableEntityRepository;
    private final SaltTableEntityMapper saltTableEntityMapper;
    private final SaltTableEntityRepository saltTableEntityRepository;

    @Override
    public Usuario execute(Usuario input) {
        var usuario = this.usuarioTableEntityMapper.mapToTableEntity(input);
        usuario = this.usuarioTableEntityRepository.save(usuario);
        input.getSenha().setDono(usuario.getId());
        var senha = this.secretTableEntityMapper.mapToTableEntity(input.getSenha());
        this.secretTableEntityRepository.save(senha);
        var salt = this.saltTableEntityMapper.map(input.getSenha());
        this.saltTableEntityRepository.save(salt);
        return this.usuarioTableEntityMapper.mapToBusinessEntity(usuario);
    }
}
