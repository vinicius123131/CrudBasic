package com.vinicius123131.data_base_configurations.repositories;

import com.vinicius123131.data_base_configurations.table_entities.SaltTableEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaltTableEntityRepository extends JpaRepository<SaltTableEntity, Long> {
}
