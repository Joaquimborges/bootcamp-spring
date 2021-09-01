package com.example.boocampspring.controllers;

import com.example.boocampspring.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/cliente")
    public List<Cliente> Cliente(){
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Paulo", 1, "Pedro@aa.com"));

        return clientes;

    }


}
