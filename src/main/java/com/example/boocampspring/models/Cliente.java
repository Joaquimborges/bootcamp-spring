package com.example.boocampspring.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {

    private String nome;
    private int id;
    private String email;

    public Cliente(String nome, int id, String email) {
        this.nome = nome;
        this.id = id;
        this.email = email;
    }

    public Cliente() {
    }
}
