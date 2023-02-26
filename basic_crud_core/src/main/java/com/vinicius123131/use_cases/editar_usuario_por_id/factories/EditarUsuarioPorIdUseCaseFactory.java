package com.vinicius123131.use_cases.editar_usuario_por_id.factories;

import com.vinicius123131.use_cases.editar_usuario_por_id.EditarUsuarioPorId;
import com.vinicius123131.use_cases.editar_usuario_por_id.implementations.EditarUsuarioPorIdImplementation;
import com.vinicius123131.use_cases.editar_usuario_por_id.implementations.ports.EdicaoUsuarioPort;
import com.vinicius123131.use_cases.editar_usuario_por_id.implementations.ports.VerificacaoPreExistenciaParaEdicaoUsuarioPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EditarUsuarioPorIdUseCaseFactory {

    private final VerificacaoPreExistenciaParaEdicaoUsuarioPort verificacaoPreExistenciaParaEdicaoUsuarioPort;

    private final EdicaoUsuarioPort edicaoUsuarioPort;

    public EditarUsuarioPorId makeInstance(){
        return new EditarUsuarioPorIdImplementation(this.verificacaoPreExistenciaParaEdicaoUsuarioPort, this.edicaoUsuarioPort);
    }
}
