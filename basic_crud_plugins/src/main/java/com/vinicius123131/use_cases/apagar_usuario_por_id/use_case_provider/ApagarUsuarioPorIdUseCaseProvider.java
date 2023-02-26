package com.vinicius123131.use_cases.apagar_usuario_por_id.use_case_provider;

import com.vinicius123131.use_cases.apagar_usuario_por_id.ApagarUsuarioPorId;
import com.vinicius123131.use_cases.apagar_usuario_por_id.factories.ApagarUsuarioPorIdUseCaseFactory;
import com.vinicius123131.use_cases.apagar_usuario_por_id.port_adapters.ExclusaoUsuarioPortAdapter;
import com.vinicius123131.use_cases.apagar_usuario_por_id.port_adapters.VerificacaoPreExistenciaUsuarioPortAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class ApagarUsuarioPorIdUseCaseProvider {

    private final VerificacaoPreExistenciaUsuarioPortAdapter verificacaoPreExistenciaUsuarioPortAdapter;
    private final ExclusaoUsuarioPortAdapter exclusaoUsuarioPortAdapter;

    @Bean
    public ApagarUsuarioPorId apagarUsuarioPorId(){
        return new ApagarUsuarioPorIdUseCaseFactory(
                this.verificacaoPreExistenciaUsuarioPortAdapter, this.exclusaoUsuarioPortAdapter
        ).makeInstance();
    }


}
