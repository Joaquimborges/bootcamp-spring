package com.example.boocampspring.service;

import com.example.boocampspring.models.calcMetrosQuadrado.Imovel;
import com.example.boocampspring.models.calcMetrosQuadrado.Quartos;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
public class ImovelService {

    private static List<Imovel> imoveis = new ArrayList<>();
    private static List<Quartos> quartos = new ArrayList<>();


    public ImovelService() {

    }



    public static Imovel criar(Imovel imovel){

        imoveis.add(imovel);
        return imovel;
    }

    public static Double retornaMetrosImovel(String nome){
        for (Imovel imovel : imoveis){
            if (imovel.getNome().equals(nome)){
                return imovel.getTamanho();
            }
        }
        return null;
    }


    public static Double valorImovel(String nome){
       for (Imovel imovel : imoveis) {
            if (imovel.getNome().equals(nome)) {
                return imovel.getTamanho()*800;
            }
       }
       return null;
    }


    public static double RetornaTotalMetrosQuartos(Imovel imovel){
        double total = 0;
        quartos = imovel.getQuartos();
        for (Quartos tamanhoTot : quartos){
            total += tamanhoTot.getComprimento() * tamanhoTot.getLargura();

        }
        return total;
    }


    private static Quartos retornaMaiorQuarto(Imovel imovel)
    {
        quartos = imovel.getQuartos();

        Quartos q = quartos.stream()
                .max(Comparator
                .comparingDouble(x -> x.getComprimento() * x.getLargura()))
                .get();

        return q;
    }

    public static Quartos maiorQuarto(String nome) {
        for (Imovel imovel : imoveis) {
            if (imovel.getNome().equals(nome)){
                return ImovelService.retornaMaiorQuarto(imovel);
            }
        }
        return null;
    }


    private static String metrosquarto(Imovel imovel){
        String retorno = "";
        quartos = imovel.getQuartos();
        for (Quartos q : quartos){
            retorno += "nome: " + q.getNome() + " \t area: " + q.area() + "\n";
        }
        return retorno;
    }

    public static String areaPorQuarto(String nome) {
        for (Imovel imovel : imoveis) {
            if (imovel.getNome().equals(nome)) {
                return metrosquarto(imovel);
            }
        }
        return nome;
    }






}
