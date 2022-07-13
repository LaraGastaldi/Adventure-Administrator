package com.rpglegal.api.controllers;

import com.rpglegal.api.domain.Cena;
import com.rpglegal.api.domain.Personagem;
import com.rpglegal.api.services.CenaService;
import com.rpglegal.api.services.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cena")
public class CenaController {

    @Autowired
    CenaService service;

    @GetMapping
    public List<Cena> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Cena getByID(Long id) {
        return service.getById(id);
    }

    @PostMapping
    public void create(@RequestBody Cena cena) {
        service.saveOrUpdate(cena);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Cena cena) {
        service.saveOrUpdate(cena);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {
        service.delete(id);
    }

    @PostMapping("/{id}/associate-users")
    public void associateUsers(Long id, @RequestBody List<Long> user_ids) {
        service.associateUsers(id, user_ids);
    }
}
