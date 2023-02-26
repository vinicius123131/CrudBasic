package com.vinicius123131.use_cases.apagar_usuario_por_id.implementations.ports;

import com.vinicius123131.use_cases.contracts.FunctionPort;

public interface VerificacaoPreExistenciaUsuarioPort extends FunctionPort<Long, Boolean> {
}
