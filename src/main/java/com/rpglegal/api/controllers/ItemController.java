package com.rpglegal.api.controllers;

import com.rpglegal.api.domain.Item;
import com.rpglegal.api.domain.Personagem;
import com.rpglegal.api.services.ItemService;
import com.rpglegal.api.services.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/item")
public class ItemController {

    @Autowired
    ItemService service;

    @GetMapping
    public List<Item> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Item getByID(Long id) {
        return service.getById(id);
    }

    @PostMapping
    public void create(@RequestBody Item item) {
        service.saveOrUpdate(item);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Item item) {
        service.saveOrUpdate(item);
    }

    @DeleteMapping("/{id}")
    public void delete(Long id) {
        service.delete(id);
    }
}
