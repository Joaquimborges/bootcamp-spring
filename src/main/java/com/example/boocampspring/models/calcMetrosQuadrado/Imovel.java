package com.example.boocampspring.models.calcMetrosQuadrado;


import java.util.List;

public class Imovel {

    private String nome;
    private String endereco;
    private double tamanho;

    private List<Quartos> quartos;

    public List<Quartos> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quartos> quartos) {
        this.quartos = quartos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public Imovel() {
    }

    public Imovel(String nome, String endereco, double tamanho) {
        this.nome = nome;
        this.endereco = endereco;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", tamanho=" + tamanho +
                '}';
    }


}
