package com.vinicius123131.data_base_configurations.table_entities.mappers;

import com.vinicius123131.data_base_configurations.table_entities.UsuarioTableEntity;
import com.vinicius123131.entities.Email;
import com.vinicius123131.entities.Telefone;
import com.vinicius123131.entities.Usuario;
import com.vinicius123131.entities.factories.EmailsFactory;
import com.vinicius123131.entities.factories.TelefonesFactory;
import com.vinicius123131.entities.factories.UsuariosFactory;
import org.springframework.stereotype.Component;

@Component
public class UsuarioTableEntityMapper {

    public Usuario mapToBusinessEntity(UsuarioTableEntity usuarioTableEntity){
        var usuario = new UsuariosFactory().makeInstance();
        usuario.setNome(usuarioTableEntity.getName());
        usuario.setEmail(this.mapEmailFrom(usuarioTableEntity));
        usuario.setTelefone(this.mapTelefoneFrom(usuarioTableEntity));
        usuario.setId(usuarioTableEntity.getId());

        return usuario;
    }

    private Email mapEmailFrom(UsuarioTableEntity usuarioTableEntity){
        var email = new EmailsFactory().makeInstance();
        email.setEndereco(usuarioTableEntity.getEmail());
        return email;
    }
    private Telefone mapTelefoneFrom(UsuarioTableEntity usuarioTableEntity){
        var telefone = new TelefonesFactory().makeInstance();
        telefone.setNumero(usuarioTableEntity.getTelefone());
        return telefone;
    }
    public UsuarioTableEntity mapToTableEntity(Usuario usuario){
        return UsuarioTableEntity.builder()
                .id(usuario.getId())
                .name(usuario.getNome())
                .email(usuario.getEmail().getEndereco())
                .telefone(usuario.getTelefone().getNumero())
                .build();
    }

}
