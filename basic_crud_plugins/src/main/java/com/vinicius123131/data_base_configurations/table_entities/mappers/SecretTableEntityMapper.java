package com.vinicius123131.data_base_configurations.table_entities.mappers;

import com.vinicius123131.data_base_configurations.table_entities.SecretTableEntity;
import com.vinicius123131.entities.Senha;
import com.vinicius123131.entities.factories.SenhasFactory;
import org.springframework.stereotype.Component;

@Component
public class SecretTableEntityMapper {

    public SecretTableEntity mapToTableEntity(Senha senha){
        return SecretTableEntity.builder()
                .secret(senha.getEncriptado())
                .id(senha.getDono())
                .build();
    }

    public Senha mapToBusinessEntity(SecretTableEntity secretTableEntity){
        var senha = new SenhasFactory().makeInstance();
        senha.setEncriptado(secretTableEntity.getSecret());
        senha.setDono(secretTableEntity.getId());
        return senha;
    }
}
