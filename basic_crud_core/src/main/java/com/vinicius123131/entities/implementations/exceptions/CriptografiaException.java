package com.vinicius123131.entities.implementations.exceptions;

import java.security.GeneralSecurityException;

public class CriptografiaException extends RuntimeException{

    public CriptografiaException(GeneralSecurityException e){
        super("Algo deu errado ao tentar criptografar. mais detalhes "+ e.getMessage());
    }
}
