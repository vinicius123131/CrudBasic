package com.vinicius123131.entities.factories;

import com.vinicius123131.entities.Senha;
import com.vinicius123131.entities.factories.contracts.EntidadesFactory;
import com.vinicius123131.entities.implementations.SenhaImplementation;

public class SenhasFactory implements EntidadesFactory<Senha> {
    @Override
    public Senha makeInstance() {
        return new SenhaImplementation();
    }
}
