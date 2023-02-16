package com.vinicius123131.use_cases.criar_novo_usuario.rest_endpoints.contracts.input.mappers;

import com.vinicius123131.entities.Usuario;
import com.vinicius123131.entities.factories.EmailsFactory;
import com.vinicius123131.entities.factories.SenhasFactory;
import com.vinicius123131.entities.factories.TelefonesFactory;
import com.vinicius123131.entities.factories.UsuariosFactory;
import com.vinicius123131.use_cases.criar_novo_usuario.rest_endpoints.contracts.input.CriarNovoUsuarioPorIdRestEndpointInput;
import org.springframework.stereotype.Component;

@Component
public class CriarNovoUsuarioPorIdRestEndpointInputMapper {

    public Usuario map(CriarNovoUsuarioPorIdRestEndpointInput restEndpointInput){
        var email = new EmailsFactory().makeInstance();
        email.setEndereco(restEndpointInput.getEmail());
        var senha = new SenhasFactory().makeInstance();
        senha.setDesencriptado(restEndpointInput.getSenha());
        var telefone = new TelefonesFactory().makeInstance();
        telefone.setNumero(restEndpointInput.getTelefone());
        var usuario = new UsuariosFactory().makeInstance();
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuario.setTelefone(telefone);
        usuario.setNome(restEndpointInput.getNome());
        return usuario;
    }
}
