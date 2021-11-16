package com.example.consumingRestFulWS.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComentarioDTO {
    @JsonProperty("type")
    private String tipe;

    @JsonProperty("value")
    private ValorDTO valor;

    public ComentarioDTO(String tipe, ValorDTO valor) {
        this.tipe = tipe;
        this.valor = valor;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public ValorDTO getValor() {
        return valor;
    }

    public void setValor(ValorDTO valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ComentarioDTO{" +
                "tipe='" + tipe + '\'' +
                ", valor=" + valor +
                '}';
    }
}
