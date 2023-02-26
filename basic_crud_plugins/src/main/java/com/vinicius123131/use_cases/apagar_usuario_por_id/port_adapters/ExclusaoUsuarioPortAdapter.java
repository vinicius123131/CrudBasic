package com.vinicius123131.use_cases.apagar_usuario_por_id.port_adapters;

import com.vinicius123131.data_base_configurations.repositories.SaltTableEntityRepository;
import com.vinicius123131.data_base_configurations.repositories.SecretTableEntityRepository;
import com.vinicius123131.data_base_configurations.repositories.UsuarioTableEntityRepository;
import com.vinicius123131.use_cases.apagar_usuario_por_id.implementations.ports.ExclusaoUsuarioPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ExclusaoUsuarioPortAdapter implements ExclusaoUsuarioPort {

    private final UsuarioTableEntityRepository usuarioTableEntityRepository;
    private final SaltTableEntityRepository saltTableEntityRepository;
    private final SecretTableEntityRepository secretTableEntityRepository;
    @Override
    public void execute(Long input) {
        this.usuarioTableEntityRepository.deleteById(input);
        this.saltTableEntityRepository.deleteById(input);
        this.secretTableEntityRepository.deleteById(input);
    }
}
