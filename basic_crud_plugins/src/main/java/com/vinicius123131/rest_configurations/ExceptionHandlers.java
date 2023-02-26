package com.vinicius123131.rest_configurations;

import com.vinicius123131.use_cases.apagar_usuario_por_id.implementations.exceptions.UsuarioNaoEncontradoAoTentarApagarException;
import com.vinicius123131.use_cases.buscar_usuario.implementations.exceptions.UsuarioNaoEncontradoAoBuscarPorIdException;
import com.vinicius123131.use_cases.criar_novo_usuario.implementations.exceptions.UsuarioComPropriedadesInvalidasException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlers {

    @ExceptionHandler(UsuarioComPropriedadesInvalidasException.class)
    public ResponseEntity<ExceptionHandlerMessage> handler(UsuarioComPropriedadesInvalidasException exception){
        return ResponseEntity.status(400).body(new ExceptionHandlerMessage(exception.getMessage()));
    }

    @ExceptionHandler(UsuarioNaoEncontradoAoBuscarPorIdException.class)
    public ResponseEntity<ExceptionHandlerMessage> handle(UsuarioNaoEncontradoAoBuscarPorIdException exception){
        return ResponseEntity.status(404).body(new ExceptionHandlerMessage(exception.getMessage()));
    }
    @ExceptionHandler(UsuarioNaoEncontradoAoTentarApagarException.class)
    public ResponseEntity<ExceptionHandlerMessage> handle(UsuarioNaoEncontradoAoTentarApagarException exception){
        return ResponseEntity.status(404).body(new ExceptionHandlerMessage(exception.getMessage()));
    }
    @AllArgsConstructor
    @Getter
    private static class ExceptionHandlerMessage{
        private final String message;
  }
}
