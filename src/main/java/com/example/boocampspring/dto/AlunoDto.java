package com.example.boocampspring.dto;

import com.example.boocampspring.models.aluno.Aluno;

import java.io.Serializable;
import java.time.LocalDate;

public class AlunoDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private String nome;
    private String sexo;
    private LocalDate dataNascimento;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public AlunoDto() {
    }

    public AlunoDto(String nome, String sexo, LocalDate dataNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public Aluno converte(){
        return new Aluno(this.nome, this.sexo, this.dataNascimento);
    }

    public static AlunoDto converte(Aluno aluno){

        return new AlunoDto(aluno.getNome(), aluno.getSexo(), aluno.getDataNascimento());
    }
}
