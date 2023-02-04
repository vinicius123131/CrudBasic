package com.vinicius123131.entities.factories;

import com.vinicius123131.entities.Email;
import com.vinicius123131.entities.factories.contracts.EntidadesFactory;
import com.vinicius123131.entities.implementations.EmailImplementation;

public class EmailsFactory implements EntidadesFactory<Email> {
    @Override
    public Email makeInstance() {
        return new EmailImplementation();
    }
}
