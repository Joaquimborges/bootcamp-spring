package com.example.boocampspring.controllers;

import com.example.boocampspring.models.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @GetMapping("/cliente")
    public Cliente Cliente(){
        Cliente cliente = new Cliente();
        cliente.setNome("Pedro");
        cliente.setId(1);
        cliente.setEmail("pedro@gaaaa.com");

        return cliente;

    }
}
