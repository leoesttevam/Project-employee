package br.com.api.estudo.controllers;

import br.com.api.estudo.model.Funcionario;
import br.com.api.estudo.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "func")
public class FuncionarioControllers {
    private final FuncionarioService service;

    @Autowired
    public FuncionarioControllers(FuncionarioService service) {
        this.service = service;
    }

    @PostMapping(path = "postFuncionario")
    public void createdFuncionario(@RequestBody Funcionario funcionario) {

        service.createdFuncionario(funcionario);
    }
}
