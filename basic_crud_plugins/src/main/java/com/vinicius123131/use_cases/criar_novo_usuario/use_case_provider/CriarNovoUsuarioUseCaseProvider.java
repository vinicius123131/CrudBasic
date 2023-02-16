package com.vinicius123131.use_cases.criar_novo_usuario.use_case_provider;

import com.vinicius123131.use_cases.criar_novo_usuario.CriarNovoUsuario;
import com.vinicius123131.use_cases.criar_novo_usuario.factories.CriarNovoUsuarioUseCaseFactory;
import com.vinicius123131.use_cases.criar_novo_usuario.port_adapters.ArmazenamentoUsuarioPortAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class CriarNovoUsuarioUseCaseProvider {

    private final ArmazenamentoUsuarioPortAdapter armazenamentoUsuarioPortAdapter;

    @Bean
    public CriarNovoUsuario criarNovoUsuario(){
        return new CriarNovoUsuarioUseCaseFactory(this.armazenamentoUsuarioPortAdapter).makeInstance();
    }
}
