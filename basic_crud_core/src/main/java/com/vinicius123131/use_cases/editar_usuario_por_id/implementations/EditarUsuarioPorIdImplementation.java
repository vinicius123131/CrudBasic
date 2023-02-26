package com.vinicius123131.use_cases.editar_usuario_por_id.implementations;

import com.vinicius123131.entities.Usuario;
import com.vinicius123131.use_cases.editar_usuario_por_id.EditarUsuarioPorId;
import com.vinicius123131.use_cases.editar_usuario_por_id.implementations.exceptions.UsuarioNaoEncontradoAoTentarEditarException;
import com.vinicius123131.use_cases.editar_usuario_por_id.implementations.ports.EdicaoUsuarioPort;
import com.vinicius123131.use_cases.editar_usuario_por_id.implementations.ports.VerificacaoPreExistenciaParaEdicaoUsuarioPort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EditarUsuarioPorIdImplementation implements EditarUsuarioPorId {

    private final VerificacaoPreExistenciaParaEdicaoUsuarioPort verificacaoPreExistenciaParaEdicaoUsuarioPort;

    private final EdicaoUsuarioPort edicaoUsuarioPort;

    @Override
    public Usuario execute(Usuario input) {
        if(this.verificacaoPreExistenciaParaEdicaoUsuarioPort.execute(input.getId()))
            return this.edicaoUsuarioPort.execute(input);
        throw new UsuarioNaoEncontradoAoTentarEditarException(input.getId());
    }
}
