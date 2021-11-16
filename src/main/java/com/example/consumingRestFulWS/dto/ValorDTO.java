package com.example.consumingRestFulWS.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ValorDTO {

    private Integer id;

    @JsonProperty("quote")
    private String comentario;

    public ValorDTO(Integer id, String comentario) {
        this.id = id;
        this.comentario = comentario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "ValorDTO{" +
                "id=" + id +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
