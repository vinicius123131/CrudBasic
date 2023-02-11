package com.vinicius123131.data_base_configurations.table_entities.mappers;

import com.vinicius123131.data_base_configurations.table_entities.SaltTableEntity;
import com.vinicius123131.entities.Senha;
import org.springframework.stereotype.Component;

import java.util.Base64;

@Component
public class SaltTableEntityMapper {

    public SaltTableEntity map(Senha senha){
        return SaltTableEntity.builder()
                .id(senha.getDono())
                .salt(Base64.getEncoder().encodeToString(senha.getSal()))
                .build();
    }

    public void mapSaltIntoPassword(SaltTableEntity saltTableEntity, Senha senha){
        senha.setSal(Base64.getDecoder().decode(saltTableEntity.getSalt()));
    }
}
