package com.vinicius123131.entities;

import com.vinicius123131.entities.contracts.EntidadeComMensagemDeErroPossivel;
import com.vinicius123131.entities.contracts.EntidadeComValidacaoDePropriedades;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Telefone implements EntidadeComValidacaoDePropriedades, EntidadeComMensagemDeErroPossivel {
    protected String numero;
    protected Boolean isMobile;
}
