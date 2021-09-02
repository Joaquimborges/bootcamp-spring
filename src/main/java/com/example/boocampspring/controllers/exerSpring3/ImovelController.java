package com.example.boocampspring.controllers.exerSpring3;


import com.example.boocampspring.models.calcMetrosQuadrado.Imovel;
import com.example.boocampspring.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/imovel")
@RestController
public class ImovelController {

    @Autowired
    private ImovelService imovelService;

    @PostMapping(value = "criar")
    public Imovel criar(@RequestBody Imovel imovel){
        imovel = ImovelService.criar(imovel);
        return imovel;
    }



}
