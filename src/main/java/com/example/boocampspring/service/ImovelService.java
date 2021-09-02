package com.example.boocampspring.service;

import com.example.boocampspring.models.calcMetrosQuadrado.Imovel;
import com.example.boocampspring.models.calcMetrosQuadrado.Quartos;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class ImovelService {

    private static List<Quartos> quartos = new ArrayList<>();


    public ImovelService() {

    }



    public static Imovel criar(Imovel imovel){

        return new Imovel(imovel.getNome(), imovel.getEndereco(), imovel.getTamanho());
    }

    public static double retornaMetrosImovel(Imovel imovel){
        double total = 0;
        quartos = imovel.getQuartos();
        for (Quartos tamanhoTot : quartos){
            total += tamanhoTot.getComprimento() * tamanhoTot.getLargura();

        }
        return total + imovel.getTamanho();
    }


    public static double valorImovel(Imovel imovel){
        final double precoMetroQuadrado = 800.0;
        double areaTot = retornaMetrosImovel(imovel);

        areaTot *= precoMetroQuadrado;

        return areaTot;
    }


    public static double retornaTotalMetrosQuartos(Imovel imovel){
        double total = 0;
        quartos = imovel.getQuartos();
        for (Quartos tamanhoTot : quartos){
            total += tamanhoTot.getComprimento() * tamanhoTot.getLargura();

        }
        return total;
    }




}
