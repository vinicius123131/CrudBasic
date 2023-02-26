package com.vinicius123131.use_cases.buscar_usuario.implementations.ports;

import com.vinicius123131.entities.Usuario;
import com.vinicius123131.use_cases.contracts.SupplierPort;

import java.util.List;

public interface PesquisarTodosOsUsuariosPort extends SupplierPort<List<Usuario>> {
}
