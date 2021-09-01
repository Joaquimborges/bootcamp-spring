package com.example.boocampspring.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CoverRomanosController {

    public int [] numeros = {100, 5, 10};
    public String [] roman = {"C", "V", "X"};

    public String romanos(@PathVariable int num){


        StringBuilder romanos = new StringBuilder();
        for (int i = 0; i < numeros.length; i++){
            while (num >= numeros[i]){
                num-=numeros[i];
                romanos.append(roman[i]);
            }
        }
        return romanos.toString();
    }



}
