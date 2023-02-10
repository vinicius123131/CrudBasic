package com.vinicius123131.use_cases.buscar_usuario.implementations.ports;

import com.vinicius123131.entities.Usuario;
import com.vinicius123131.use_cases.contracts.FunctionPort;

public interface PesquisaUsuarioPorIdPort extends FunctionPort<Long, Usuario> {
}
