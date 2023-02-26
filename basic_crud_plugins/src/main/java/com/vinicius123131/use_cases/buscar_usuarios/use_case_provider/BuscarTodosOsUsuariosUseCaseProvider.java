package com.vinicius123131.use_cases.buscar_usuarios.use_case_provider;

import com.vinicius123131.use_cases.buscar_usuario.BuscarTodosOsUsuarios;
import com.vinicius123131.use_cases.buscar_usuario.factories.BuscarTodosOsUsuariosUseCaseFactory;
import com.vinicius123131.use_cases.buscar_usuario.implementations.ports.PesquisarTodosOsUsuariosPort;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BuscarTodosOsUsuariosUseCaseProvider {

    private final PesquisarTodosOsUsuariosPort pesquisarTodosOsUsuariosPort;

    @Bean
    public BuscarTodosOsUsuarios buscarTodosOsUsuarios(){
        return new BuscarTodosOsUsuariosUseCaseFactory(this.pesquisarTodosOsUsuariosPort).makeInstance();
    }
}
