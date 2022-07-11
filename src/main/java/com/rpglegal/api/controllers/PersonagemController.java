package com.rpglegal.api.controllers;

import com.rpglegal.api.domain.Personagem;
import com.rpglegal.api.services.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/personagem")
public class PersonagemController {

    @Autowired
    PersonagemService service;

    @GetMapping
    public List<Personagem> getAll() {
        return service.getAllPersonagens();
    }

    @GetMapping("/{id}")
    public Personagem getByID(Long id) {
        return service.getById(id);
    }

    @PostMapping
    public void create(@RequestBody Personagem personagem) {
        service.saveOrUpdate(personagem);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Personagem personagem) {
        service.saveOrUpdate(personagem);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {
        service.delete(id);
    }
}
