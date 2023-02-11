package com.vinicius123131.data_base_configurations.table_entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SaltTableEntity {

    @Id
    private Long id;
    private String salt;
}
