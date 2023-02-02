package com.vinicius123131.entities;

import com.vinicius123131.entities.contracts.EntidadeComValidacaoDePropriedades;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Email implements EntidadeComValidacaoDePropriedades {
    protected String endereco;
}
