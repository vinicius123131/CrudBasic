package com.vinicius123131.entities.factories;

import com.vinicius123131.entities.Telefone;
import com.vinicius123131.entities.factories.contracts.EntidadesFactory;
import com.vinicius123131.entities.implementations.BrazilianTelefoneImplementation;

public class TelefonesFactory implements EntidadesFactory<Telefone> {
    @Override
    public Telefone makeInstance() {
        return new BrazilianTelefoneImplementation();
    }
}
