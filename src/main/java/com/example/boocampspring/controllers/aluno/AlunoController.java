package com.example.boocampspring.controllers.aluno;


import com.example.boocampspring.dto.AlunoDto;
import com.example.boocampspring.models.aluno.Aluno;
import com.example.boocampspring.service.AlunoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import java.net.URI;


@RequestMapping(value = "/alunos")
@RestController
public class AlunoController {

    private final AlunoService alunoService; //para nao precisar chamar diretamente a classe, injecao de dependencias

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping(value = "/criar")
    public ResponseEntity<AlunoDto> criar(@RequestBody AlunoDto alunoDto, UriComponentsBuilder uriBuilder) {
        Aluno aluno = alunoDto.converte(); //converter o aluno em dto
        Aluno alunoCadastrado = alunoService.cadastrar(aluno); //cadastra-lo na memoria

        URI uri = uriBuilder.path("alunos/{id}").buildAndExpand(alunoCadastrado.getId()).toUri();
        return ResponseEntity.created(uri).body(AlunoDto.converte(alunoCadastrado));
    }

    @GetMapping(value = "{id}")
    public AlunoDto buscar(@PathVariable Long id){
       Aluno aluno = alunoService.get(id); //validar o id no service
       AlunoDto alunoDto = null;
       if (aluno != null){
           alunoDto = AlunoDto.converte(aluno); //converter caso o aluno exista na memoria
       }

        return alunoDto;
    }

}
