package com.vinicius123131.data_base_configurations.repositories;

import com.vinicius123131.data_base_configurations.table_entities.SecretTableEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecretTableEntityRepository extends JpaRepository<SecretTableEntity, Long> {
}
