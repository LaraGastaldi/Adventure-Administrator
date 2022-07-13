package com.rpglegal.api.controllers;

import com.rpglegal.api.domain.Atributo;
import com.rpglegal.api.domain.Personagem;
import com.rpglegal.api.services.AtributoService;
import com.rpglegal.api.services.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/atributo")
public class AtributoController {

    @Autowired
    AtributoService service;

    @GetMapping
    public List<Atributo> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Atributo getByID(Long id) {
        return service.getById(id);
    }

    @PostMapping
    public void create(@RequestBody Atributo atributo) {
        service.saveOrUpdate(atributo);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Atributo atributo) {
        service.saveOrUpdate(atributo);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {
        service.delete(id);
    }
}
