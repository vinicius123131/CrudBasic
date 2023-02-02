package com.vinicius123131.entities;

import com.vinicius123131.entities.contracts.EntidadeComValidacaoDePropriedades;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Usuario implements EntidadeComValidacaoDePropriedades {

    protected Long id;
    protected String nome;
    protected  Telefone telefone;
    protected Email email;
    protected Senha senha;
}
