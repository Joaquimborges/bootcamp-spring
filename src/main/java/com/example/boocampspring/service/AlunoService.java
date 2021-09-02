package com.example.boocampspring.service;

import com.example.boocampspring.models.aluno.Aluno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlunoService {

    private static List<Aluno> listaAlunos = new ArrayList<>();

    public AlunoService() {
    }

    public Aluno cadastrar(Aluno aluno) {
        listaAlunos.add(aluno);
        int idAluno = listaAlunos.size(); //id baseado no cumprimento da lista
        aluno.setId((long) idAluno); // inserção do id

        return aluno;
    }

    public List<Aluno> exibirAlunos(){

        return AlunoService.listaAlunos;

    }


    public Aluno get(Long id) {
        for(Aluno aluno : listaAlunos) {
            if (aluno.getId().equals(id)) {
                return aluno;
            }
        }
        return null;
    }





}
