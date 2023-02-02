package com.vinicius123131.entities.implementations.validation_rules;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BrazilianTelefoneValidacaoRule {

    public static final List<String> DDD_VALORES_PERMITIDOS = List.of(
            "61", "62", "64", "65", "66", "67", "82", "71", "73", "74", "75", "77",
            "85", "88", "98", "99", "83", "81", "87", "86", "89", "84", "79", "68", "96", "92",
            "97", "91", "93", "94", "69", "95", "63", "27", "28", "31", "32", "33", "34", "35",
            "37", "38", "21", "22", "24", "11", "12", "13", "14", "15", "16", "17", "18", "19",
            "41", "42", "43", "44", "45", "46", "51", "53", "54", "55", "47", "48", "49"
    );
    public static final Integer DDD_TAMANHO_PERMITIDO = 2;
    public static final Integer TAMANHO_NUMERO_PERMITIDO = 9;
    public static final Integer TAMANHO_TELEFONE_RESIDENCIAL_PERMITIDO = 8;
    public static final String PRIMEIRO_NUMERO_TELEFONE_PERMITIDO = "9";
    public static final List<String> SEGUNDO_NUMERO_TELEFONE_PERMITIDO = List.of(
            "6","7","8","9"
    );
    public static final List<String> SEGUNDO_NUMERO_TELEFONE_RESIDENCIAL_PERMITIDO = List.of(
            "2","3","4","5"
    );


}
