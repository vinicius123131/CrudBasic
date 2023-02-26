package com.vinicius123131.use_cases.editar_usuario_por_id.use_case_provider;

import com.vinicius123131.use_cases.editar_usuario_por_id.EditarUsuarioPorId;
import com.vinicius123131.use_cases.editar_usuario_por_id.factories.EditarUsuarioPorIdUseCaseFactory;
import com.vinicius123131.use_cases.editar_usuario_por_id.implementations.ports.VerificacaoPreExistenciaParaEdicaoUsuarioPort;
import com.vinicius123131.use_cases.editar_usuario_por_id.port_adapters.EdicaoUsuarioPortAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class EditarUsuarioPorIdUseCaseProvider {

    private final VerificacaoPreExistenciaParaEdicaoUsuarioPort verificacaoPreExistenciaParaEdicaoUsuarioPort;
    private final EdicaoUsuarioPortAdapter edicaoUsuarioPortAdapter;

    @Bean
    public EditarUsuarioPorId editarUsuarioPorId(){
        return new EditarUsuarioPorIdUseCaseFactory(
                this.verificacaoPreExistenciaParaEdicaoUsuarioPort,
                this.edicaoUsuarioPortAdapter
        ).makeInstance();
    }
}
