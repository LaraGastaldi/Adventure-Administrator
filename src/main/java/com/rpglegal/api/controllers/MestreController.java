package com.rpglegal.api.controllers;

import com.rpglegal.api.domain.Mestre;
import com.rpglegal.api.domain.Personagem;
import com.rpglegal.api.services.MestreService;
import com.rpglegal.api.services.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/personagem")
public class MestreController {

    @Autowired
    MestreService service;

    @GetMapping
    public List<Mestre> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Mestre getByID(Long id) {
        return service.getById(id);
    }

    @PostMapping
    public void create(@RequestBody Mestre mestre) {
        service.saveOrUpdate(mestre);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Mestre mestre) {
        service.saveOrUpdate(mestre);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {
        service.delete(id);
    }
}
