package com.vinicius123131.entities.implementations;

import com.vinicius123131.entities.Telefone;

import java.util.Optional;

import static com.vinicius123131.entities.implementations.validation_rules.BrazilianTelefoneValidacaoRule.*;

public class BrazilianTelefoneImplementation extends Telefone {

    private String DDD;
    private String numeroSemDDD;
    private Boolean DDDNaoExtraidoAinda = true;
    private String errorMensagemEmPropriedadesValidacao;
    @Override
    public Boolean temPropriedadesValidas() {
        this.extrairDDD();
        return this.DDDValido() && this.numeroSemDDDValido();
    }

    private Boolean DDDValido(){
        return this.DDDTamanhoValido() && this.DDDValoresPermitidos();
    }
    private Boolean DDDTamanhoValido(){
        if(this.DDD.length() == DDD_TAMANHO_PERMITIDO)
            return true;
        this.errorMensagemEmPropriedadesValidacao = "DDD tamanho é maior que "+ DDD_TAMANHO_PERMITIDO;
        return false;
    }
    private Boolean DDDValoresPermitidos(){
        return DDD_VALORES_PERMITIDOS.stream()
                .anyMatch(this::compareDDDCorrenteComDDDPermitidos);

    }
    private Boolean isMobileFuncion(){
        if (DDDValido())
            return true;
        return false;
    }
    private Boolean numeroSemDDDValido(){
        if (isMobileFuncion())
            return this.telefoneSemDDDValido();
        return this.telefoneResidencialSemDDDValido();
    }

    private Boolean telefoneSemDDDValido(){
        return this.telefoneTamanhoValido() && this.telefonePrimeiroDigitoValido() && this.telefoneSegundoDigitoValido();
    }
    private Boolean telefoneResidencialSemDDDValido(){
        return this.telefoneResidencialSizeValido() && this.telefoneResidencialSegundoDigitoValido();
    }
    private Boolean telefoneResidencialSizeValido(){
        if(TAMANHO_TELEFONE_RESIDENCIAL_PERMITIDO.equals(this.numeroSemDDD.length()))
            return true;
        this.errorMensagemEmPropriedadesValidacao = "Telefone residencial (SEM DDD) não é valido";
        return false;
    }
    private Boolean telefoneResidencialSegundoDigitoValido(){
        return SEGUNDO_NUMERO_TELEFONE_RESIDENCIAL_PERMITIDO.stream()
                .anyMatch(this::compareSegundoDigitoTelefoneResidencialComValorPermitido);
    }
    private Boolean compareSegundoDigitoTelefoneResidencialComValorPermitido(String valorPermitido){
        var telefoneResidencialSemDDD = this.numeroSemDDD.substring(1,2);
        if (valorPermitido.equals(telefoneResidencialSemDDD))
            return true;
        this.errorMensagemEmPropriedadesValidacao = "Telefone residencial segundo digito não é valido";
        return false;
    }

    private Boolean telefoneTamanhoValido(){
        if(this.numeroSemDDD.length() == TAMANHO_NUMERO_PERMITIDO)
            return true;
        this.errorMensagemEmPropriedadesValidacao = "Telefone (SEM DDD) não válido";
        return false;
    }
    private Boolean telefonePrimeiroDigitoValido(){
        if(this.numeroSemDDD.startsWith(PRIMEIRO_NUMERO_TELEFONE_PERMITIDO))
            return true;
        this.errorMensagemEmPropriedadesValidacao = "Telfone primeiro digito não valido, tente começar com " + PRIMEIRO_NUMERO_TELEFONE_PERMITIDO;
        return false;
    }
    private Boolean telefoneSegundoDigitoValido(){
        return SEGUNDO_NUMERO_TELEFONE_PERMITIDO.stream()
                .anyMatch(this::compareSegundoDigitoComValorPermitido);
    }
    private Boolean compareSegundoDigitoComValorPermitido(String valorPermitido){
        var segundoDigitoDoNumeroSemDDD = this.numeroSemDDD.substring(1,2);
        if (valorPermitido.equals(segundoDigitoDoNumeroSemDDD))
            return true;
        this.errorMensagemEmPropriedadesValidacao = "Segundo digito" + segundoDigitoDoNumeroSemDDD + "não é valido";
        return false;
    }
    private boolean compareDDDCorrenteComDDDPermitidos(String valorPermitido){
        if (valorPermitido.equals(this.DDD))
            return true;
        this.errorMensagemEmPropriedadesValidacao = "Corrente DDD value ("+this.DDD+") não foi permitido";
        return false;
    }

    private void extrairDDD(){
        if (this.DDDNaoExtraidoAinda){
            this.DDD = this.numero.substring(0,2);
            this.numeroSemDDD = this.numero.substring(2);
            this.DDDNaoExtraidoAinda = false;
        }
    }

    @Override
    public Optional<String> pegarMensagemDeErroSePresente() {
        return Optional.ofNullable(this.errorMensagemEmPropriedadesValidacao);
    }
}
