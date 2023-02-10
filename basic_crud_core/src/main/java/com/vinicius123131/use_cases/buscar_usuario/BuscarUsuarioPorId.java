package com.vinicius123131.use_cases.buscar_usuario;

import com.vinicius123131.entities.Usuario;
import com.vinicius123131.use_cases.contracts.FunctionUseCase;

public interface BuscarUsuarioPorId extends FunctionUseCase<Long, Usuario> {
}
