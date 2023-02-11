package com.vinicius123131.data_base_configurations.repositories;

import com.vinicius123131.data_base_configurations.table_entities.UsuarioTableEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioTableEntityRepository extends JpaRepository<UsuarioTableEntity, Long> {
}
