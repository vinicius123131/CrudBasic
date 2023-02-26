package com.vinicius123131.use_cases.buscar_usuarios.use_case_provider;

import com.vinicius123131.use_cases.buscar_usuario.BuscarUsuarioPorId;
import com.vinicius123131.use_cases.buscar_usuario.factories.BuscarUsuarioPorIdUseCaseFactory;
import com.vinicius123131.use_cases.buscar_usuario.implementations.ports.PesquisaUsuarioPorIdPort;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BuscarUsuarioPorIdUseCaseProvider {

    private final PesquisaUsuarioPorIdPort pesquisaUsuarioPorIdPort;

    @Bean
    public BuscarUsuarioPorId buscarUsuarioPorId(){
        return new BuscarUsuarioPorIdUseCaseFactory(this.pesquisaUsuarioPorIdPort).makeInstance();
    }
}
