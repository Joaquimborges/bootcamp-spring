package com.example.boocampspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CoverRomanosController {

    public int [] numeros = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    public String [] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    @GetMapping( value = "/coverRoman/{num}")
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
