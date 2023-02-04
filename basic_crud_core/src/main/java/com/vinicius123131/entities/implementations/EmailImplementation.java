package com.vinicius123131.entities.implementations;

import com.vinicius123131.entities.Email;
import com.vinicius123131.entities.implementations.validation_rules.EmailValidationRule;

import java.util.regex.Pattern;

public class EmailImplementation extends Email {
    @Override
    public Boolean temPropriedadesValidas() {
        return Pattern.compile(EmailValidationRule.REGEX).matcher(this.endereco).matches();
    }
}
