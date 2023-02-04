package com.vinicius123131.entities.factories;

import com.vinicius123131.entities.Usuario;
import com.vinicius123131.entities.factories.contracts.EntidadesFactory;
import com.vinicius123131.entities.implementations.SenhaImplementation;
import com.vinicius123131.entities.implementations.UsuarioImplementation;

public class UsuariosFactory implements EntidadesFactory<Usuario> {
    @Override
    public Usuario makeInstance() {
        return new UsuarioImplementation();
    }
}
